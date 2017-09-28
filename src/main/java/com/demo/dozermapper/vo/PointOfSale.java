package com.demo.dozermapper.vo;

public class PointOfSale {

    private int id;
    private Location location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointOfSale)) return false;

        PointOfSale that = (PointOfSale) o;

        if (getId() != that.getId()) return false;
        return getLocation().equals(that.getLocation());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getLocation().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PointOfSale{" +
                "id=" + id +
                ", location=" + location +
                '}';
    }
}
