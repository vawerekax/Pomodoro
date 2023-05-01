package view;

import java.awt.Component;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import model.Environment;

public class MainWindow extends JFrame implements PropertyChangeListener {
	public static final Dimension DIMENSION = new Dimension(500,300);
	
	private static final String WINDOW_TITLE = "Pomodoro Timer";
	private MainPanel panel;
	private Environment e;
	
	public MainWindow(MainPanel panel, Environment e) {
		this.panel = panel;
		this.e = e;
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(WINDOW_TITLE);
		setSize(DIMENSION);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("run")){
			repaint();
			panel.repaint();
		}
	}
}
