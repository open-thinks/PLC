package com.openthinks.plc.core.model;

import java.util.Date;

public class VehicleTrack {
    private Long id;

    private Long vehicleId;

    private String latitude;

    private String longitude;

    private Byte coordType;

    private Date trackTime;

    private String yali;

    private String temp;

    private String shidu;

    private Integer doorState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Byte getCoordType() {
        return coordType;
    }

    public void setCoordType(Byte coordType) {
        this.coordType = coordType;
    }

    public Date getTrackTime() {
        return trackTime;
    }

    public void setTrackTime(Date trackTime) {
        this.trackTime = trackTime;
    }

    public String getYali() {
        return yali;
    }

    public void setYali(String yali) {
        this.yali = yali == null ? null : yali.trim();
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu == null ? null : shidu.trim();
    }

    public Integer getDoorState() {
        return doorState;
    }

    public void setDoorState(Integer doorState) {
        this.doorState = doorState;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VehicleTrack other = (VehicleTrack) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getCoordType() == null ? other.getCoordType() == null : this.getCoordType().equals(other.getCoordType()))
            && (this.getTrackTime() == null ? other.getTrackTime() == null : this.getTrackTime().equals(other.getTrackTime()))
            && (this.getYali() == null ? other.getYali() == null : this.getYali().equals(other.getYali()))
            && (this.getTemp() == null ? other.getTemp() == null : this.getTemp().equals(other.getTemp()))
            && (this.getShidu() == null ? other.getShidu() == null : this.getShidu().equals(other.getShidu()))
            && (this.getDoorState() == null ? other.getDoorState() == null : this.getDoorState().equals(other.getDoorState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getCoordType() == null) ? 0 : getCoordType().hashCode());
        result = prime * result + ((getTrackTime() == null) ? 0 : getTrackTime().hashCode());
        result = prime * result + ((getYali() == null) ? 0 : getYali().hashCode());
        result = prime * result + ((getTemp() == null) ? 0 : getTemp().hashCode());
        result = prime * result + ((getShidu() == null) ? 0 : getShidu().hashCode());
        result = prime * result + ((getDoorState() == null) ? 0 : getDoorState().hashCode());
        return result;
    }

    public static class Builder {
        private VehicleTrack obj;

        public Builder() {
            this.obj = new VehicleTrack();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder vehicleId(Long vehicleId) {
            obj.vehicleId = vehicleId;
            return this;
        }

        public Builder latitude(String latitude) {
            obj.latitude = latitude;
            return this;
        }

        public Builder longitude(String longitude) {
            obj.longitude = longitude;
            return this;
        }

        public Builder coordType(Byte coordType) {
            obj.coordType = coordType;
            return this;
        }

        public Builder trackTime(Date trackTime) {
            obj.trackTime = trackTime;
            return this;
        }

        public Builder yali(String yali) {
            obj.yali = yali;
            return this;
        }

        public Builder temp(String temp) {
            obj.temp = temp;
            return this;
        }

        public Builder shidu(String shidu) {
            obj.shidu = shidu;
            return this;
        }

        public Builder doorState(Integer doorState) {
            obj.doorState = doorState;
            return this;
        }

        public VehicleTrack build() {
            return this.obj;
        }
    }
}