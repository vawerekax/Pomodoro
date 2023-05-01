package model;

import view.MainPanel;
import view.MainWindow;

public class Run {
	
	public static void main(String[] args) {
		Environment e = new Environment();
		MainPanel panel = new MainPanel(e);
		MainWindow window = new MainWindow(panel,e);
		e.addPropertyChangeListener(window);
		e.execute();
	}

}
