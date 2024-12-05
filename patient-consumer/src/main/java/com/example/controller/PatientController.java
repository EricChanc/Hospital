package com.example.controller;


import com.example.client.PatientClient;
import com.example.dto.Result;
import com.example.vo.PatientVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Resource
    private PatientClient patientClient;

    /**
     * 查询用户绑定的默认就诊人信息
     */
    @GetMapping("/queryDefaultPatient")
    public Result<PatientVo> queryDefaultPatient(Long userId) {
        return patientClient.queryDefaultPatient(userId);
    }

    @GetMapping("/removePatient")
    public Result removePatient(Long patientId) {
        return patientClient.removePatient(patientId);
    }


}
