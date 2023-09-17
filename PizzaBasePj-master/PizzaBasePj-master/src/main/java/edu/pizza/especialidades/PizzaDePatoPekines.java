package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaDePatoPekines extends Pizza {
    private String patoPekines;

    //Getters and Setters
    public String getPatoPekines() {
        return patoPekines;
    }

    public void setPatoPekines(String patoPekines) {
        this.patoPekines = patoPekines;
    }

    //Constructor
    public PizzaDePatoPekines(String name, String Salsa, Topping... toppings) {
        super(name, toppings);
        this.patoPekines = Salsa;
    }
}
