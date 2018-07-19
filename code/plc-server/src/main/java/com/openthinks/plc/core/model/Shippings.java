package com.openthinks.plc.core.model;

import java.util.Date;

public class Shippings {
    private Long id;

    private Date shipDate;

    private Long vehicleId;

    private Long fromId;

    private Long toId;

    private Byte shipStatus;

    private Date createDate;

    private Date lastModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Byte getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(Byte shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
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
        Shippings other = (Shippings) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShipDate() == null ? other.getShipDate() == null : this.getShipDate().equals(other.getShipDate()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getToId() == null ? other.getToId() == null : this.getToId().equals(other.getToId()))
            && (this.getShipStatus() == null ? other.getShipStatus() == null : this.getShipStatus().equals(other.getShipStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShipDate() == null) ? 0 : getShipDate().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getToId() == null) ? 0 : getToId().hashCode());
        result = prime * result + ((getShipStatus() == null) ? 0 : getShipStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastModify() == null) ? 0 : getLastModify().hashCode());
        return result;
    }

    public static class Builder {
        private Shippings obj;

        public Builder() {
            this.obj = new Shippings();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder shipDate(Date shipDate) {
            obj.shipDate = shipDate;
            return this;
        }

        public Builder vehicleId(Long vehicleId) {
            obj.vehicleId = vehicleId;
            return this;
        }

        public Builder fromId(Long fromId) {
            obj.fromId = fromId;
            return this;
        }

        public Builder toId(Long toId) {
            obj.toId = toId;
            return this;
        }

        public Builder shipStatus(Byte shipStatus) {
            obj.shipStatus = shipStatus;
            return this;
        }

        public Builder createDate(Date createDate) {
            obj.createDate = createDate;
            return this;
        }

        public Builder lastModify(Date lastModify) {
            obj.lastModify = lastModify;
            return this;
        }

        public Shippings build() {
            return this.obj;
        }
    }
}