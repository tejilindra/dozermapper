package com.demo.dozermapper.vo;

public class Location {

    private String countryCode;
    private String cityCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (!getCountryCode().equals(location.getCountryCode())) return false;
        return getCityCode().equals(location.getCityCode());
    }

    @Override
    public int hashCode() {
        int result = getCountryCode().hashCode();
        result = 31 * result + getCityCode().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "countryCode='" + countryCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }

}
