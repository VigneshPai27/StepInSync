
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandippai
 */
public class LoginPage extends JFrame {
    JTextField UsernameField ;
    JPasswordField PasswordField ;
    JButton SubmitButton ;
    LoginPage(){
       JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1360, 790);
        frame.setResizable(false);
        frame.setTitle("Login Page");
        
         // Set background image
        ImageIcon backgroundImage = new ImageIcon("src/img/desktop-wallpaper-admin-login copy.png"); // Replace with your image file
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1360, 790);
        
          // Create a panel for login components
         JPanel panel = new JPanel();
        panel.setLayout(null); // Use absolute positioning
        panel.setOpaque(false); // Make the panel transparent
        panel.setSize(1360, 790);
        
        

       
        //Create StepSync label
        JLabel NameLabel = new JLabel();
        NameLabel.setBounds(500,70,400,150);
        NameLabel.setText("Step-In-Sync");
        NameLabel.setFont(new Font("Sans-serif", Font.PLAIN, 60));
        
        //Create username Field
        
        //Create username Label
        JLabel UsernameLabel = new JLabel();
        UsernameLabel.setText("Username");
        UsernameLabel.setFont(new Font("MS Mincho",Font.PLAIN, 30));
        UsernameLabel.setBounds(517, 270,326 ,57);
        UsernameLabel.setHorizontalAlignment(JLabel.CENTER);
        UsernameField = new JTextField();
        UsernameField.setBounds(480,340,400, 60);
        UsernameField.setFont(new Font("MS Mincho",Font.PLAIN, 30));
        UsernameField.setHorizontalAlignment(JLabel.CENTER);
        
        //create password Field
        
        //Create Password Label
        JLabel PasswordLabel = new JLabel();
        PasswordLabel.setFont(new Font("MS Mincho",Font.PLAIN, 30));
        PasswordLabel.setText("Password");
        PasswordLabel.setBounds(517,411,326,57);
        PasswordLabel.setHorizontalAlignment(JLabel.CENTER);
        PasswordField = new JPasswordField();
        PasswordField.setBounds(480, 470,400, 60);
        PasswordField.setFont(new Font("MS Mincho",Font.PLAIN, 30));
        PasswordField.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        //create submit button
        SubmitButton = new JButton();
        SubmitButton.setBounds(540, 600, 286, 64);
        SubmitButton.setText("SUBMIT");
        SubmitButton.setFont(new Font("MS Mincho",Font.BOLD, 14));
         SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login button click
                new Dashboard().setVisible(true);
                frame.dispose();
                
            }
        });
         
         //Create User icon label
         ImageIcon UserIcon = new ImageIcon("src/img/profileicon2.png");
         JLabel UserIconLabel = new JLabel() ;
         UserIconLabel.setBounds(580, 60, 200, 200);
         UserIconLabel.setIcon(UserIcon);
         

        // Add components to the panel
        panel.add(UsernameField);
        panel.add(PasswordField);
        panel.add(SubmitButton);
        panel.add(UsernameLabel);
        panel.add(PasswordLabel);
        panel.add(UserIconLabel);

        // Add the panel to the background label
        backgroundLabel.add(panel);

        // Add the background label to the frame
        frame.add(backgroundLabel);

        frame.setVisible(true);
    
}
    public static void main(String[] args)
    { LoginPage lp = new LoginPage();
    }
}
