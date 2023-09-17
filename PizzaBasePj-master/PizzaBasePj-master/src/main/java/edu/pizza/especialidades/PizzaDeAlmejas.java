package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaDeAlmejas extends Pizza {
private String almejas;

    //Getter y Setter
    public String getAlmejas() {
        return almejas;
    }

    public void setAlmejas(String almejas) {
        this.almejas = almejas;
    }

    //Constructor
    public PizzaDeAlmejas(String name, String almejas, Topping... toppings) {
        super(name, toppings);
        this.almejas = almejas;
    }


}
