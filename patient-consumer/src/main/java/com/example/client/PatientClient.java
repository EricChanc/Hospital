package com.example.client;

import com.example.client.impl.PatientClientImpl;
import com.example.dto.Result;
import com.example.vo.PatientVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "patient-provider",fallback = PatientClientImpl.class)
public interface PatientClient {

    @GetMapping("/patient/queryDefaultPatient")
    public Result<PatientVo> queryDefaultPatient(@RequestParam("userId") Long userId);

    //删除就诊人
    @GetMapping("/patient/removePatient")
    public Result removePatient(@RequestParam("patientId") Long patientId);

}
