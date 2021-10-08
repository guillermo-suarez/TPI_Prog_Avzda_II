import javax.swing.JFrame;

import Vistas.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CrearCultivo ventana = new CrearCultivo();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
