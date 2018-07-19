package com.openthinks.plc.core.model;

import java.util.Date;

public class Locations {
    private Long id;

    private String name;

    private String province;

    private String city;

    private String address;

    private String latitude;

    private String longitude;

    private Byte coordType;

    private Byte locationType;

    private Date createDate;

    private Date lastModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Byte getLocationType() {
        return locationType;
    }

    public void setLocationType(Byte locationType) {
        this.locationType = locationType;
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
        Locations other = (Locations) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getCoordType() == null ? other.getCoordType() == null : this.getCoordType().equals(other.getCoordType()))
            && (this.getLocationType() == null ? other.getLocationType() == null : this.getLocationType().equals(other.getLocationType()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getCoordType() == null) ? 0 : getCoordType().hashCode());
        result = prime * result + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastModify() == null) ? 0 : getLastModify().hashCode());
        return result;
    }

    public static class Builder {
        private Locations obj;

        public Builder() {
            this.obj = new Locations();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder name(String name) {
            obj.name = name;
            return this;
        }

        public Builder province(String province) {
            obj.province = province;
            return this;
        }

        public Builder city(String city) {
            obj.city = city;
            return this;
        }

        public Builder address(String address) {
            obj.address = address;
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

        public Builder locationType(Byte locationType) {
            obj.locationType = locationType;
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

        public Locations build() {
            return this.obj;
        }
    }
}