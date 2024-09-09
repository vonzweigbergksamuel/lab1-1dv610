package lab1;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class Window {

  private JFrame frame;
  private JPanel panel;
  private JTextField inputField;
  private JTextField outputField;
  private JLabel inputLabel;
  private JLabel outputLabel;
  private JButton translateButton;

  public Window() {
    frame = new JFrame("Morse Code Translator");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout(10, 10));

    panel = new JPanel();
    panel.setLayout(new GridLayout(3, 2, 10, 10));
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    panel.add(createInputLabel());
    panel.add(createOutputLabel());
    panel.add(createInputField());
    panel.add(createOutputField());

    frame.add(panel, BorderLayout.CENTER);
  }

  public void showFrame() {
    frame.setVisible(true);
  }

  private JLabel createInputLabel() {
    inputLabel = new JLabel("Text to translate: ");
    inputLabel.setFont(new Font("Arial", Font.PLAIN, 14));

    return inputLabel;
  }

  private JLabel createOutputLabel() {
    outputLabel = new JLabel("Text in morse: ");
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 14));

    return outputLabel;
  }

  private JTextField createInputField() {
    inputField = new JTextField(20);

    return inputField;
  }

  private JTextField createOutputField() {
    outputField = new JTextField(20);
    outputField.setEditable(false);

    return outputField;
  }
}
