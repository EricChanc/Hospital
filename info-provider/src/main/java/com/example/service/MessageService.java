package com.example.service;

import com.alibaba.nacos.shaded.com.google.protobuf.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.vo.MessageListVo;

import java.util.List;

public interface MessageService extends IService<Message> {
    /**
     * 获取授权信息列表
     * @return
     */
    List<MessageListVo> queryAll();
}
