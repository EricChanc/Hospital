package com.example.client;

import com.example.client.impl.InfoClientImpl;
import com.example.dto.InfoPageDto;
import com.example.dto.PageDto;
import com.example.dto.Result;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import com.example.vo.MessageListVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@FeignClient(value = "info-provider",fallback = InfoClientImpl.class)
public interface InfoClient {
    @GetMapping("/info/queryBanner")
    public Result<List<InfoBannerVo>> queryBanner();

    //健康咨询信息列表
    @PostMapping("/info/queryInfoPage")
    public Result<PageDto<InfoPageVo>> queryInfoPage(@RequestBody InfoPageDto infoPageDto);

    /**
     * 获取授权信息列表
     */
    @GetMapping("/message/queryAll")
    public Result<List<MessageListVo>> queryAll();

}
