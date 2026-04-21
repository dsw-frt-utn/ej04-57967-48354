package views; 

import javax.swing.*;
import java.awt.*;

public class VentanaAgregar extends JFrame {

    public VentanaAgregar() {
        setTitle("Ingresar Nuevo Vehículo");
        setSize(400, 400);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(6, 2, 10, 10)); 

        add(new JLabel("Patente:"));
        add(new JTextField());

        add(new JLabel("Modelo:"));
        add(new JTextField());

        add(new JLabel("Marca:"));
        add(new JTextField());

        add(new JLabel("Tipo de Vehículo:"));
        add(new JComboBox<>(new String[]{"Combustible", "Eléctrico"}));

        JButton btnGuardar = new JButton("Guardar Vehículo");
        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Vehículo Guardado (Lógica en construcción)");
            this.dispose(); 
        });

        add(new JLabel("")); 
        add(btnGuardar);
    }
}