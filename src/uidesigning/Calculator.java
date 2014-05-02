package uidesigning;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Calculator extends JFrame {

	JButton calcButton = new JButton("Calculate");
	JTextArea area = new JTextArea(20, 20);
	JLabel jLabelNum1 = new JLabel("Number 1");
	private int clicks = 0;
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}
	public Calculator() {
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setResizable(false);
	   this.setName("My Frame Name");
	   this.setTitle("Welcome to the jungle");
	   this.setSize(400, 400);
	   this.setVisible(true);
	   
	   
	   LayoutManager layout = new FlowLayout();
	JPanel jPanel = new  JPanel(layout);
    calcButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(calcButton)) {
				area.append("CLicks = "+(++clicks)+"\n");	
			}
			
		}
	});
    
	
	
	jPanel.add(calcButton);
	JScrollPane jScrollPane = new JScrollPane( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	area.add(jScrollPane);
	jScrollPane.setVisible(true);
	jPanel.add(area);
	this.add(jPanel);
	   
	}
	
}
