package com.nc.autumn2020.solutions.lesson3;



public class Pc {
    //обязательные
    private String operation_system;
    private String cpu;
    private short ssd_gb;
    //не обязательные
    private short ram;
    private short graphic_cards_mb;
    private String color;


    private Pc(Builder builder) {
        this.operation_system = builder.operation_system;
        this.cpu = builder.cpu;
        this.ssd_gb = builder.ssd_gb;
        this.ram = builder.ram;
        this.graphic_cards_mb = builder.graphic_cards_mb;
        this.color = builder.color;
    }

    public static class Builder {
        private String operation_system;
        private String cpu;
        private short ssd_gb;
        //не обязательные
        private short ram = 0;
        private short graphic_cards_mb = 0;
        private String color = "black";

        public Builder (String operation_system, String cpu, short ssd_gb) {
            this.operation_system = operation_system;
            this.cpu = cpu;
            this.ssd_gb = ssd_gb;
        }

        public Builder ram(short ram) {
            this.ram = ram;
            return this;
        }

        public Builder graphic_cards_mb(short graphic_cards_mb) {
            this.graphic_cards_mb = graphic_cards_mb;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Pc build(){
            return new Pc(this);
        }
    }

    public String getOperation_system() {
        return operation_system;
    }

    public void setOperation_system(String operation_system) {
        this.operation_system = operation_system;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public short getSsd_gb() {
        return ssd_gb;
    }

    public void setSsd_gb(short ssd_gb) {
        this.ssd_gb = ssd_gb;
    }

    public short getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public short getGraphic_cards_mb() {
        return graphic_cards_mb;
    }

    public void setGraphic_cards_mb(short graphic_cards_mb) {
        this.graphic_cards_mb = graphic_cards_mb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "operation_system='" + operation_system + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ssd_gb=" + ssd_gb +
                ", ram=" + ram +
                ", graphic_cards_mb=" + graphic_cards_mb +
                ", color='" + color + '\'' +
                '}';
    }
}
