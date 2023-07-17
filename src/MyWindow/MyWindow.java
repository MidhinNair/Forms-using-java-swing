package MyWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class MyWindow extends  JFrame{
    private JLabel tittleHeading ;
    Font font = new Font("Arial",Font.BOLD,35);

    private JPanel mainPanel;
    private  JLabel nameLabel,passwordLabel;
    private  JTextField nameField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    public void createGui(){
        this.setLayout(new BorderLayout() );

        tittleHeading = new JLabel("My first Form");
        tittleHeading.setFont(font);
        this.add(tittleHeading,BorderLayout.NORTH);
        tittleHeading.setHorizontalAlignment(JLabel.CENTER);

        // working with JPanel
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));

        nameLabel = new JLabel("Enter Your Name :");
        nameLabel.setFont(font);
        passwordLabel = new JLabel("Enter Password :");
        passwordLabel.setFont(font);

        nameField = new JTextField();
        nameField.setFont(font);

        passwordField = new JPasswordField();
        passwordField.setFont(font);

        button1 = new JButton();
        button1.setFont(font);
        button1.setText("Reset");

        button2 = new JButton();
        button2.setFont(font);
        button2.setText("Submit");

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        this.add(mainPanel,BorderLayout.CENTER);
    }

    public MyWindow(){
        super.setTitle("Java Forms");
        super.setSize(600,600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(150,200);
        this.createGui();
        super.setVisible(true);



    }
}
