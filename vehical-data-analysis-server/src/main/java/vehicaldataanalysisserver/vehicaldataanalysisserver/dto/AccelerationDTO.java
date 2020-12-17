package vehicaldataanalysisserver.vehicaldataanalysisserver.dto;

import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.Acceleration;

import java.math.BigInteger;
import java.util.Date;

public class AccelerationDTO {

    private BigInteger id;
    private int tripId;
    private String obdPid;
    private int data;
    private Date timeStamp;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
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

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public static AccelerationDTO convertToDto(Acceleration acceleration) {
        AccelerationDTO accelerationDTO = new AccelerationDTO();
        accelerationDTO.setId(acceleration.get_id());
        accelerationDTO.setTripId(acceleration.getTrip_id());
        accelerationDTO.setObdPid(acceleration.getObdPid());
        accelerationDTO.setData(acceleration.getData());
        accelerationDTO.setTimeStamp(acceleration.getTimestamp());
        return accelerationDTO;
    }
}
