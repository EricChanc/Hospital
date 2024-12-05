package com.example.mapper;

import java.util.List;

import com.example.dto.InfoPageDto;
import com.example.vo.InfoPageVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import com.example.entity.Info;

/**
 * (Info)表数据库访问层
 * @author gaoyu
 * @since 2024-12-03 09:39:21
 */
public interface InfoMapper extends BaseMapper<Info> {

    //健康咨询信息列表
    Page<InfoPageVo> queryInfoPage(@Param("page") Page page,
                                   @Param("infoPageDto") InfoPageDto infoPageDto);

}

