package com.vehicle.data.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document
public class Acceleration {
    @Id
    private long id;
    private int obdData_id;
    private int trip_id;
    private String obdPid;
    private int data;
    private Date timestamp;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getObdData_id() {
        return obdData_id;
    }

    public void setObdData_id(int obdData_id) {
        this.obdData_id = obdData_id;
    }

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getObdPid() {
        return obdPid;
    }

    public void setObdPid(String obdPid) {
        this.obdPid = obdPid;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Acceleration(long id, int obdData_id, int trip_id, String obdPid, int data, Date timestamp) {
        this.id = id;
        this.obdData_id = obdData_id;
        this.trip_id = trip_id;
        this.obdPid = obdPid;
        this.data = data;
        this.timestamp = timestamp;
    }
}
