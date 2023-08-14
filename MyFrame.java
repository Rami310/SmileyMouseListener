import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon happy, anxious, kiss, love;
	
	MyFrame(){
		ImageIcon icon = new ImageIcon("sm.png");
		
		anxious = new ImageIcon("anxiousEmoji.png");
		happy = new ImageIcon("happyEmoji.png");
		kiss = new ImageIcon("kissEmoji.png");
		love = new ImageIcon("lovedEmoji.png");
		
		label = new JLabel();
		label.addMouseListener(this);
		
		label.setIcon(happy);
		
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(kiss);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(love);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setIcon(anxious);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(happy);
	}
	
}
