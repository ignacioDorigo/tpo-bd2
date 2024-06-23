package interfaces.gui;

import aplicacion.Controlador;
import org.bson.Document;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarritoItemPanel extends JPanel {
    private JLabel nombreLabel;
    private JLabel cantidadLabel;
    private JButton eliminarButton;

    public CarritoItemPanel(Document item, Controlador controlador) {


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        nombreLabel = new JLabel(item.getString("nombre"));
        nombreLabel.setMinimumSize(new Dimension(200, nombreLabel.getPreferredSize().height));
        cantidadLabel = new JLabel("Cantidad: " + item.getInteger("cantidad"));
        eliminarButton = new JButton("Eliminar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nombreLabel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(cantidadLabel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(eliminarButton, gbc);

        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, getPreferredSize().height));

        eliminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar el ítem del carrito
                controlador.eliminarProductoCarritoMongo(item.getObjectId("_id"));

                // Actualizar la interfaz gráfica después de eliminar el ítem
                Container parent = getParent();
                if (parent != null) {
                    parent.remove(CarritoItemPanel.this);
                    parent.revalidate();
                    parent.repaint();
                }
            }
        });



    }
}

