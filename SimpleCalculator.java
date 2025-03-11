import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    private TextField display;
    private double num1;
    private char operator;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        Panel buttonPanel = new Panel(new GridLayout(4, 4, 5, 5));
        for (String text : "7 8 9 / 4 5 6 * 1 2 3 - 0 C = +".split(" ")) {
            Button button = new Button(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            if (command.matches("[0-9]")) {
                display.setText(display.getText() + command);
            } else if (command.equals("C")) {
                display.setText("");
            } else if (command.equals("=")) {
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            display.setText("Error: Divide by 0");
                            return;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        display.setText("Error");
                        return;
                }
                display.setText(String.valueOf(result));
            } else {
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText("");
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator().setVisible(true);
    }
}
