package com.example.waetherjava.Domains;

public class Hurly {

    private String hour;
    private int temp;
    private String pickpath;

    public Hurly(String hour, int temp, String pickpath) {
        this.hour = hour;
        this.temp=temp;
        this.pickpath=pickpath;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPickpath() {
        return pickpath;
    }

    public void setPickpath(String pickpath) {
        this.pickpath = pickpath;
    }
}
