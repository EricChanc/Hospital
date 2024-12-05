package com.example.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dto.Result;
import com.example.dto.ResultEnum;
import com.example.dto.ResultUtils;
import com.example.entity.Patient;
import com.example.service.PatientService;
import com.example.vo.PatientVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Patient)表控制层
 *
 * @author gaoyu
 * @since 2024-12-03 12:15:17
 */
@RestController
@RequestMapping("patient")
public class PatientController  {
    /**
     * 服务对象
     */
    @Resource
    private PatientService patientService;

    @GetMapping("/queryDefaultPatient")
    public Result<PatientVo> queryDefaultPatient(@RequestParam("userId") Long userId) {
        PatientVo patientVo = patientService.queryDefaultPatient(userId);
        if(null == patientVo){
            return ResultUtils.returnResult(ResultEnum.FAIL_HAVE_NOT_EXIST);
        }
        return ResultUtils.returnDataSuccess(patientVo);
    }
    //删除就诊人
    @GetMapping("/removePatient")
    public Result removePatient(@RequestParam("patientId")
                                    Long patientId) {
        patientService.removePatient(patientId);
        return ResultUtils.returnSuccess();
    }




}

