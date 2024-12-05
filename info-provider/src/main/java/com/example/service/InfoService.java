package com.example.service;

import com.example.dto.InfoDto;
import com.example.dto.InfoPageDto;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import com.example.vo.InfoVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Info)表服务接口
 *
 * @author gaoyu
 * @since 2024-12-03 09:39:23
 */
public interface InfoService extends IService<Info> {

    List<InfoBannerVo> queryBanner();

    //健康咨询信息列表
    Page<InfoPageVo> queryInfoPage(InfoPageDto infoPageDto);

    /**
     * 咨询信息列表（分页）
     */
    Page<InfoVo> queryPage(InfoDto infoDto);
}

