package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		GuestBook run = new GuestBook();
	}
	GuestBook(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Add name");
	button2.setText("View Names");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== button1) {
			String addName = JOptionPane.showInputDialog("Enter a name.");
			names.add(addName);
		}
		if(e.getSource()==button2) {
			String display = "";
			for(int i = 0; i< names.size();i++) {
		display+= "Guest #" + (i+1) + ": "+ names.get(i)+ "\n";
	}
			JOptionPane.showMessageDialog(null, display);
		}
		
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
