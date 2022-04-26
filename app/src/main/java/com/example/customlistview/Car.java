package com.example.customlistview;

public class Car{
     int img;
     String carname;
     String carcname;

    public Car(int img, String carname, String carcname) {
        this.img = img;
        this.carname = carname;
        this.carcname = carcname;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcname() {
        return carcname;
    }

    public void setCarcname(String carcname) {
        this.carcname = carcname;
    }
}
