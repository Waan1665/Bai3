/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3;

/**
 *
 * @author ThinkPad
 */
public class Car {
   private boolean engine;
   private int cylinders;
   private String name;
   private int wheel;

    public Car(int cylinders, String name) {
        engine = true;
        this.cylinders = cylinders;        
        this.name = name;
        wheel = 4;
    }

    public String startEngine() {
        return "Car's engine started";
    }

    public String accelarate() {
        return "Car is accelarating";
    }

    public String brake() {
        return "Car stopped";
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    
   
}
