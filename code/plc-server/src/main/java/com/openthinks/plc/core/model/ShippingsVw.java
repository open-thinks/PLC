package com.openthinks.plc.core.model;

import java.util.Date;

public class ShippingsVw {
    private Long id;

    private Date shipDate;

    private Long vehicleId;

    private Long fromId;

    private Long toId;

    private Byte shipStatus;

    private Date createDate;

    private Date lastModify;

    private String fromName;

    private String fromLatitude;

    private String fromLongitude;

    private Byte fromCoordType;

    private Byte fromLocationType;

    private String fromProvince;

    private String fromCity;

    private String fromAddress;

    private String toName;

    private String toLatitude;

    private String toLongitude;

    private Byte toCoordType;

    private Byte toLocationType;

    private String toProvince;

    private String toCity;

    private String toAddress;

    private String shipStatusName;

    private String shipStatusDesc;

    private String vehicleNo;

    private String vehicleCompany;

    private String vehicleDriver;

    private Byte vehicleType;

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

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName == null ? null : fromName.trim();
    }

    public String getFromLatitude() {
        return fromLatitude;
    }

    public void setFromLatitude(String fromLatitude) {
        this.fromLatitude = fromLatitude == null ? null : fromLatitude.trim();
    }

    public String getFromLongitude() {
        return fromLongitude;
    }

    public void setFromLongitude(String fromLongitude) {
        this.fromLongitude = fromLongitude == null ? null : fromLongitude.trim();
    }

    public Byte getFromCoordType() {
        return fromCoordType;
    }

    public void setFromCoordType(Byte fromCoordType) {
        this.fromCoordType = fromCoordType;
    }

    public Byte getFromLocationType() {
        return fromLocationType;
    }

    public void setFromLocationType(Byte fromLocationType) {
        this.fromLocationType = fromLocationType;
    }

    public String getFromProvince() {
        return fromProvince;
    }

    public void setFromProvince(String fromProvince) {
        this.fromProvince = fromProvince == null ? null : fromProvince.trim();
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity == null ? null : fromCity.trim();
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    public String getToLatitude() {
        return toLatitude;
    }

    public void setToLatitude(String toLatitude) {
        this.toLatitude = toLatitude == null ? null : toLatitude.trim();
    }

    public String getToLongitude() {
        return toLongitude;
    }

    public void setToLongitude(String toLongitude) {
        this.toLongitude = toLongitude == null ? null : toLongitude.trim();
    }

    public Byte getToCoordType() {
        return toCoordType;
    }

    public void setToCoordType(Byte toCoordType) {
        this.toCoordType = toCoordType;
    }

    public Byte getToLocationType() {
        return toLocationType;
    }

    public void setToLocationType(Byte toLocationType) {
        this.toLocationType = toLocationType;
    }

    public String getToProvince() {
        return toProvince;
    }

    public void setToProvince(String toProvince) {
        this.toProvince = toProvince == null ? null : toProvince.trim();
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity == null ? null : toCity.trim();
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    public String getShipStatusName() {
        return shipStatusName;
    }

    public void setShipStatusName(String shipStatusName) {
        this.shipStatusName = shipStatusName == null ? null : shipStatusName.trim();
    }

    public String getShipStatusDesc() {
        return shipStatusDesc;
    }

    public void setShipStatusDesc(String shipStatusDesc) {
        this.shipStatusDesc = shipStatusDesc == null ? null : shipStatusDesc.trim();
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo == null ? null : vehicleNo.trim();
    }

    public String getVehicleCompany() {
        return vehicleCompany;
    }

    public void setVehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany == null ? null : vehicleCompany.trim();
    }

    public String getVehicleDriver() {
        return vehicleDriver;
    }

    public void setVehicleDriver(String vehicleDriver) {
        this.vehicleDriver = vehicleDriver == null ? null : vehicleDriver.trim();
    }

    public Byte getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Byte vehicleType) {
        this.vehicleType = vehicleType;
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
        ShippingsVw other = (ShippingsVw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShipDate() == null ? other.getShipDate() == null : this.getShipDate().equals(other.getShipDate()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getToId() == null ? other.getToId() == null : this.getToId().equals(other.getToId()))
            && (this.getShipStatus() == null ? other.getShipStatus() == null : this.getShipStatus().equals(other.getShipStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()))
            && (this.getFromName() == null ? other.getFromName() == null : this.getFromName().equals(other.getFromName()))
            && (this.getFromLatitude() == null ? other.getFromLatitude() == null : this.getFromLatitude().equals(other.getFromLatitude()))
            && (this.getFromLongitude() == null ? other.getFromLongitude() == null : this.getFromLongitude().equals(other.getFromLongitude()))
            && (this.getFromCoordType() == null ? other.getFromCoordType() == null : this.getFromCoordType().equals(other.getFromCoordType()))
            && (this.getFromLocationType() == null ? other.getFromLocationType() == null : this.getFromLocationType().equals(other.getFromLocationType()))
            && (this.getFromProvince() == null ? other.getFromProvince() == null : this.getFromProvince().equals(other.getFromProvince()))
            && (this.getFromCity() == null ? other.getFromCity() == null : this.getFromCity().equals(other.getFromCity()))
            && (this.getFromAddress() == null ? other.getFromAddress() == null : this.getFromAddress().equals(other.getFromAddress()))
            && (this.getToName() == null ? other.getToName() == null : this.getToName().equals(other.getToName()))
            && (this.getToLatitude() == null ? other.getToLatitude() == null : this.getToLatitude().equals(other.getToLatitude()))
            && (this.getToLongitude() == null ? other.getToLongitude() == null : this.getToLongitude().equals(other.getToLongitude()))
            && (this.getToCoordType() == null ? other.getToCoordType() == null : this.getToCoordType().equals(other.getToCoordType()))
            && (this.getToLocationType() == null ? other.getToLocationType() == null : this.getToLocationType().equals(other.getToLocationType()))
            && (this.getToProvince() == null ? other.getToProvince() == null : this.getToProvince().equals(other.getToProvince()))
            && (this.getToCity() == null ? other.getToCity() == null : this.getToCity().equals(other.getToCity()))
            && (this.getToAddress() == null ? other.getToAddress() == null : this.getToAddress().equals(other.getToAddress()))
            && (this.getShipStatusName() == null ? other.getShipStatusName() == null : this.getShipStatusName().equals(other.getShipStatusName()))
            && (this.getShipStatusDesc() == null ? other.getShipStatusDesc() == null : this.getShipStatusDesc().equals(other.getShipStatusDesc()))
            && (this.getVehicleNo() == null ? other.getVehicleNo() == null : this.getVehicleNo().equals(other.getVehicleNo()))
            && (this.getVehicleCompany() == null ? other.getVehicleCompany() == null : this.getVehicleCompany().equals(other.getVehicleCompany()))
            && (this.getVehicleDriver() == null ? other.getVehicleDriver() == null : this.getVehicleDriver().equals(other.getVehicleDriver()))
            && (this.getVehicleType() == null ? other.getVehicleType() == null : this.getVehicleType().equals(other.getVehicleType()));
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
        result = prime * result + ((getFromName() == null) ? 0 : getFromName().hashCode());
        result = prime * result + ((getFromLatitude() == null) ? 0 : getFromLatitude().hashCode());
        result = prime * result + ((getFromLongitude() == null) ? 0 : getFromLongitude().hashCode());
        result = prime * result + ((getFromCoordType() == null) ? 0 : getFromCoordType().hashCode());
        result = prime * result + ((getFromLocationType() == null) ? 0 : getFromLocationType().hashCode());
        result = prime * result + ((getFromProvince() == null) ? 0 : getFromProvince().hashCode());
        result = prime * result + ((getFromCity() == null) ? 0 : getFromCity().hashCode());
        result = prime * result + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        result = prime * result + ((getToName() == null) ? 0 : getToName().hashCode());
        result = prime * result + ((getToLatitude() == null) ? 0 : getToLatitude().hashCode());
        result = prime * result + ((getToLongitude() == null) ? 0 : getToLongitude().hashCode());
        result = prime * result + ((getToCoordType() == null) ? 0 : getToCoordType().hashCode());
        result = prime * result + ((getToLocationType() == null) ? 0 : getToLocationType().hashCode());
        result = prime * result + ((getToProvince() == null) ? 0 : getToProvince().hashCode());
        result = prime * result + ((getToCity() == null) ? 0 : getToCity().hashCode());
        result = prime * result + ((getToAddress() == null) ? 0 : getToAddress().hashCode());
        result = prime * result + ((getShipStatusName() == null) ? 0 : getShipStatusName().hashCode());
        result = prime * result + ((getShipStatusDesc() == null) ? 0 : getShipStatusDesc().hashCode());
        result = prime * result + ((getVehicleNo() == null) ? 0 : getVehicleNo().hashCode());
        result = prime * result + ((getVehicleCompany() == null) ? 0 : getVehicleCompany().hashCode());
        result = prime * result + ((getVehicleDriver() == null) ? 0 : getVehicleDriver().hashCode());
        result = prime * result + ((getVehicleType() == null) ? 0 : getVehicleType().hashCode());
        return result;
    }

    public static class Builder {
        private ShippingsVw obj;

        public Builder() {
            this.obj = new ShippingsVw();
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

        public Builder fromName(String fromName) {
            obj.fromName = fromName;
            return this;
        }

        public Builder fromLatitude(String fromLatitude) {
            obj.fromLatitude = fromLatitude;
            return this;
        }

        public Builder fromLongitude(String fromLongitude) {
            obj.fromLongitude = fromLongitude;
            return this;
        }

        public Builder fromCoordType(Byte fromCoordType) {
            obj.fromCoordType = fromCoordType;
            return this;
        }

        public Builder fromLocationType(Byte fromLocationType) {
            obj.fromLocationType = fromLocationType;
            return this;
        }

        public Builder fromProvince(String fromProvince) {
            obj.fromProvince = fromProvince;
            return this;
        }

        public Builder fromCity(String fromCity) {
            obj.fromCity = fromCity;
            return this;
        }

        public Builder fromAddress(String fromAddress) {
            obj.fromAddress = fromAddress;
            return this;
        }

        public Builder toName(String toName) {
            obj.toName = toName;
            return this;
        }

        public Builder toLatitude(String toLatitude) {
            obj.toLatitude = toLatitude;
            return this;
        }

        public Builder toLongitude(String toLongitude) {
            obj.toLongitude = toLongitude;
            return this;
        }

        public Builder toCoordType(Byte toCoordType) {
            obj.toCoordType = toCoordType;
            return this;
        }

        public Builder toLocationType(Byte toLocationType) {
            obj.toLocationType = toLocationType;
            return this;
        }

        public Builder toProvince(String toProvince) {
            obj.toProvince = toProvince;
            return this;
        }

        public Builder toCity(String toCity) {
            obj.toCity = toCity;
            return this;
        }

        public Builder toAddress(String toAddress) {
            obj.toAddress = toAddress;
            return this;
        }

        public Builder shipStatusName(String shipStatusName) {
            obj.shipStatusName = shipStatusName;
            return this;
        }

        public Builder shipStatusDesc(String shipStatusDesc) {
            obj.shipStatusDesc = shipStatusDesc;
            return this;
        }

        public Builder vehicleNo(String vehicleNo) {
            obj.vehicleNo = vehicleNo;
            return this;
        }

        public Builder vehicleCompany(String vehicleCompany) {
            obj.vehicleCompany = vehicleCompany;
            return this;
        }

        public Builder vehicleDriver(String vehicleDriver) {
            obj.vehicleDriver = vehicleDriver;
            return this;
        }

        public Builder vehicleType(Byte vehicleType) {
            obj.vehicleType = vehicleType;
            return this;
        }

        public ShippingsVw build() {
            return this.obj;
        }
    }
}