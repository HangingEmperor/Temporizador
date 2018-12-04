package temporizador;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {

    public static void main(String[] args) {
        Display window = new Display();
        Timer miTemporizador = new Timer(1000, window);
        window.setTimer(miTemporizador);

        window.setLimit(65);
        miTemporizador.start();

//        JOptionPane.showMessageDialog(null, "Salir");
        if (!miTemporizador.isRunning()) {
            System.exit(0);
        }
    }
}
