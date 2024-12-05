package com.example.controller;

import com.example.client.InfoClient;
import com.example.dto.InfoPageDto;
import com.example.dto.PageDto;
import com.example.dto.Result;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Resource
    private InfoClient infoClient;

    /**
     * 获取banner信息列表
     * @return
     */
    @GetMapping("/queryBanner")
    public Result<List<InfoBannerVo>> queryBanner(){
        return infoClient.queryBanner();
    }



    /**
     * 健康咨询信息列表
     * @param infoPageDto
     * @return
     */
    @PostMapping("/queryInfoPage")
    public Result<PageDto<InfoPageVo>> queryInfoPage(@RequestBody InfoPageDto infoPageDto){
        return infoClient.queryInfoPage(infoPageDto);
    }
}
