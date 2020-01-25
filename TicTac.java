import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.xml.soap.Text;

public class TicTac extends Frame implements ActionListener,WindowListener,KeyListener {
	
	TextField result;
	Button but1,but2,but3,but4,but5,but6,but7,but8,but9,reset;
	int l=0,m=0;
	
	TicTac(){
	
		result = new TextField(20);
		
		but1=new Button("");
		but2=new Button("");
		but3=new Button("");
		but4=new Button("");
		but5=new Button("");
		but6=new Button("");
		but7=new Button("");
		but8=new Button("");
		but9=new Button("");
		reset=new Button("RESET");
		
		add(but1);add(but2);add(but3);
		add(but4);add(but5);add(but6);
		add(but7);add(but8);add(but9);
		add(reset);
		add(result);
		
		setLayout(null);
		but1.setBounds(10,35, 100, 100);
		but2.setBounds(110,35, 100, 100);
		but3.setBounds(210,35, 100, 100);
		but4.setBounds(10,135, 100, 100);
		but5.setBounds(110,135, 100, 100);
		but6.setBounds(210,135, 100, 100);
		but7.setBounds(10,235, 100, 100);
		but8.setBounds(110,235, 100, 100);
		but9.setBounds(210,235, 100, 100);
        result.setEditable(false);
        result.setBounds(9, 365, 300, 30);
        reset.setBounds(10, 335, 300, 30);
        
		addWindowListener(this);
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		reset.addActionListener(this);
		
		but1.setFont(new Font("Arabic",Font.BOLD,20));
		but2.setFont(new Font("Arabic",Font.BOLD,20));
		but3.setFont(new Font("Arabic",Font.BOLD,20));
		but4.setFont(new Font("Arabic",Font.BOLD,20));
		but5.setFont(new Font("Arabic",Font.BOLD,20));
		but6.setFont(new Font("Arabic",Font.BOLD,20));
		but7.setFont(new Font("Arabic",Font.BOLD,20));
		but8.setFont(new Font("Arabic",Font.BOLD,20));
		reset.setFont(new Font("Arabic",Font.BOLD,20));
		but9.setFont(new Font("Arabic",Font.BOLD,20));
		result.setFont(new Font("Arabic",Font.BOLD,17));
		
		setSize(310,395);
		setTitle("MS_07");
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String [] args) {
		new TicTac();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
	 System.exit(0);	
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str=arg0.getActionCommand();
		
		if(arg0.getSource()==reset) {
			
			but1.setEnabled(true);
			but2.setEnabled(true);
			but3.setEnabled(true);
			but4.setEnabled(true);
			but5.setEnabled(true);
			but6.setEnabled(true);
			but7.setEnabled(true);
			but8.setEnabled(true);
			but9.setEnabled(true);
			
		    result.setText("");
		    
		    but1.setLabel("");
		    but2.setLabel("");
		    but3.setLabel("");
		    but4.setLabel("");
		    but5.setLabel("");
		    but6.setLabel("");
		    but7.setLabel("");
		    but8.setLabel("");
		    but9.setLabel("");
		    				
		}
		else if(str.equals("")&&l==0)
		{
			((Button) arg0.getSource()).setLabel("X");
			l=1;
			
			if(but1.getActionCommand()!=""&&but5.getActionCommand()!=""&&but9.getActionCommand()!=""&&but1.getActionCommand()==but5.getActionCommand()&&but9.getActionCommand()==but5.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but7.getActionCommand()!=""&&but5.getActionCommand()!=""&&but3.getActionCommand()!=""&&but3.getActionCommand()==but5.getActionCommand()&&but7.getActionCommand()==but5.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but1.getActionCommand()!=""&&but2.getActionCommand()!=""&&but3.getActionCommand()!=""&&but1.getActionCommand()==but2.getActionCommand()&&but2.getActionCommand()==but3.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but4.getActionCommand()!=""&&but5.getActionCommand()!=""&&but6.getActionCommand()!=""&&but4.getActionCommand()==but5.getActionCommand()&&but5.getActionCommand()==but6.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but7.getActionCommand()!=""&&but8.getActionCommand()!=""&&but9.getActionCommand()!=""&&but7.getActionCommand()==but8.getActionCommand()&&but8.getActionCommand()==but9.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but1.getActionCommand()!=""&&but4.getActionCommand()!=""&&but7.getActionCommand()!=""&&but1.getActionCommand()==but4.getActionCommand()&&but4.getActionCommand()==but7.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but2.getActionCommand()!=""&&but5.getActionCommand()!=""&&but8.getActionCommand()!=""&&but2.getActionCommand()==but5.getActionCommand()&&but5.getActionCommand()==but8.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			else if(but3.getActionCommand()!=""&&but6.getActionCommand()!=""&&but9.getActionCommand()!=""&&but3.getActionCommand()==but6.getActionCommand()&&but6.getActionCommand()==but9.getActionCommand())
			{
				result.setText("***********PLAYERS 1 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				l=0;
				
			}
			
		}
		else if(str.equals("")&&l==1)
		{
			((Button) arg0.getSource()).setLabel("O");
			l=0;
			
			if(but1.getActionCommand()!=""&&but5.getActionCommand()!=""&&but9.getActionCommand()!=""&&but1.getActionCommand()==but5.getActionCommand()&&but9.getActionCommand()==but5.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
			
				
			}
			else if(but7.getActionCommand()!=""&&but5.getActionCommand()!=""&&but3.getActionCommand()!=""&&but3.getActionCommand()==but5.getActionCommand()&&but7.getActionCommand()==but5.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but1.getActionCommand()!=""&&but2.getActionCommand()!=""&&but3.getActionCommand()!=""&&but1.getActionCommand()==but2.getActionCommand()&&but2.getActionCommand()==but3.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but4.getActionCommand()!=""&&but5.getActionCommand()!=""&&but6.getActionCommand()!=""&&but4.getActionCommand()==but5.getActionCommand()&&but5.getActionCommand()==but6.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but7.getActionCommand()!=""&&but8.getActionCommand()!=""&&but9.getActionCommand()!=""&&but7.getActionCommand()==but8.getActionCommand()&&but8.getActionCommand()==but9.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but1.getActionCommand()!=""&&but4.getActionCommand()!=""&&but7.getActionCommand()!=""&&but1.getActionCommand()==but4.getActionCommand()&&but4.getActionCommand()==but7.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but2.getActionCommand()!=""&&but5.getActionCommand()!=""&&but8.getActionCommand()!=""&&but2.getActionCommand()==but5.getActionCommand()&&but5.getActionCommand()==but8.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			else if(but3.getActionCommand()!=""&&but6.getActionCommand()!=""&&but9.getActionCommand()!=""&&but3.getActionCommand()==but6.getActionCommand()&&but6.getActionCommand()==but9.getActionCommand())
			{
				result.setText("***********PLAYERS 2 WINS***********");
				but1.setEnabled(false);
				but2.setEnabled(false);
				but3.setEnabled(false);
				but4.setEnabled(false);
				but5.setEnabled(false);
				but6.setEnabled(false);
				but7.setEnabled(false);
				but8.setEnabled(false);
				but9.setEnabled(false);
				
			}
			
		}
		if(but1.getActionCommand()!=""&&but2.getActionCommand()!=""&&but3.getActionCommand()!=""&&but4.getActionCommand()!=""&&but5.getActionCommand()!=""&&but6.getActionCommand()!=""&&but7.getActionCommand()!=""&&but8.getActionCommand()!=""&&but9.getActionCommand()!="")
		{
			result.setText("*****************DRAW******************");
			but1.setEnabled(false);
			but2.setEnabled(false);
			but3.setEnabled(false);
			but4.setEnabled(false);
			but5.setEnabled(false);
			but6.setEnabled(false);
			but7.setEnabled(false);
			but8.setEnabled(false);
			but9.setEnabled(false);
			l=0;
			
		}
		
	}

}
