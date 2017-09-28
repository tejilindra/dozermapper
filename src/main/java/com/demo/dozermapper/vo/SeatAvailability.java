package com.demo.dozermapper.vo;

public class SeatAvailability {

    private int version;
    private int primaryLangID;
    private PointOfSale pos;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPrimaryLangID() {
        return primaryLangID;
    }

    public void setPrimaryLangID(int primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    public PointOfSale getPos() {
        return pos;
    }

    public void setPos(PointOfSale pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeatAvailability)) return false;

        SeatAvailability that = (SeatAvailability) o;

        if (getVersion() != that.getVersion()) return false;
        if (getPrimaryLangID() != that.getPrimaryLangID()) return false;
        return getPos().equals(that.getPos());
    }

    @Override
    public int hashCode() {
        int result = getVersion();
        result = 31 * result + getPrimaryLangID();
        result = 31 * result + getPos().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SeatAvailability{" +
                "version=" + version +
                ", primaryLangID=" + primaryLangID +
                ", pos=" + pos +
                '}';
    }
}
