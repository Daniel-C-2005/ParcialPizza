package edu.pizza;


import edu.Formulario.frmPizza;
import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        //Investigar propiedades del JFrame

        frmPizza x = new frmPizza();
        JFrame frame = new JFrame("frmPizza");
        frame.setContentPane(new frmPizza().getJpanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.pack();
        frame.setVisible(true);


        //ejercicio 1
        //Pizza pizza = new Pizza("Pizza Margherita");
        //pizza.addTopping(new Topping("Champiñones ", 1.99));
        //pizza.addTopping(new Topping("Mozzarella",  2.99));
        //pizza.addTopping(new Topping("Cebolla",  1.99));
        //pizza.addTopping(new Topping("Tomate",  1.99));
        //pizza.prepare();

        //quiten la mozarella
        //vuelvan a preparar
        //System.out.println("Ahora sin mozarella");
        //pizza.removeTopping(1);
        //pizza.prepare();










//        Ejercicio 2 heredar
//        Creamos una instancia de la clase PizzaItaliana y agregamos varios toppings
//        a ella utilizando
//        el método "agregar" de la clase Topping.
//        PizzaItaliana pizzaItaliana =
//                new PizzaItaliana("Pizza Italiana", 10.99, "Salsa de tomate", new Topping("Tomato"), new Topping("Mozzarella"), new Topping("Basil"));
//        pizzaItaliana.prepare();


//        Ejercicio 3
//        Topping pepperoni = new Topping("Pepperoni");
//        pepperoni.agregarIngrediente("queso");
//        pepperoni.agregarIngrediente("champiñones");
//        System.out.println(pepperoni); // Salida: Topping{nombre='Pepperoni', ingredientes=['queso']}


    }
}
