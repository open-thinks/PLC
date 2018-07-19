package com.openthinks.plc.core.model;

import java.util.Date;

public class PacksVw {
    private Long id;

    private String supplier;

    private Byte packStatus;

    private Date createDate;

    private String packStatusName;

    private String packStatusDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Byte getPackStatus() {
        return packStatus;
    }

    public void setPackStatus(Byte packStatus) {
        this.packStatus = packStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPackStatusName() {
        return packStatusName;
    }

    public void setPackStatusName(String packStatusName) {
        this.packStatusName = packStatusName == null ? null : packStatusName.trim();
    }

    public String getPackStatusDesc() {
        return packStatusDesc;
    }

    public void setPackStatusDesc(String packStatusDesc) {
        this.packStatusDesc = packStatusDesc == null ? null : packStatusDesc.trim();
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
        PacksVw other = (PacksVw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplier() == null ? other.getSupplier() == null : this.getSupplier().equals(other.getSupplier()))
            && (this.getPackStatus() == null ? other.getPackStatus() == null : this.getPackStatus().equals(other.getPackStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getPackStatusName() == null ? other.getPackStatusName() == null : this.getPackStatusName().equals(other.getPackStatusName()))
            && (this.getPackStatusDesc() == null ? other.getPackStatusDesc() == null : this.getPackStatusDesc().equals(other.getPackStatusDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplier() == null) ? 0 : getSupplier().hashCode());
        result = prime * result + ((getPackStatus() == null) ? 0 : getPackStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getPackStatusName() == null) ? 0 : getPackStatusName().hashCode());
        result = prime * result + ((getPackStatusDesc() == null) ? 0 : getPackStatusDesc().hashCode());
        return result;
    }

    public static class Builder {
        private PacksVw obj;

        public Builder() {
            this.obj = new PacksVw();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder supplier(String supplier) {
            obj.supplier = supplier;
            return this;
        }

        public Builder packStatus(Byte packStatus) {
            obj.packStatus = packStatus;
            return this;
        }

        public Builder createDate(Date createDate) {
            obj.createDate = createDate;
            return this;
        }

        public Builder packStatusName(String packStatusName) {
            obj.packStatusName = packStatusName;
            return this;
        }

        public Builder packStatusDesc(String packStatusDesc) {
            obj.packStatusDesc = packStatusDesc;
            return this;
        }

        public PacksVw build() {
            return this.obj;
        }
    }
}