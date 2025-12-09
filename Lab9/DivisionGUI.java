import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionGUI extends JFrame implements ActionListener {
    // GUI Components
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionGUI() {
        // Set up the frame
        setTitle("Integer Division");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Add labels and text fields
        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Divide button
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        // Empty label to align layout
        add(new JLabel());

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Read numbers from text fields
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            // Perform division
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            // Handle invalid integer input
            JOptionPane.showMessageDialog(this,
                    "Please enter valid integers for Num1 and Num2.",
                    "Number Format Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            // Handle division by zero
            JOptionPane.showMessageDialog(this,
                    "Cannot divide by zero.",
                    "Arithmetic Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DivisionGUI();
    }
}
