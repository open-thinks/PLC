package com.openthinks.plc.core.model;

import java.util.Date;

public class VehicleTrack {
    private Long id;

    private Long vehicleId;

    private String latitude;

    private String longitude;

    private Byte coordType;

    private Date trackTime;

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
            && (this.getTrackTime() == null ? other.getTrackTime() == null : this.getTrackTime().equals(other.getTrackTime()));
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

        public VehicleTrack build() {
            return this.obj;
        }
    }
}