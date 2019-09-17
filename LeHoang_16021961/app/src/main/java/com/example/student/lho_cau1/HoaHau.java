package com.example.student.lho_cau1;

public class HoaHau {

    private String hinhanhName;

    // Image name (Without extension)
    private String hoahauName;
    private int namSinh;

    public HoaHau(String hinhanhName, String hoahauName, int namSinh) {
        this.hinhanhName= hinhanhName;
        this.hoahauName= hoahauName;
        this.namSinh= namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getHoaHauName() {
        return hoahauName;
    }

    public void setHoahauName(String hoahauName) {
        this.hoahauName = hoahauName;
    }

    public String getHinhanhName() {
        return hinhanhName;
    }

    public void setHinhanhName(String hinhanhName) {
        this.hinhanhName = hinhanhName;
    }

    @Override
    public String toString()  {
        return this.hinhanhName+" (Population: "+ this.hinhanhName+")";
    }
}