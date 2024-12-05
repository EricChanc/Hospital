package com.example.dto;

public class DataCommon {
    //JWT失效时长 3天
    public static final Integer JWT_TIMOUT=3;
    //活动相关
    /**
     * 街道活动
     */
    public static final Integer activity_type_1=1;
    /**
     * 机关活动
     */
    public static final Integer activity_type_2=2;
    /**
     * 两新活动
     */
    public static final Integer activity_type_3=3;

    /**
     * 已申请
     */
    public static final Integer activity_status_1=1;

    /**
     * 审核通过
     */
    public static final Integer activity_status_2=2;
    /**
     * 进行中
     */
    public static final Integer activity_status_3=3;
    /**
     * 已结束
     */
    public static final Integer activity_status_4=4;

    /**
     * 审核不通过
     */
    public static final Integer activity_status_5=5;

    //心愿状态
    /**
     * 已发布
     */
    public static final Integer WISH_STATE_1=1;

    /**
     * 已认领
     */
    public static final Integer WISH_STATE_2=2;

    /**
     * 已兑现
     */
    public static final Integer WISH_STATE_3=3;
}
