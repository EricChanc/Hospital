package com.example.client.impl;

import com.example.client.InfoClient;
import com.example.dto.InfoPageDto;
import com.example.dto.PageDto;
import com.example.dto.Result;
import com.example.dto.ResultUtils;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import com.example.vo.MessageListVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InfoClientImpl implements InfoClient {
    private static final Logger logger = LoggerFactory.getLogger(InfoClientImpl.class);
    @Override
    public Result<List<InfoBannerVo>> queryBanner() {
        logger.info("容错，queryBanner");
        return ResultUtils.returnFail();
    }

    @Override
    public Result<PageDto<InfoPageVo>> queryInfoPage(InfoPageDto infoPageDto) {
        logger.info("容错，queryInfoPage");
        return ResultUtils.returnFail();

    }

    @Override
    public Result<List<MessageListVo>> queryAll() {
        logger.info("容错，queryAll");
        return ResultUtils.returnFail();
    }
}
