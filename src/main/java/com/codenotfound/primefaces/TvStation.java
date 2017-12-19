package com.codenotfound.primefaces;


public class TvStation
{
    public String station;
    public String web;
    public String isPrivate;

    public void setStation(String station) {
        this.station = station;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
    }


    public String getStation() {
        return station;
    }

    public String getWeb() {
        return web;
    }

    public String getIsPrivate() {
        return isPrivate;
    }



    public TvStation(String station, String web, String isPrivate)
    {
        this.station = station;
        this.web = web;
        this.isPrivate = isPrivate;
    }


}
