package pantalla;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;

public class App extends JFrame {


    public App(){

        JPanel panel_principal = new JPanel();
        panel_principal.setSize(new Dimension(500, 500));
        panel_principal.setBackground(Color.RED);
        panel_principal.setOpaque(true);

        JButton camarero = new JButton();
        JButton cocinero = new JButton();

        camarero.setText("Camarero");
        cocinero.setText("Cocinero");

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(100, 100, 100, 100));
        panel.setOpaque(true);
        panel.setSize(new Dimension(300, 300));
        panel.setBackground(Color.BLUE);
        camarero.setSize(new Dimension(100, 100));
        cocinero.setSize(new Dimension(100, 100));
        panel.add(camarero, BorderLayout.WEST);
        panel.add(cocinero, BorderLayout.EAST);
        panel_principal.add(panel, BorderLayout.CENTER);
        panel_principal.add(panel);

        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));

    }

}
