package Simple.Mind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleMinds extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1;
    SimpleMinds()
    {
     setBounds(400, 200, 1200, 500);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
   
     
        JLabel l2 = new JLabel ("      Intelligence Test 2022");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(Color.red);
        l2.setBounds( 615, 30, 800, 60 );
        add(l2);
        
        JLabel l3 = new JLabel ("Enter your Name");
        l3.setFont(new Font("MOngolian Baiti", Font.BOLD, 18));
        l3.setForeground(Color.BLUE);
        l3.setBounds( 810, 150, 300, 20 );
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(915, 270, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
       if (ae.getSource()== b1)
       {
           String name = t1.getText();
           this.setVisible(false);
           new Rules(name);
           
    }
       else
       {
           System.exit(0);
           }
    }
    public static void main(String [] args)
    {
        SimpleMinds simpleMinds = new SimpleMinds();
}
}