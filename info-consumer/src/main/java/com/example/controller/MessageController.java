package com.example.controller;


import com.example.client.InfoClient;
import com.example.dto.Result;
import com.example.vo.MessageListVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Resource
    private InfoClient infoClient;

    /**
     * 获取授权信息列表
     */
    @GetMapping("/queryAll")
    public Result<List<MessageListVo>> queryAll(){
        return infoClient.queryAll();
    }

}
