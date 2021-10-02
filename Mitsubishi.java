/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3;

public class Mitsubishi extends Car {
    
    private String model;

    public Mitsubishi(int cylinders, String model) {
        super(cylinders, "Mitsubishi");
        this.model = model;               
    }

    @Override
    public String brake() {
        return "Mitsubishi-" + this.model + "started";
    }

    @Override
    public String accelarate() {
        return "Mitsubishi-" + this.model + "is accelarating";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi-" + this.model + "stopped";
    }
    
    
    
}
