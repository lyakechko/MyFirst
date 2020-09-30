package com.pvt;

public class Computer {
    private int id;
    private String name;
    private String OS;
    private boolean power;
    protected int coresCount;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public Computer(int id, String name, String OS, boolean power, int coresCount) {
        this.id = id;
        this.name = name;
        this.OS = OS;
        this.power = power;
        this.coresCount = coresCount;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", OS='" + OS + '\'' +
                ", power=" + power +
                ", coresCount=" + coresCount +
                '}';
    }
}