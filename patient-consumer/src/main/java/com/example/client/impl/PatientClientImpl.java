package com.example.client.impl;

import com.example.dto.Result;
import com.example.dto.ResultUtils;
import com.example.vo.PatientVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PatientClientImpl implements com.example.client.PatientClient {

    public static final Logger logger = LoggerFactory.getLogger(PatientClientImpl.class);

    @Override
    public Result<PatientVo> queryDefaultPatient(Long userId) {
        logger.info("容错, queryDefaultPatient");
        return ResultUtils.returnFail();
    }

    @Override
    public Result removePatient(Long patientId) {
        logger.info("容错, removePatient");
        return ResultUtils.returnFail();
    }
}
