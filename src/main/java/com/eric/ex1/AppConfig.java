package com.eric.ex1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig") // all props which start with config
public class AppConfig {

    private String appName;
    private String desc;
    private String adminFirst;
    private String adminLast;
    private String adminEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAdminFirst() {
        return adminFirst;
    }

    public void setAdminFirst(String adminFirst) {
        this.adminFirst = adminFirst;
    }

    public String getAdminLast() {
        return adminLast;
    }

    public void setAdminLast(String adminLast) {
        this.adminLast = adminLast;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "appName='" + appName + '\'' +
                ", desc='" + desc + '\'' +
                ", adminFirst='" + adminFirst + '\'' +
                ", adminLast='" + adminLast + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}

