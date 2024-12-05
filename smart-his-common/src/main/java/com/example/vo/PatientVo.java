package com.example.vo;

public class PatientVo {
    private Long id;
    //就诊卡号
    private String cardNum;
    //登记号(院内码)
    private String regNum;
    //患者姓名
    private String patientName;
    //性别 1：男 2女
    private String  genderName;
    private Integer age;

    //就诊卡的二维码
    private String cardNumPic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCardNumPic() {
        return cardNumPic;
    }

    public void setCardNumPic(String cardNumPic) {
        this.cardNumPic = cardNumPic;
    }
}
