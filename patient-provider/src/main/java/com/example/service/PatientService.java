package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Patient;
import com.example.vo.PatientVo;

/**
 * (Patient)表服务接口
 *
 * @author gaoyu
 * @since 2024-12-03 12:15:19
 */
public interface PatientService extends IService<Patient> {

    //查询用户绑定的默认就诊人
    PatientVo queryDefaultPatient(Long userId);

    //删除就诊人
    void removePatient(Long patientId);
}

