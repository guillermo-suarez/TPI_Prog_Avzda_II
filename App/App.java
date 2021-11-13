package App;

import Controlador.Controlador;
import DAO.*;
import Vistas.*;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            public void run() {
                DAOPostgres DAO = new DAOPostgres();
                DAO.abrirSesion();
                Controlador controlador = new Controlador(DAO);
                MenuPrincipal menu = new MenuPrincipal(controlador);
            }
        };
        SwingUtilities.invokeLater(run);
    }
}
