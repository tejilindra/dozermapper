package com.demo.dozermapper.vo;

public class AncillaryMerchandize {

    private int clientID;
    private int languageCode;
    private String pointOfSaleLocation;

    public AncillaryMerchandize() {
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(int languageCode) {
        this.languageCode = languageCode;
    }

    public String getPointOfSaleLocation() {
        return pointOfSaleLocation;
    }

    public void setPointOfSaleLocation(String pointOfSaleLocation) {
        this.pointOfSaleLocation = pointOfSaleLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AncillaryMerchandize)) return false;

        AncillaryMerchandize that = (AncillaryMerchandize) o;

        if (getClientID() != that.getClientID()) return false;
        if (getLanguageCode() != that.getLanguageCode()) return false;
        return getPointOfSaleLocation().equals(that.getPointOfSaleLocation());
    }

    @Override
    public int hashCode() {
        int result = getClientID();
        result = 31 * result + getLanguageCode();
        result = 31 * result + getPointOfSaleLocation().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AncillaryMerchandize{" +
                "clientID=" + clientID +
                ", primaryLangID=" + languageCode +
                ", pointOfSaleLocation='" + pointOfSaleLocation + '\'' +
                '}';
    }
}
