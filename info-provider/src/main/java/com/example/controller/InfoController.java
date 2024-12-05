package com.example.controller;



import com.example.dto.*;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import com.example.vo.InfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.Info;
import com.example.service.InfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Info)表控制层
 *
 * @author gaoyu
 * @since 2024-12-03 09:39:20
 */
@RestController
@RequestMapping("/info")
public class InfoController  {
    /**
     * 服务对象
     */
    @Resource
    private InfoService infoService;

    @GetMapping("/queryBanner")
    public Result<List<InfoBannerVo>> queryBanner() {
        List<InfoBannerVo> infoBannerVos = infoService.queryBanner();
        if (null == infoBannerVos) {
            return ResultUtils.returnResult(ResultEnum.FAIL_HAVE_NOT_EXIST);
        }
        return ResultUtils.returnDataSuccess(infoBannerVos);
    }
    //健康咨询信息列表
    @PostMapping("/queryInfoPage")
    public Result<PageDto<InfoPageVo>> queryInfoPage(@RequestBody InfoPageDto infoPageDto){
        Page<InfoPageVo> infoPageVoPage = infoService.queryInfoPage(infoPageDto);
        if (null == infoPageVoPage || infoPageVoPage.getTotal() == 0) {
            return ResultUtils.returnResult(ResultEnum.FAIL_HAVE_NOT_EXIST);
        }
        PageDto<InfoPageVo> infoPageVoPageDto = new PageDto<>();
        BeanUtils.copyProperties(infoPageVoPage,infoPageVoPageDto);
        return ResultUtils.returnDataSuccess(infoPageVoPageDto);
    }

    @PostMapping("/queryPage")
    public Result<PageDto<InfoVo>> queryPage(@RequestBody InfoDto infoDto) {
        Page<InfoVo> infoVoPage = infoService.queryPage(infoDto);
        if (null == infoVoPage || infoVoPage.getTotal() == 0) {
            return ResultUtils.returnResult(ResultEnum.FAIL_HAVE_NOT_EXIST);
        }
        PageDto<InfoVo> infoVoPageDto = new PageDto<>();
        BeanUtils.copyProperties(infoVoPage,infoVoPageDto);
        return ResultUtils.returnDataSuccess(infoVoPageDto);
    }

}

