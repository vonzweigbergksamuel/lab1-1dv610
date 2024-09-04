package lab1;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window window = new Window();
                window.showFrame();
            }
        });

        MorseGenerator morseGenerator = new MorseGenerator("Hello world");
        morseGenerator.getMessage();
    }
}
