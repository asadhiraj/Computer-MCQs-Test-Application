package Simple.Mind;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    JButton b1,b2;
    private final String username;
    Rules(String username)
    {
        this.username = username;
       setBounds(400, 200, 1200, 500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       JLabel l1 = new JLabel("Welcome "+ username + " to Intelligence Test 2022");
       l1.setForeground(new Color(30, 144, 255));
       l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
       l1.setBounds(50, 20,900,30);
       add(l1);
       
       JLabel l2 = new JLabel ("");
       l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
       l2.setBounds (30, 80, 420, 120);
       l2.setText("<html>"+
                "1.Each question has 15 seconds"+"<br><br>"+
               "2. You can not move Backward"+"<br><br>"+
                "3.No choice is marked zero."+"<br><br>"+
               "<html>"
               );
       add(l2);
       b1 = new JButton("Back");
       b1.setBounds(200, 310, 220, 30);
       b1.setBackground (new Color(30, 144, 255));
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       add(b1);
       
       b2 = new JButton("Start");
       b2.setBounds(200, 260, 220, 30);;
       b2.setBackground (new Color(30, 144, 255));
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
       add(b2);
       setVisible(true);
   
}
     public void actionPerformed (ActionEvent ae)
     {
         if (ae.getSource() == b1)
         {
             this.setVisible(false);
             new SimpleMinds().setVisible(true);
         }
         else if (ae.getSource()== b2)
         {
             this.setVisible(false);
            new Quiz(username).setVisible(true);
         }
     }
        public static void main (String[] args)
        {
            new Rules("");
    }
}
