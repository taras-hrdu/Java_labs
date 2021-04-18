package com.company;

public class Camera{
    private static double weight;
    private String name;
    private int memory_capacity;
    private int zoom_ratio;
    private String color;
    private int price;

    private String producer;
    private int frame_frequency;
    private double sensor;
    private String infrared_illumination;
    private int ir_distance;

    protected int highest_temperature;
    protected int lowest_temperature;

    public Camera(){
        this(null, 0, 0, null, 0, null, 0, 0,
                null, 0, 0, 0);
    }

    public Camera(String name, int memory_capacity, int zoom_ratio, String color, int price,
                  String producer, int frame_frequency, double sensor, String infrared_illumination,
                  int ir_distance, int highest_temperature, int lowest_temperature) {

        setValues(name, memory_capacity, zoom_ratio, color, price, producer, frame_frequency, sensor,
                infrared_illumination, ir_distance, highest_temperature, lowest_temperature);
    }


    public Camera(String name, int memory_capacity, int zoom_ratio, String color){
        this(name, memory_capacity, zoom_ratio, color, 0, null, 0, 0,
                null, 0, 0, 0);
    }


    private void setValues(String name, int memory_capacity, int zoom_ratio, String color, int price,
                           String producer, int frame_frequency, double sensor, String infrared_illumination,
                           int ir_distance, int highest_temperature, int lowest_temperature){
        this.name = name;
        this.memory_capacity = memory_capacity;
        this.zoom_ratio = zoom_ratio;
        this.color = color;
        this.price = price;
        this.producer = producer;
        this.frame_frequency = frame_frequency;
        this.sensor = sensor;
        this.infrared_illumination = infrared_illumination;
        this.ir_distance = ir_distance;
        this.highest_temperature = highest_temperature;
        this.lowest_temperature = lowest_temperature;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory_capacity() {
        return memory_capacity;
    }

    public void setMemory_capacity(int memory_capacity) {
        this.memory_capacity = memory_capacity;
    }

    public int getZoom_ratio() {
        return zoom_ratio;
    }

    public void setZoom_ratio(int zoom_ratio) {
        this.zoom_ratio = zoom_ratio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getFrame_frequency() {
        return frame_frequency;
    }

    public void setFrame_frequency(int frame_frequency) {
        this.frame_frequency = frame_frequency;
    }

    public double getSensor() {
        return sensor;
    }

    public void setSensor(double sensor) {
        this.sensor = sensor;
    }

    public String getInfrared_illumination() {
        return infrared_illumination;
    }

    public void setInfrared_illumination(String infrared_illumination) {
        this.infrared_illumination = infrared_illumination;
    }

    public int getIr_distance() {
        return ir_distance;
    }

    public void setIr_distance(int ir_distance) {
        this.ir_distance = ir_distance;
    }

    @Override
    public String toString() {
        return "Camera{" +'\n'+
                " name='" + name + '\'' +'\n'+
                " memory_capacity=" + memory_capacity +'\n'+
                " zoom_ratio=" + zoom_ratio +'\n'+
                " color='" + color + '\'' +'\n'+
                " price=" + price +'\n'+
                " producer='" + producer + '\'' +'\n'+
                " frame_frequency=" + frame_frequency +'\n'+
                " sensor=" + sensor +'\n'+
                " infrared_illumination='" + infrared_illumination + '\'' +'\n'+
                " ir_distance=" + ir_distance +'\n'+
                " highest_temperature=" + highest_temperature +'\n'+
                " lowest_temperature=" + lowest_temperature +'\n'+
                '}';
    }


    public static void printStaticWeight(){
        System.out.println("Camera's weight is:  " + weight);
    }


    public void printWeight() {
        System.out.println("Camera's weight is:  " + weight);
    }


    public void resetValues(String name, int memory_capacity, int zoom_ratio, String color, int price,
                            String producer, int frame_frequency, double sensor, String infrared_illumination,
                            int ir_distance, int highest_temperature, int lowest_temperature){

        setValues(name, memory_capacity, zoom_ratio, color, price, producer, frame_frequency, sensor,
                infrared_illumination, ir_distance, highest_temperature, lowest_temperature);
    }
}