package com.example.entity;




/**
 * (Patient)表实体类
 *
 * @author gaoyu
 * @since 2024-12-03 12:15:18
 */

public class Patient  {

    private Long id;
//就诊卡号
    private String cardnum;
//登记号(院内码)
    private String regnum;
//患者姓名
    private String patientname;
//性别 1：男 2女
    private Integer gender;
//生日
    private String birthday;
//证件类型 data表id
    private Integer carType;
//国籍 data表id
    private Integer national;
//证件号
    private String idcard;
//婚姻状况 data表 id
    private Integer maritalType;
//手机号
    private String phone;
//单位名称
    private String company;
//民族 nation表id
    private Integer nationId;
//家庭地址
    private String address;
//职业
    private String occupation;
//省
    private Integer provinceId;
//市
    private Long cityId;
//区
    private Long areaId;
//联系人姓名
    private String contactName;
//联系电话
    private String contactPhone;
//创建时间
    private String createTime;

    private String updateTime;
//就诊卡的条码
    private String cardNumBarPic;
//就诊卡的二维码
    private String cardNumPic;
//登记号的条码
    private String regNumBarPic;
//登记号的二维码
    private String regNunPic;
//关联用户
    private Long userId;
//是否默认就诊人1：默认就诊人 0：非默认就诊人
    private Integer isDefault;

    private Integer isDelete;

    private Integer version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getNational() {
        return national;
    }

    public void setNational(Integer national) {
        this.national = national;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getMaritalType() {
        return maritalType;
    }

    public void setMaritalType(Integer maritalType) {
        this.maritalType = maritalType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCardNumBarPic() {
        return cardNumBarPic;
    }

    public void setCardNumBarPic(String cardNumBarPic) {
        this.cardNumBarPic = cardNumBarPic;
    }

    public String getCardNumPic() {
        return cardNumPic;
    }

    public void setCardNumPic(String cardNumPic) {
        this.cardNumPic = cardNumPic;
    }

    public String getRegNumBarPic() {
        return regNumBarPic;
    }

    public void setRegNumBarPic(String regNumBarPic) {
        this.regNumBarPic = regNumBarPic;
    }

    public String getRegNunPic() {
        return regNunPic;
    }

    public void setRegNunPic(String regNunPic) {
        this.regNunPic = regNunPic;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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

