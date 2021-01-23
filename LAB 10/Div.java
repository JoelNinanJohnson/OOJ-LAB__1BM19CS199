import java.awt.*;
import java.awt.event.*;

class MyDialog extends Dialog implements ActionListener {
	
	Div bld;
	
	MyDialog(Frame parent,String title)  {

		super(parent,title,false);
		bld = (Div)parent;
		setLayout(new FlowLayout());
		setSize(300,200);
		add(new Label(bld.msg1));
		Button b;
		add(b = new Button("OK"));
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		dispose();
	}
}

public class Div extends Frame implements ActionListener {
	
	TextField num1,num2,result;
	String msg="",msg1="";
	Button divide;

	public Div() {
		setLayout(new FlowLayout());
		Label pnum1 = new Label("Num1: ",Label.RIGHT);
		Label pnum2 = new Label("Num2: ",Label.RIGHT);
		Label presult = new Label("Result: ",Label.RIGHT);
		Button  b = new Button("Divide");

		num1 = new TextField(8);
		num2 = new TextField(8);
		result = new TextField(8);

		add(pnum1);
		add(num1);
		add(pnum2);
		add(num2);
		divide = (Button)add(b);
		add(presult);
		add(result);

		num1.addActionListener(this);
		num2.addActionListener(this);
		divide.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});	
	}

	public void actionPerformed(ActionEvent ae) {
		    
		if(ae.getSource() == divide) {
			try {
				msg=""+Integer.parseInt(num1.getText())/Integer.parseInt(num2.getText());
				String c = ""+msg;
				result.setText(c);
				msg1 = "";
	                } catch(NumberFormatException e) {
			        msg1 = "Entered number is not an integer "+e;
			        MyDialog d = new MyDialog(this, "Dialog");
				d.setVisible(true);
			} catch(ArithmeticException e) {
			        msg1 = "Number 2 is zero "+e;
			        MyDialog d = new MyDialog(this, "Dialog");
				d.setVisible(true);
			}
		}
	}

	public static void main(String args[]) {
		Div app = new Div();
		app.setSize(new Dimension(400,200));
		app.setTitle("Lab 10");
		app.setVisible(true);
	}	
}