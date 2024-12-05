package com.example.service.impl;

import com.example.dto.Common;
import com.example.dto.InfoDto;
import com.example.dto.InfoPageDto;
import com.example.vo.InfoBannerVo;
import com.example.vo.InfoPageVo;
import com.example.vo.InfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.InfoMapper;
import com.example.entity.Info;
import com.example.service.InfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Info)表服务实现类
 *
 * @author gaoyu
 * @since 2024-12-03 09:39:23
 */
@Service("infoService")
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService {

    @Resource
    private InfoMapper infoMapper;

    @Override
    public List<InfoBannerVo> queryBanner() {
        QueryWrapper<Info> infoQueryWrapper = new QueryWrapper<>();
        infoQueryWrapper.select("id", "info_name", "info_pic");
        infoQueryWrapper.eq("is_hot", Common.IS_HOT);
        List<Info> list = this.list(infoQueryWrapper);
        if (null == list) {
            return null;
        }
        List<InfoBannerVo> resultList = new ArrayList<>();
        for (Info info : list) {
            InfoBannerVo infoBannerVo = new InfoBannerVo();
            BeanUtils.copyProperties(info, infoBannerVo);
            resultList.add(infoBannerVo);
        }
        return resultList;
    }

    @Override
    public Page<InfoPageVo> queryInfoPage(InfoPageDto infoPageDto) {
        Page page = new Page();
        BeanUtils.copyProperties(infoPageDto,page);
        Page<InfoPageVo> infoPageVoPage = infoMapper.queryInfoPage(page, infoPageDto);
        return infoPageVoPage;
    }

    @Override
    public Page<InfoVo> queryPage(InfoDto infoDto) {
        QueryWrapper<Info> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","info_name","info","create_time");
        //infoType==-1代表查询所以类型的咨询信息
        if (null!=infoDto.getInfoType()&&infoDto.getInfoType() != -1) {
            queryWrapper.eq("info_type", infoDto.getInfoType());
        }
        if (null != infoDto.getInfoName() && !"".equals(infoDto.getInfoName())) {
            queryWrapper.like("info_name", infoDto.getInfoName());
        }
        Page page = new Page();
        BeanUtils.copyProperties(infoDto,page);
        Page<Info> result = this.page(page, queryWrapper);
        if (null == result) {
            return null;
        }
        Page<InfoVo> resultPage = new Page<InfoVo>();
        BeanUtils.copyProperties(result,resultPage);
        List<Info> records = result.getRecords();
        List<InfoVo> infoVoList=null;
        if (null != records) {
            infoVoList=new ArrayList<>();
            for (Info info : records) {
                InfoVo infoVo = new InfoVo();
                infoVo.setId(info.getId());
                infoVo.setInfoName(info.getInfoName());
                infoVo.setInfo(info.getInfo());
                infoVo.setCreateTime(info.getCreateTime());
                infoVoList.add(infoVo);
            }
        }
        resultPage.setRecords(infoVoList);
        return resultPage;
    }
}

