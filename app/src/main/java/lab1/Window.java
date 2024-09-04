package lab1;

import javax.swing.JFrame;

public class Window {

  private JFrame frame;

  public Window() {
    System.out.println("Window created");

    this.frame = new JFrame("Morse Code Translator");
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setSize(400, 400);
    this.frame.setLocationRelativeTo(null);

  }

  public void showFrame() {
    this.frame.setVisible(true);
  }
}
