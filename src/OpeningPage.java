import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;


public class OpeningPage extends JFrame  {
    JButton loginButton = new JButton("Login");

    

      OpeningPage() {
        // Create the main frame
        JFrame frame = new JFrame("Opening  Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1360, 790);
        frame.setResizable(false);

        // Set background image
        ImageIcon backgroundImage = new ImageIcon("src/img/Untitled design copy.jpg"); // Replace with your image file
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1360, 790);

        // Create a panel for login components
        JPanel panel = new JPanel();
        panel.setLayout(null); // Use absolute positioning
        panel.setOpaque(false); // Make the panel transparent
        panel.setSize(1360, 790);

        // Create login button
        loginButton.setFont(new Font("Sans-serif", Font.PLAIN, 36));
        loginButton.setBounds(530, 300, 300, 80);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login button click
                dispose();
                LoginPage lp = new LoginPage();
            }
        });

        // Create exit button
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Sans-serif", Font.PLAIN, 36));
        exitButton.setBounds(530, 450, 300, 80);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle exit button click
                System.exit(0);
            }
        });
        //Create StepSync label
        JLabel NameLabel = new JLabel();
        NameLabel.setBounds(430,70,500,150);
        NameLabel.setText("STEP-IN-SYNC");
        NameLabel.setFont(new Font("Sans-serif", Font.ITALIC, 60));
        NameLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(loginButton);
        panel.add(exitButton);
        panel.add(NameLabel);

        // Add the panel to the background label
        backgroundLabel.add(panel);

        // Add the background label to the frame
        frame.add(backgroundLabel);

        frame.setVisible(true);
    }

   
    public static void main(String[] args) {
        OpeningPage OP = new OpeningPage();
    }
    
}

