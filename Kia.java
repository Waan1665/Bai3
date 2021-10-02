/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3;

public class Kia extends Car {
    
    private String model;

    public Kia(int cylinders, String model) {
        super(cylinders, "Kia");
        this.model = model;               
    }

    @Override
    public String brake() {
        return "Kia-" + this.model + "started";
    }

    @Override
    public String accelarate() {
        return "Kia-" + this.model + "is accelarating";
    }

    @Override
    public String startEngine() {
        return "Kia-" + this.model + "stopped";
    }
    
    
    
}
