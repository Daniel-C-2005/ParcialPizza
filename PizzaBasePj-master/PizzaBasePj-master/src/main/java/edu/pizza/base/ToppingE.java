package edu.pizza.base;

import java.util.ArrayList;

public class ToppingE {
    private ArrayList<String> especialidad = new ArrayList<>();
    private String nombre; // Nombre del Pizza
    private String Salsa; // Salsa de la pizza


    //Getter

    private ArrayList<String> especilidad = new ArrayList<>(); // Especialidda del Pizza
    public void agregarIngrediente(String especilidad) {

        this.especilidad.add(especilidad);
    }

    //Constructor
    public ToppingE(String nombre, String Salsa, double price) {
        this.nombre = nombre;
        this.Salsa = Salsa;

    }
    @Override
    public String toString() {
        return nombre+"\t" + " "+Salsa+"\t";
    }
    //Getters and Setters
    public void agregarEspecialidad(String especialidad) {

        this.especialidad.add(especialidad);
    }
    public ArrayList<String> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ArrayList<String> especialidad) {
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalsa() {
        return Salsa;
    }

    public void setSalsa(String salsa) {
        Salsa = salsa;
    }



    public ArrayList<String> getEspecilidad() {
        return especilidad;
    }

    public void setEspecilidad(ArrayList<String> especilidad) {
        this.especilidad = especilidad;
    }
}
