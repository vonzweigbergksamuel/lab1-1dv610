package lab1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

public class Window {

  private JFrame frame;
  private JPanel panel;
  private JTextField textField;
  private JLabel label;

  public Window() {
    frame = new JFrame("Morse Code Translator");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout(10, 10));

    panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.add(createLabel());
    panel.add(createTextField());

    frame.add(panel, BorderLayout.CENTER);
  }

  public void showFrame() {
    frame.setVisible(true);
  }

  private JTextField createTextField() {
    textField = new JTextField(20);

    return textField;
  }

  private JLabel createLabel() {
    label = new JLabel("Morse Code: ");
    label.setFont(new Font("Arial", Font.PLAIN, 20));

    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setBounds(0, 0, 500, 100);

    return label;
  }
}
