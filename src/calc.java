import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    private final JTextField display;
    private double firstOperand = 0;
    private String operator = "";
    private boolean newInput = true;

    public calc() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        display = new JTextField(10);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.matches("[0-9]")) {
                if (newInput) {
                    display.setText(command);
                    newInput = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (command.equals(".")) {
                if (newInput) {
                    display.setText("0" + command);
                    newInput = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + command);
                }
            } else if (command.equals("=")) {
                calculateResult();
            } else {
                if (!operator.isEmpty()) {
                    calculateResult();
                }
                firstOperand = Double.parseDouble(display.getText());
                operator = command;
                newInput = true;
            }
        }
    }

    private void calculateResult() {
        if (!operator.isEmpty()) {
            double secondOperand = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    firstOperand += secondOperand;
                    break;
                case "-":
                    firstOperand -= secondOperand;
                    break;
                case "*":
                    firstOperand *= secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        firstOperand /= secondOperand;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(firstOperand));
            operator = "";
            newInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calc calculator = new calc();
            calculator.setVisible(true);
        });
    }
}

