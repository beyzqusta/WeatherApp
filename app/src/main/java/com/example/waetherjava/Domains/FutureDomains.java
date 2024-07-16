package com.example.waetherjava.Domains;

public class FutureDomains {

    private String day;
    private String pickPath;
    private String status;
    private int highTemp;
    private int lowTemp;

    public FutureDomains(String day, String pickPath,String status,int highTemp,int lowTemp) {
        this.day = day;
        this.pickPath=pickPath;
        this.status=status;
        this.highTemp=highTemp;
        this.lowTemp=lowTemp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPickPath() {
        return pickPath;
    }

    public void setPickPath(String pickPath) {
        this.pickPath = pickPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }
}
