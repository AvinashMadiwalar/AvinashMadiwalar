package com.vehicle.data.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document
public class Acceleration {
    @Id
    private Long id;
    private Long obdData_id;
    private Long trip_id;
    private Long obdPid;
    private Long data;
    private Date timestamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getObdData_id() {
        return obdData_id;
    }

    public void setObdData_id(Long obdData_id) {
        this.obdData_id = obdData_id;
    }

    public Long getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(Long trip_id) {
        this.trip_id = trip_id;
    }

    public Long getObdPid() {
        return obdPid;
    }

    public void setObdPid(Long obdPid) {
        this.obdPid = obdPid;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
