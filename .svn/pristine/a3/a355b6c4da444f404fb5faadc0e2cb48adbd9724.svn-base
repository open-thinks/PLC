package com.openthinks.plc.core.model;

import java.util.Date;

public class PackTrack {
    private Long id;

    private Long shipId;

    private Long packId;

    private Date trackDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShipId() {
        return shipId;
    }

    public void setShipId(Long shipId) {
        this.shipId = shipId;
    }

    public Long getPackId() {
        return packId;
    }

    public void setPackId(Long packId) {
        this.packId = packId;
    }

    public Date getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(Date trackDate) {
        this.trackDate = trackDate;
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
        PackTrack other = (PackTrack) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShipId() == null ? other.getShipId() == null : this.getShipId().equals(other.getShipId()))
            && (this.getPackId() == null ? other.getPackId() == null : this.getPackId().equals(other.getPackId()))
            && (this.getTrackDate() == null ? other.getTrackDate() == null : this.getTrackDate().equals(other.getTrackDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShipId() == null) ? 0 : getShipId().hashCode());
        result = prime * result + ((getPackId() == null) ? 0 : getPackId().hashCode());
        result = prime * result + ((getTrackDate() == null) ? 0 : getTrackDate().hashCode());
        return result;
    }

    public static class Builder {
        private PackTrack obj;

        public Builder() {
            this.obj = new PackTrack();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder shipId(Long shipId) {
            obj.shipId = shipId;
            return this;
        }

        public Builder packId(Long packId) {
            obj.packId = packId;
            return this;
        }

        public Builder trackDate(Date trackDate) {
            obj.trackDate = trackDate;
            return this;
        }

        public PackTrack build() {
            return this.obj;
        }
    }
}