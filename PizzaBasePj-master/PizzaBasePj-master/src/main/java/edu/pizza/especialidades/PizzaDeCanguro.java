package edu.pizza.especialidades;

import edu.pizza.base.Pizza;

public class PizzaDeCanguro extends Pizza {
    private String canguro;

    //Getters and Setters
    public String getCanguro() {
        return canguro;
    }

    public void setCanguro(String canguro) {
        this.canguro = canguro;
    }

    //Constructor
    public PizzaDeCanguro(String name, String canguro) {
        super(name);
        this.canguro = canguro;
    }


}
