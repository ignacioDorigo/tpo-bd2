package interfaces.gui;

import javax.swing.*;
import java.awt.*;

public class CarritoItemPanel extends JPanel {
    private JLabel nombreLabel;
    private JLabel cantidadLabel;
    private JButton eliminarButton;
    private JButton aumentarCantidadButton;
    private JButton disminuirCantidadButton;

    public CarritoItemPanel(String nombre, int cantidad) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        nombreLabel = new JLabel(nombre);
        cantidadLabel = new JLabel("Cantidad: " + cantidad);
        eliminarButton = new JButton("Eliminar");
        aumentarCantidadButton = new JButton("+");
        disminuirCantidadButton = new JButton("-");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nombreLabel, gbc);

        gbc.gridx = 1;
        add(cantidadLabel, gbc);

        gbc.gridx = 2;
        add(aumentarCantidadButton, gbc);

        gbc.gridx = 3;
        add(disminuirCantidadButton, gbc);

        gbc.gridx = 4;
        add(eliminarButton, gbc);

        // Aquí puedes agregar action listeners para los botones
    }
}

