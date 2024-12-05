package com.example.util;

import com.example.dto.DataCommon;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Map;
import java.util.Set;

@Component
public class JWTUtil {
    private static final Logger logger = LoggerFactory.getLogger(JWTUtil.class);
    @Value("${jwt.secret:ENC(7653HeMj2GEXuAxb9mFS9WozO+LexLLv)}")
    private String secret  ;

    /**
     *
     * @param map 载荷内容 “username”:"zhanghao","role":1
     *  令牌失效 3天
     * @return
     */
    public String createToken(Map<String, String> map) {
        String token=null;
        JWTCreator.Builder builder = JWT.create();
        //解析map
        if (null == map || map.size() == 0) {
            logger.info("载荷内容为空");
            return token;
        }
        //获取map中所有的key
        Set<String> keys = map.keySet();
        //遍历key获取value
        for (String key : keys) {
            String value = map.get(key);
            builder.withClaim(key, value);
        }
        //令牌超时（3天超时）
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_YEAR, DataCommon.JWT_TIMOUT);
        builder.withExpiresAt(instance.getTime());
        token = builder.sign(Algorithm.HMAC256(secret));
        return token;
    }

    /**
     * 验证令牌是否有效
     * 如果验证失败抛异常
     */
    public void check(String token) {
        Verification require = JWT.require(Algorithm.HMAC256(secret));
        JWTVerifier build = require.build();
        DecodedJWT decodedJWT = build.verify(token);
    }

    /**
     * 解析令牌中载荷的内容
     */
    public Map<String, Claim> getValueByToken(String token) {
        Verification require = JWT.require(Algorithm.HMAC256(secret));
        JWTVerifier build = require.build();
        DecodedJWT decodedJWT = build.verify(token);
        Map<String, Claim> claims = decodedJWT.getClaims();
        return claims;
    }
}
