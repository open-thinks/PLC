package com.openthinks.plc.core.model;

public class Dictionary {
    private Integer id;

    private String cateory;

    private String itemName;

    private Integer itemValue;

    private String itemDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateory() {
        return cateory;
    }

    public void setCateory(String cateory) {
        this.cateory = cateory == null ? null : cateory.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemValue() {
        return itemValue;
    }

    public void setItemValue(Integer itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
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
        Dictionary other = (Dictionary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCateory() == null ? other.getCateory() == null : this.getCateory().equals(other.getCateory()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getItemValue() == null ? other.getItemValue() == null : this.getItemValue().equals(other.getItemValue()))
            && (this.getItemDesc() == null ? other.getItemDesc() == null : this.getItemDesc().equals(other.getItemDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCateory() == null) ? 0 : getCateory().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemValue() == null) ? 0 : getItemValue().hashCode());
        result = prime * result + ((getItemDesc() == null) ? 0 : getItemDesc().hashCode());
        return result;
    }

    public static class Builder {
        private Dictionary obj;

        public Builder() {
            this.obj = new Dictionary();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder cateory(String cateory) {
            obj.cateory = cateory;
            return this;
        }

        public Builder itemName(String itemName) {
            obj.itemName = itemName;
            return this;
        }

        public Builder itemValue(Integer itemValue) {
            obj.itemValue = itemValue;
            return this;
        }

        public Builder itemDesc(String itemDesc) {
            obj.itemDesc = itemDesc;
            return this;
        }

        public Dictionary build() {
            return this.obj;
        }
    }
}