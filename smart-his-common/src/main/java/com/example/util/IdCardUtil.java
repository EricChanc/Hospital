package com.example.util;

import com.example.vo.IdCardInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdCardUtil {

    private static final Logger logger = LoggerFactory.getLogger(IdCardUtil.class);

    public static void main(String[] args){
        String birthday = "110106491204121";
        IdCardInfoVo infoByIdCard = getInfoByIdCard(birthday);
        System.out.println(infoByIdCard.getGender());
        System.out.println(infoByIdCard.getY()+"-"+infoByIdCard.getM()+"-"+infoByIdCard.getD());
    }
    public static IdCardInfoVo getInfoByIdCard(String idCard){
        IdCardInfoVo idCardInfoVo = new IdCardInfoVo();
        if(null == idCard || idCard.length()==0){
            logger.info("身份证号为空");
            return null;
        }
        if(idCard.length() != 15 && idCard.length() != 18){
            logger.info("身份证号为空");
            return null;
        }
        String y,m,d;

        Integer gender;
        if(idCard.length()==15){
            //15位身份证号
            //15位身份证号码：第7、8位为出生年份（两位数），第9、10位为出生月份，第11、12位代表出生日期，第15位代表性别，奇数为男，偶数为女。
            y = "19"+idCard.substring(6, 8);
            m = idCard.substring(8, 10);
            d = idCard.substring(10, 12);
            gender = Integer.parseInt(idCard.substring(14, 15));
            if (gender % 2 == 0) {
                //偶
                gender = 2;
            }else {
                gender=1;
            }
            idCardInfoVo.setY(y);
            idCardInfoVo.setM(m);
            idCardInfoVo.setD(d);
            idCardInfoVo.setGender(gender);
            return idCardInfoVo;

        }
        //18位身份证号
//        18位身份证号码：第7、8、9、10位为出生年份（四位数），第11、第12位为出生月份，第13、14位代表出生日期，第17位代表性别，奇数为男，偶数为女。
        y=idCard.substring(6,10);
        m = idCard.substring(10, 12);
        d = idCard.substring(12, 14);
        gender=Integer.parseInt(idCard.substring(16,17));
        gender=gender%2==0?2:1;
        idCardInfoVo.setY(y);
        idCardInfoVo.setM(m);
        idCardInfoVo.setD(d);
        idCardInfoVo.setGender(gender);
        return idCardInfoVo;
    }

}
