package view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Environment;

public class MainPanel extends JPanel {
//	private Font font = new Font();
	private Image background;
	private Image bubble;
	private JButton pause, start, changeMode;
	private JLabel timer, mode;
	private Environment e;
	private String time;
	private char a = 'a';
	
	public MainPanel(Environment e2){
		this.e = e2;
		try {
			bubble = ImageIO.read(new File("src/ressources/textbubble.png"));
			background = ImageIO.read(new File("src/ressources/lots-of-tomatoes.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		this.setLayout(new GridBagLayout());	
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;

		
		pause = new JButton("PAUSE");
		start = new JButton("START");
		changeMode = new JButton("SKIP");
		

//		mode = new JLabel();
			

		add(start,gbc);
		add(pause,gbc);
		add(changeMode,gbc);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getScaledInstance(MainWindow.DIMENSION.width, MainWindow.DIMENSION.height, Image.SCALE_DEFAULT), 0, 0, null);
		g.drawImage(bubble.getScaledInstance(bubble.getWidth(null)/3,bubble.getHeight(null)/3, 0),20,20,null);
		time = e.getTimer().timeToString();
		g.drawString(""+a, 355, 50);
		a++;
	}
}
