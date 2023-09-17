package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaTaco extends Pizza {
    private String salsa;

    //Constructor
    public PizzaTaco(String name, String salsa, double price, Topping... toppings) {
        super(name, toppings);
        this.salsa = salsa;
    }
    //Getters and Setters
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
