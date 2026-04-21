package views; 

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Gestión de Empresa de Vehículos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));

        JButton btnListar = new JButton("Listar Vehículos");
        JButton btnAgregar = new JButton("Agregar Vehículo");

       
        btnAgregar.addActionListener(e -> {
            VentanaAgregar agregarView = new VentanaAgregar();
            agregarView.setVisible(true);
        });

        // Botón Listar (Conectado a la ventana que ya tenías)
        btnListar.addActionListener(e -> {
            ListarVehiculosView listarView = new ListarVehiculosView();
            listarView.setVisible(true);
        });

        add(btnListar);
        add(btnAgregar);
    }
}