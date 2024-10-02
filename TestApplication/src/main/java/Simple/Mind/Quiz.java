
package Simple.Mind;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given =0;
    public static int score = 0;
    JLabel qno, question;
    String q [][] = new String [10][5];
    String pa [][] = new String [10][1];
    String qa [][]= new String [10] [2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
        String username;
    private Graphics g;
    Quiz(String username){
        this.username = username;
     setBounds(400, 200, 1200, 500);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JLabel l2= new JLabel("");
     l2.setFont(new Font("Tahoma", Font.PLAIN, 24));
     l2.setBounds(100, 20, 40, 30);
     add(l2);
     
     qno= new JLabel(".");
     qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
    qno.setBounds(110,20,50, 30);
     add(qno);
     
     question= new JLabel("");
     question.setFont(new Font("Tahoma", Font.PLAIN, 24));
     question.setBounds(130, 20, 900, 30);
     add(question);
     
     q[0][0] = "The Name of Founder of Pakistan is?";
        q[0][1] = "Sir Sayyad ";
        q[0][2] = "Allama Iqbal";
        q[0][3] = "Dr. Abdul Qadeer";
        q[0][4] = "Quaid-e-Azam";

        q[1][0] = "Total Population of Pakistan is?";
        q[1][1] = "22 Chore";
        q[1][2] = "15 Chore";
        q[1][3] = "21 Lakh";
        q[1][4] = "33 Chore";

        q[2][0] = "Who is Richest person on the Earth";
        q[2][1] = "Bill Gates";
        q[2][2] = "Salman Khan";
        q[2][3] = "Obama";
        q[2][4] = "Elon Mask";

        q[3][0] = "Total length of Human Genome is?";
        q[3][1] = "3.0 Billion NT";
        q[3][2] = "3.1 Billion NT";
        q[3][3] = "3.02 Billion NT";
        q[3][4] = "3.2 Billion NT";

        q[4][0] = "What is first language of the world?";
        q[4][1] = "Urdu";
        q[4][2] = "Persion";
        q[4][3] = "Chinese";
        q[4][4] = "Arabic";

        q[5][0] = "Who discovered Gravity?";
        q[5][1] = "Newton";
        q[5][2] = "Coloumbus";
        q[5][3] = "Tesla";
        q[5][4] = "Jackob";

        q[6][0] = "He is knocking _______ the door?";
        q[6][1] = "in";
        q[6][2] = "on";
        q[6][3] = "at";
        q[6][4] = "with";

        q[7][0] = "Google was made in?";
        q[7][1] = "1990";
        q[7][2] = "1991";
        q[7][3] = "1992";
        q[7][4] = "1993";

        q[8][0] = "Internal part of earth is called?";
        q[8][1] = "Mentel";
        q[8][2] = "core";
        q[8][3] = "Mega";
        q[8][4] = "lava";

        q[9][0] = "Organic compound must have?";
        q[9][1] = "C";
        q[9][2] = "K";
        q[9][3] = "H";
        q[9][4] = "O";
        
        
        qa[0][1] = "Quaid-e-Azam";
        qa[1][1] = "22 Chore";
        qa[2][1] = "Elon Mask";
        qa[3][1] = "3.2 Billion NT";
        qa[4][1] = "Arabic";
        qa[5][1] = "Newton";
        qa[6][1] = "at";
        qa[7][1] = "1992";
        qa[8][1] = "core";
        qa[9][1] = "C";
     
     opt1 = new JRadioButton("");
     opt1.setBounds(170, 80, 500, 30);
     opt1.setFont (new Font("Dialog", Font.PLAIN, 20));
     opt1.setBackground(Color.WHITE);
     add(opt1);
     
     opt2 = new JRadioButton("");
     opt2.setBounds(170, 120, 700, 30);
     opt2.setFont (new Font("Dialog", Font.PLAIN, 20));
     opt2.setBackground(Color.WHITE);
     add(opt2);
     
     opt3 = new JRadioButton("");
     opt3.setBounds(170, 160, 700, 30);
     opt3.setFont (new Font("Dialog", Font.PLAIN, 20));
     opt3.setBackground(Color.WHITE);
     add(opt3);
     
     opt4 = new JRadioButton("");
     opt4.setBounds(170, 200, 700, 30);
     opt4.setFont (new Font("Dialog", Font.PLAIN, 20));
     opt4.setBackground(Color.WHITE);
     add(opt4);
     
     options = new ButtonGroup();
     options.add(opt1);
     options.add(opt2);
     options.add(opt3);
     options.add(opt4);
     
     next = new JButton ("Next");
     next.setFont(new Font ("Tahoma", Font.PLAIN, 22));
     next.setBackground(new Color( 30, 144, 255));
     next.setForeground(Color.WHITE);
     next.addActionListener(this);
     next.setBounds(900, 80, 200, 20);
     add(next);
     
     /**lifeline = new JButton ("50-50 Lifeline");
     lifeline.setFont(new Font ("Tahoma", Font.PLAIN, 22));
     lifeline.setBackground(new Color( 30, 144, 255));
     lifeline.setForeground(Color.WHITE);
     lifeline.setBounds(900, 90, 200, 20);
     lifeline.addActionListener(this);
    add(lifeline);*/
     
     submit = new JButton ("Submit");
     submit.setFont(new Font ("Tahoma", Font.PLAIN, 22));
     submit.setEnabled(false);
     submit.setBackground(new Color( 30, 144, 255));
     submit.setForeground(Color.WHITE);
     submit.addActionListener(this);
     submit.setBounds(900, 110, 200, 20);
     add(submit); 
     start(0);         
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
      if (ae.getSource()== next)
      {
          repaint();
          ans_given=1;
          if (options.getSelection()== null)
          {
             pa[count][0] = "";
             
          }else 
              
          {
              pa[count] [0] = options.getSelection().getActionCommand();
          }
          
           if (count ==8)
            {
                submit.setEnabled(true);
                next.setEnabled(false);
                
            }
          
          count++;
          start ( count );
      }else if(ae.getSource()== submit)     {
          ans_given=1;
         if (options.getSelection()== null)
          {
             pa[count][0] = "";
             
          }else 
              
          {
              pa[count] [0] = options.getSelection().getActionCommand();
          }
                for (int i=0; i<pa.length; i++)
                {
                    if (pa[i][0].equals (qa [i][1]))
                    {
                        score+=10;
                    }
                    else {
                        score+=0;
                    }
                }
                this.setVisible(false);
               new Score(username,score).setVisible(true);
          
      }
      else if (ae.getSource()== lifeline)
      {
          
      }
    }
    public void paint(Graphics g)
    {    super.paint(g);
    String time = "Time Left - "+ timer + " Seconds";
    g.setColor(Color.RED);
    g.setFont(new Font("Tahoma", Font.BOLD, 25));
   
    if (timer>0)
    {
         g.drawString(time, 500, 420);
    }else
    {
        g.drawString("Times UP!!!", 500, 420);
    }
    timer--; 
    try {
        Thread.sleep(1000);
        repaint();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
        if (ans_given==1)
        {
            ans_given=0;
       timer=15;
        }
        else
     if (timer<0)
        {
            timer=15;
            if (count ==8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9)
            {
                if (options.getSelection()== null)
          {
             pa[count][0] = "";
             
          }else 
              
          {
              pa[count] [0] = options.getSelection().getActionCommand();
          }
                for (int i=0; i<pa.length; i++)
                {
                    if (pa[i][0].equals (qa [i][1]))
                    {
                        score+=10;
                    }
                    else {
                        score+=0;
                    }
                }
                this.setVisible(false);
               new Score(username,score).setVisible(true);
                
            }else
            {
              if (options.getSelection()== null)
          {
             pa[count][0] = "";
             
          }else 
              
          {
              pa[count] [0] = options.getSelection().getActionCommand();
          }  
              count++;
              start(count);
            }
                
            
        }
    }
    
    
    public void start (int count)
    {
      qno.setText(""+ (count+1) + ". "); 
      question.setText(q[count][0]);
      opt1.setLabel (q[count][1]);
      opt1.setActionCommand(q[count][1]);
      opt2.setLabel (q[count][2]);
      opt2.setActionCommand(q[count][2]);
      opt3.setLabel (q[count][3]);
      opt3.setActionCommand(q[count][3]);
      opt4.setLabel (q[count][4]);
      opt4.setActionCommand(q[count][4]);
      options.clearSelection();
    }
    public static void main (String [] args)
    {
        new Quiz("").setvisible(true);
    }

    private void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
