package com.example.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vo.PatientVo;
import org.apache.ibatis.annotations.Param;
import com.example.entity.Patient;

/**
 * (Patient)表数据库访问层
 *
 * @author gaoyu
 * @since 2024-12-03 12:15:18
 */
public interface PatientMapper extends BaseMapper<Patient> {

    PatientVo queryDefaultPatient(Long userId);


}

