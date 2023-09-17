package edu.Formulario;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.base.ToppingE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmPizza {
    private JPanel jpanelPrincipal;
    private JComboBox comboBoxToppings;
    private JTextField txtPizza;
    private JButton btnAddIngrediente;
    private JLabel lblTotal;
    private JList Lista1;
    private JButton btnPreparar;
    private JComboBox comboBoxEspecialidad;
    private JList ListEspe;
    private JRadioButton pequeñaRadioButton;
    private JRadioButton medianaRadioButton;
    private JRadioButton grandeRadioButton;

    private JButton eliminarIngredienteButton;
    private   DefaultListModel modeloLista = new DefaultListModel();
    private   DefaultListModel modelolista2 = new DefaultListModel();
    private double TotalApagar ;
    private List<Topping> ingredientes = new ArrayList<>();
    private List<ToppingE> especilidad = new ArrayList<>();
    public JPanel getJpanelPrincipal() {
        return jpanelPrincipal;
    }

    public frmPizza() {
        cargarToppings();
        cargarPizzas();
        agruparBotones();
        //Llamar al metodo prepare

        eliminarIngredienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Topping ingrediente = (Topping) Lista1.getSelectedValue();
                modeloLista.removeElement(ingrediente);
                Lista1.setModel(modeloLista);
                TotalApagar -= ingrediente.getPrice();
                lblTotal.setText(String.valueOf(TotalApagar));
            }
        });
        btnAddIngrediente.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                //condicion para no repetir ingredientes
                Topping ingredientes = (Topping) comboBoxToppings.getSelectedItem();
                modeloLista.addElement(ingredientes);
                Lista1.setModel(modeloLista);
                TotalApagar += ingredientes.getPrice();
                lblTotal.setText(String.valueOf(TotalApagar));
            }
        });
        btnPreparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Lista1.getModel().getSize() == 0)
                {
                    modelolista2.clear();
                    JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un indrediente...");
                    ListEspe.setModel(modelolista2);

                }

               else {
                    modelolista2.clear();
                    modeloLista.clear();
                    modelolista2.addElement("Preparando " + comboBoxEspecialidad.getSelectedItem().toString());
                    modelolista2.addElement("Agregando ingredientes.... ");
                    for (int i = 0; i < Lista1.getModel().getSize(); i++) {
                        modelolista2.addElement(Lista1.getModel().getElementAt(i));
                    }
                    modelolista2.addElement("Total: Q"+lblTotal.getText());
                    modelolista2.addElement("Pizza preparada exitosamente!");
                    TotalApagar=0;
                }
                ListEspe.setModel(modelolista2);
                }



        });
    }




    public void agruparBotones()
    {
        ButtonGroup grupobotones = new ButtonGroup();
        grupobotones.add(pequeñaRadioButton);
        grupobotones.add(medianaRadioButton);
        grupobotones.add(grandeRadioButton);
    }
    private void cargarToppings(){
    ingredientes.add(new Topping(("Champiñones"), 1.99));
    ingredientes.add(new Topping(("Mozzarella"), 2.99));
    ingredientes.add(new Topping(("Cebolla"), 1.99));
    ingredientes.add(new Topping(("Tomate"), 1.99));
    ingredientes.add(new Topping(("Pepperoni"), 1.99));
    ingredientes.add(new Topping(("Jamon"), 1.99));
    ingredientes.add(new Topping(("Salami"), 1.99));
    ingredientes.add(new Topping(("Aceitunas"), 1.99));

    DefaultComboBoxModel model = new DefaultComboBoxModel(ingredientes.toArray());
    comboBoxToppings.setModel(model);
    }
    private void cargarPizzas() {
        //Cargar las pizzas
        especilidad.add(new ToppingE("Pizza Italiana  ", "Salsa de tomate   ", 45.00));
        especilidad.add(new ToppingE("Pizza de Canguro  ", "Salsa de tomate  ", 65.00));
        especilidad.add(new ToppingE("Pizza de Pato Pekines  ", "Salsa de tomate  ", 50.00));
        especilidad.add(new ToppingE("Pizza Taco  ", "Salsa de tomate  ", 38.00));



        //Cargar las especialidades
        DefaultComboBoxModel modelE = new DefaultComboBoxModel(especilidad.toArray());
        comboBoxEspecialidad.setModel(modelE);

    }
}





