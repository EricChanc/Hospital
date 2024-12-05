package com.example.vo;

public class InfoPageVo {
    private Long id;
    private String infoName;
    private String infoPic;
    private String createTime;
    private String infoTypeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoPic() {
        return infoPic;
    }

    public void setInfoPic(String infoPic) {
        this.infoPic = infoPic;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getInfoTypeName() {
        return infoTypeName;
    }

    public void setInfoTypeName(String infoTypeName) {
        this.infoTypeName = infoTypeName;
    }
}
