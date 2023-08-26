import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class TicTacToe implements ActionListener
{

	JFrame f = new JFrame("Tic Tac Toe");
	UIManager um= new UIManager();
	
 	Label lbl=new Label("");

 	JButton btn1 = new JButton("");
 	JButton btn2 = new JButton("");
 	JButton btn3 = new JButton("");
 	JButton btn4 = new JButton("");
 	JButton btn5 = new JButton("");
 	JButton btn6 = new JButton("");
 	JButton btn7 = new JButton("");
 	JButton btn8 = new JButton("");
 	JButton btn9 = new JButton("");
 	JButton btn10 = new JButton("");
 
 	JPanel board = new JPanel();
 	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

 	String letter = "";
 	int count = 0;
 
 	boolean win = false;
 

 	public TicTacToe() {

     		initUI();
     		addActionEvents();
 	}

 
 	public void actionPerformed(ActionEvent a) {
 		count++;
 		if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9)
		{
 			letter = "X";
			lbl.setFont(new Font("Arial", Font.BOLD, 30));
 			lbl.setText("Player-O Turn :");
			lbl.setForeground(new Color(212, 80, 8));
 		} 
		else if(count == 2 || count == 4 || count == 6 || count == 8 )
		{
 			letter = "O";
			lbl.setFont(new Font("Arial", Font.BOLD, 30));
			lbl.setText("Player-X Turn :");
			lbl.setForeground(Color.BLACK);
 		}

 		if(a.getSource() == btn1)
		{
 			btn1.setText(letter);
 			btn1.setEnabled(false);
			if(letter=="X")
			{
			
				btn1.setFont(new Font("Arial", Font.BOLD, 50));
				btn1.setBackground(Color.BLACK);

			}
			else if(letter=="O")
			{
				
				btn1.setFont(new Font("Arial", Font.BOLD, 50));
				btn1.setBackground(new Color(212, 80, 8));
				btn1.setForeground(new Color(18,18,18));
			}
 		}
		else if(a.getSource() == btn2)
		{
 			btn2.setText(letter);
 			btn2.setEnabled(false);
			if(letter=="X")
			{
			
				btn2.setFont(new Font("Arial", Font.BOLD, 50));
				btn2.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn2.setFont(new Font("Arial", Font.BOLD, 50));
				btn2.setBackground(new Color(212, 80, 8));
				btn2.setForeground(new Color(18,18,18));
			}
 		} 
		else if(a.getSource() == btn3)
		{
 			btn3.setText(letter);
 			btn3.setEnabled(false);
			if(letter=="X")
			{
			
				btn3.setFont(new Font("Arial", Font.BOLD, 50));
				btn3.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn3.setFont(new Font("Arial", Font.BOLD, 50));
				btn3.setBackground(new Color(212, 80, 8));
			}
 		}
		else if(a.getSource() == btn4)
		{
 			btn4.setEnabled(false);
 			btn4.setText(letter);
			if(letter=="X")
			{
			
				btn4.setFont(new Font("Arial", Font.BOLD, 50));
				btn4.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn4.setFont(new Font("Arial", Font.BOLD, 50));
				btn4.setBackground(new Color(212, 80, 8));
			}
 		} 
		else if(a.getSource() == btn5)
		{
 			btn5.setText(letter);
  			btn5.setEnabled(false);
			if(letter=="X")
			{
			
				btn5.setFont(new Font("Arial", Font.BOLD, 50));
				btn5.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
					
				btn5.setFont(new Font("Arial", Font.BOLD, 50));
				btn5.setBackground(new Color(212, 80, 8));
			}
 		}
 		else if(a.getSource() == btn6)
		{
 			btn6.setText(letter);
  			btn6.setEnabled(false);
			if(letter=="X")
			{
			
				btn6.setFont(new Font("Arial", Font.BOLD, 50));
				btn6.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn6.setFont(new Font("Arial", Font.BOLD, 50));
				btn6.setBackground(new Color(212, 80, 8));
			}
 		} 
		else if(a.getSource() == btn7)
		{
 			btn7.setEnabled(false);
 			btn7.setText(letter);
			if(letter=="X")
			{
			
				btn7.setFont(new Font("Arial", Font.BOLD, 50));
				btn7.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn7.setFont(new Font("Arial", Font.BOLD, 50));
				btn7.setBackground(new Color(212, 80, 8));
			}
 		} 
		else if(a.getSource() == btn8)
		{
 			btn8.setEnabled(false);
 			btn8.setText(letter);
			if(letter=="X")
			{
			
				btn8.setFont(new Font("Arial", Font.BOLD, 50));
				btn8.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn8.setFont(new Font("Arial", Font.BOLD, 50));
				btn8.setBackground(new Color(212, 80, 8));
			}
 		} 
		else if(a.getSource() == btn9)
		{
 			btn9.setText(letter);
 			btn9.setEnabled(false);
			if(letter=="X")
			{
			
				btn9.setFont(new Font("Arial", Font.BOLD, 50));
				btn9.setBackground(Color.BLACK);
			}
			else if(letter=="O")
			{
			
				btn9.setFont(new Font("Arial", Font.BOLD, 50));
				btn9.setBackground(new Color(212, 80, 8));
			}
 		}
 		else if(a.getSource() == btn10)
		{
 
 			letter = "";
 			count = 0;
        
 			btn1.setEnabled(true);
 			btn2.setEnabled(true);
 			btn3.setEnabled(true);
 			btn4.setEnabled(true); 
 			btn5.setEnabled(true);
 			btn6.setEnabled(true);
 			btn7.setEnabled(true);
 			btn8.setEnabled(true);
 			btn9.setEnabled(true);
 
 			btn1.setText("");
 			btn2.setText("");
 			btn3.setText("");
 			btn4.setText("");
 			btn5.setText("");
 			btn6.setText("");
 			btn7.setText("");
 			btn8.setText("");
 			btn9.setText("");
 			btn9.setText("");
			btn1.setBackground(Color.WHITE);
			btn2.setBackground(Color.WHITE);
			btn3.setBackground(Color.WHITE);
			btn4.setBackground(Color.WHITE);
			btn5.setBackground(Color.WHITE);
			btn6.setBackground(Color.WHITE);
			btn7.setBackground(Color.WHITE);
			btn8.setBackground(Color.WHITE);
			btn9.setBackground(Color.WHITE);
 			lbl.setText("");
 			lbl.setFont(new Font("Arial", Font.BOLD, 30));
 			win = false;
			lbl.setText("Player-X Turn :");
			lbl.setForeground(Color.BLACK);
 
 		}

 		
 		checkWinner();
 	}
 
 

 	private void initUI(){
          
 		board.setLayout(new GridLayout(3,3));
		
		board.setBorder(new EmptyBorder(20, 60,30, 60));
		
 		panel1.setLayout(new FlowLayout());
		panel1.setBorder(new EmptyBorder(0, 0,30, 0));
	
		panel2.setLayout(new FlowLayout());
		panel2.setBorder(new EmptyBorder(30, 0,0, 0)); 		

 		btn1.setBackground(new Color(255,255,255));
		btn2.setBackground(new Color(255,255,255));
 		btn3.setBackground(new Color(255,255,255));
 		btn4.setBackground(new Color(255,255,255));
 		btn5.setBackground(new Color(255,255,255));
 		btn6.setBackground(new Color(255,255,255));
 		btn7.setBackground(new Color(255,255,255));
 		btn8.setBackground(new Color(255,255,255));
 		btn9.setBackground(new Color(255,255,255));
 		btn10.setBackground(new Color(245, 223, 223));
		
 		
 		btn10.setText(" RESTART ");
        	lbl.setText("Player-X Turn :");
		lbl.setFont(new Font("Arial", Font.BOLD, 30));

 		btn10.setFont(new Font("Arial", Font.PLAIN, 15));

 		
 		btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn4.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn5.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn6.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn7.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn8.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		btn9.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		btn10.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 		
 		board.add(btn1);
 		board.add(btn2);
 		board.add(btn3);
 		board.add(btn4);
 		board.add(btn5);
 		board.add(btn6);
 		board.add(btn7);
 		board.add(btn8);
 		board.add(btn9);

 		
		
 		panel1.add(btn10);
 		panel2.add(lbl);
 
 		

 		f.add(board,BorderLayout.CENTER);
 		f.add(panel1,BorderLayout.SOUTH);
 		f.add(panel2,BorderLayout.NORTH);
 
 		f.setVisible(true);
 		f.setSize(550,550);
 		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 


    	public void addActionEvents()
	{
        	

 		btn1.addActionListener(this);
 		btn2.addActionListener(this);
 		btn3.addActionListener(this);
 		btn4.addActionListener(this);
 		btn5.addActionListener(this);
 		btn6.addActionListener(this);
 		btn7.addActionListener(this);
 		btn8.addActionListener(this);
 		btn9.addActionListener(this);
 		btn10.addActionListener(this);
      
    	}
    
      
 	private void checkWinner()
	{
   		


     		//Check Horizontally
   		if(btn1.getText() == btn2.getText() && 
    		btn2.getText() == btn3.getText() && 
    		btn1.getText() != "" && 
    		btn2.getText() != "" && 
    		btn3.getText() != "" )
 		{
       			 win = true;
			 btn1.setBackground(new Color(2, 102, 27));
			 btn2.setBackground(new Color(2, 102, 27));
 			 btn3.setBackground(new Color(2, 102, 27));
			
 		}
 

       		//Check Horizontally
  		else if(btn4.getText() == btn5.getText() && 
         		btn5.getText() == btn6.getText() && 
          		btn4.getText() != "" &&
          		btn5.getText() != "" &&
          		btn6.getText() != "")
  		{
      			win = true;
			btn4.setBackground(new Color(2, 102, 27));
			 btn5.setBackground(new Color(2, 102, 27));
 			 btn6.setBackground(new Color(2, 102, 27));
  		}
  

       		//Check Horizontally
    		else if(btn7.getText() == btn8.getText() && 
            		btn8.getText() == btn9.getText() && 
            		btn7.getText() != "" &&
           	 	btn8.getText() != "" &&
            		btn9.getText() != "")
    		{
        		win = true;
			btn7.setBackground(new Color(2, 102, 27));
			 btn8.setBackground(new Color(2, 102, 27));
 			 btn9.setBackground(new Color(2, 102, 27));
    		}
    

         	//Check Vertically
    		else if(btn1.getText() == btn4.getText() &&
            		btn4.getText() == btn7.getText() &&
            		btn1.getText() != "" &&
            		btn4.getText() != "" &&
            		btn7.getText() != "")
    		{
        		win = true;
			btn1.setBackground(new Color(2, 102, 27));
			 btn4.setBackground(new Color(2, 102, 27));
 			 btn7.setBackground(new Color(2, 102, 27));
    		}
    
    		//Check Vertically
    		else if(btn2.getText() == btn5.getText() && 
            		btn5.getText() == btn8.getText() && 
            		btn2.getText() != "" &&
            		btn5.getText() != "" &&
            		btn8.getText() != "")
    		{
       	 		win = true;
		        btn2.setBackground(new Color(2, 102, 27));
			 btn5.setBackground(new Color(2, 102, 27));
 			 btn8.setBackground(new Color(2, 102, 27));
    		}
    
		//Check Vertically
    		else if(btn3.getText() == btn6.getText() &&
            		btn6.getText() == btn9.getText() && 
            		btn3.getText() != "" &&
            		btn6.getText() != "" &&
            		btn9.getText() != "")
    		{
        		win = true;
			btn3.setBackground(new Color(2, 102, 27));
			 btn6.setBackground(new Color(2, 102, 27));
 			 btn9.setBackground(new Color(2, 102, 27));
    		}
    

    		//Check Diagonally
    		else if(btn1.getText() == btn5.getText() && 
        		btn5.getText() == btn9.getText() && 
        		btn1.getText() != "" &&
        		btn5.getText() != "" &&
        		btn9.getText() != "")
    		{
        		win = true;
			btn1.setBackground(new Color(2, 102, 27));
			 btn5.setBackground(new Color(2, 102, 27));
 			 btn9.setBackground(new Color(2, 102, 27));
    		}
    
    		//Check Diagonally
    		else if(btn3.getText() == btn5.getText() && 
            		btn5.getText() == btn7.getText() && 
            		btn3.getText() != "" &&
            		btn5.getText() != "" &&
            		btn7.getText() != "")
    		{
            		win = true;
			btn3.setBackground(new Color(2, 102, 27));
			 btn5.setBackground(new Color(2, 102, 27));
 			 btn7.setBackground(new Color(2, 102, 27));
    		}
    
    		else
 		{
        		win = false;
    		}
 
 		if (win) {
			
			String res="  Player-" + letter + " Wins !!";
			JLabel resLabel=new JLabel(res);
			resLabel.setFont(new Font("Serif", Font.BOLD, 30));
			resLabel.setForeground(new Color(2, 102, 27));
        		btn1.setEnabled(false);
        		btn2.setEnabled(false);
        		btn3.setEnabled(false);
        		btn4.setEnabled(false); 
        		btn5.setEnabled(false);
        		btn6.setEnabled(false);
        		btn7.setEnabled(false);
        		btn8.setEnabled(false);
        		btn9.setEnabled(false);
			um.put("OptionPane.minimumSize",new Dimension(200,200));
			JOptionPane.showMessageDialog(f,resLabel,"Winner",JOptionPane.PLAIN_MESSAGE);
			lbl.setText("Restart Game!");
			lbl.setForeground(new Color(140, 1, 1));

 		} 
		else if (!win && count == 9) {
			
			String res="The game ended in a Tie !!";
			JLabel resLabel=new JLabel(res);
			resLabel.setFont(new Font("Serif", Font.BOLD, 30));
			resLabel.setForeground(new Color(140, 1, 1));
        		btn1.setEnabled(false);
        		btn2.setEnabled(false);
        		btn3.setEnabled(false);
        		btn4.setEnabled(false); 
        		btn5.setEnabled(false);
        		btn6.setEnabled(false);
        		btn7.setEnabled(false);
        		btn8.setEnabled(false);
        		btn9.setEnabled(false);
			JOptionPane.showMessageDialog(f,resLabel,"Tie",JOptionPane.PLAIN_MESSAGE);
			lbl.setText("Restart Game!");
			lbl.setForeground(new Color(140, 1, 1));
			
 		}
 	}
 

 	public static void main(String[] args) 
	{
 		
		TicTacToe ttt=new TicTacToe();

 	}
}



