
package Simple.Mind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score (String username, int score)
    {
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l2 = new JLabel ("Thanks You Dear "+username+ " for Participating");
        l2.setBounds(45, 20, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel ("Your Score is "+ score);
        l3.setBounds(250, 200,430, 90);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 48));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        if (score >=70)
        {
           JLabel l4 = new JLabel ("Congratulation! You have Qualified for Medical Test");
           l4.setBounds(45, 120,700, 30);
        l4.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l4);
        }
        else
        {
            JLabel l5 = new JLabel ("Better Luck, Next Time");
             l5.setBounds(45,120, 700, 30);
        l5.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l5);       
                    
        }
    }
    
    public static void main (String [] args)
    {
        new Score("",0).setVisible(true);
}
    
}
