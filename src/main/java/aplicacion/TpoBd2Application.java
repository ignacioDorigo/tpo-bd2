package aplicacion;

import interfaces.gui.VentanaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.swing.*;

@SpringBootApplication(scanBasePackages = {"negocio", "interfaces"})
public class TpoBd2Application{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ControladorInterfaz controladorInterfaz = new ControladorInterfaz();
            VentanaPrincipal ventana = new VentanaPrincipal(controladorInterfaz);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
            SpringApplication.run(TpoBd2Application.class, args);
    }
}
