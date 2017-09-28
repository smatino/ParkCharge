package com.parkcharge.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.util.Date;

/**
 * Created by smatino on 28/08/2017.
 */
public class SearchDTO {

    @NotEmpty
    @NotNull
    private Double latitude;
    @NotEmpty
    @NotNull
    private Double longitude;

    @NotEmpty
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" ,timezone = "GMT")
    private Date dataDa;


    @NotEmpty
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT")
    private Date dataA;

    @NotEmpty
    @NotNull
    private Float distance;


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Date getDataDa() {
        return dataDa;
    }

    public void setDataDa(Date dataDa) {
        this.dataDa = dataDa;
    }

    public Date getDataA() {
        return dataA;
    }

    public void setDataA(Date dataA) {
        this.dataA = dataA;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
