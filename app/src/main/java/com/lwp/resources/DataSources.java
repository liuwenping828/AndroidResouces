package com.lwp.resources;

import com.lwp.resources.activity.ImageButtonVectorActivity;
import com.lwp.resources.activity.PermissionActivity;
import com.lwp.resources.activity.TimerActivity;

/**
 * Created by Administrator on 2018/3/19.
 */

public enum DataSources {
    TIMER_ACTIVITY(TimerActivity.class, TimerActivity.class.getSimpleName(),
            "定时"),
    IMAGEBUTTON_VECTOR_ACTIVITY(ImageButtonVectorActivity.class, ImageButtonVectorActivity.class.getSimpleName(),
            "ImageButton 中矢量图使用"),
    PMRMISSION_ACTIVITY(PermissionActivity.class,PermissionActivity.class.getSimpleName(),"request permission handle");

    private String activityName;
    private String activityDesc;
    private Class clazz;

    DataSources(Class clazz, String activityName, String activityDesc) {
        this.activityName = activityName;
        this.activityDesc = activityDesc;
        this.clazz = clazz;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public Class getClazz() {
        return clazz;
    }
}
