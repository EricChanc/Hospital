package com.example.entity;




/**
 * (Info)表实体类
 *
 * @author gaoyu
 * @since 2024-12-03 09:39:22
 */

public class Info  {

    private Long id;
//信息编号
    private String infoCode;
//信息名称
    private String infoName;
//资讯类型，关联数据字典表 1：健康科普 2：就诊须知 3：通知公告
    private Integer infoType;
//资讯图片
    private String infoPic;
//信息内容
    private String info;
//是否热门 1：热门 0：非热门 关联数据字典表
    private Integer isHot;
//创建时间
    private String createTime;
//创建人
    private Long createUser;
//最后修改时间
    private String updateTime;
//是否删除 1：已删除 0：未删除
    private Integer isDelete;

    private Integer version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    public String getInfoPic() {
        return infoPic;
    }

    public void setInfoPic(String infoPic) {
        this.infoPic = infoPic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

  
}

