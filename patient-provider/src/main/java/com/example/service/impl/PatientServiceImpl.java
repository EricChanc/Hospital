package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.PatientMapper;
import com.example.entity.Patient;
import com.example.service.PatientService;
import com.example.vo.PatientVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Patient)表服务实现类
 *
 * @author gaoyu
 * @since 2024-12-03 12:15:19
 */
@Service("patientService")
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {

    @Resource
    private PatientMapper patientMapper;
    @Override
    public PatientVo queryDefaultPatient(Long userId) {
        return patientMapper.queryDefaultPatient(userId);
    }

    @Override
    public void removePatient(Long patientId) {
        this.removeById(patientId);
    }
}

