package app;

import views.MenuPrincipal; // Importamos la vista
import javax.swing.SwingUtilities;

public class Program {
    public static void main(String[] args) {
        // Iniciamos el menú principal
        SwingUtilities.invokeLater(() -> {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        });
    }
}
