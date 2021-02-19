import java.applet.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener,MouseMotionListener {
	
	String msg = "";
	int mouseX = 0, mouseY = 0;
	
	public MouseEvents() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent me) {
		msg = msg + "--Mouse clicked.";
		repaint();
	}

	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}

	public void mouseExited(MouseEvent me) {
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse exited.";
		repaint();
	}

	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}

	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}

	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at "+mouseX+","+mouseY);
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at "+me.getX()+","+me.getY());
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg,mouseX,mouseY);
	}

	public static void main(String[] args) {
	
		MouseEvents app = new MouseEvents();

		app.setSize(new Dimension(300,300));
		app.setTitle("Mouse Events Demo");
		app.setVisible(true);
	}
}

class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}