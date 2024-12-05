package com.example.service.impl;

import com.alibaba.nacos.shaded.com.google.protobuf.Message;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.service.MessageService;
import com.example.vo.MessageListVo;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.function.Function;

public class MessageServiceImpl implements MessageService {

    @Override
    public List<MessageListVo> queryAll() {
        QueryWrapper<Message> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("message_code","message_title");
        List<Message> list = this.list(queryWrapper);
        if(null == list||list.size()==0 ){
            return null;
        }
        List<MessageListVo> messageListVos = new ArrayList<>();
        for (Message message : list) {
            MessageListVo messageListVo = new MessageListVo();
            BeanUtils.copyProperties(message,messageListVo);
            messageListVos.add(messageListVo);
        }
        return messageListVos;
    }

    @Override
    public boolean saveBatch(Collection<Message> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Message> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Message> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Message entity) {
        return false;
    }

    @Override
    public Message getOne(Wrapper<Message> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Optional<Message> getOneOpt(Wrapper<Message> queryWrapper, boolean throwEx) {
        return Optional.empty();
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Message> queryWrapper) {
        return Collections.emptyMap();
    }

    @Override
    public <V> V getObj(Wrapper<Message> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Message> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Message> getEntityClass() {
        return null;
    }
}
