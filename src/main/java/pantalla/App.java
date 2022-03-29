package pantalla;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App(){
        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        panel.setBackground(Color.BLUE);

        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));

    }

}
