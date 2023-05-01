package model;

import javax.swing.SwingWorker;

import view.MainPanel;

public class Environment extends SwingWorker<Object, String>{
	private static String PAUSED = "paused";
	private static String PLAY = "play";
	
	public static int DELAY = 100;
	private boolean actif = true;
	private Timer timer;
	private String state = PAUSED;
	
	public Environment() {
		timer = new Timer();
	}
	@Override
	protected Object doInBackground() throws Exception {
		while(actif) {
			Thread.sleep(DELAY);
			if(!state.equals(PAUSED)) {
				timer.reduceTime();
			}	
		}
		firePropertyChange("run", null, null);
		return null;
	}
	
	public Timer getTimer() {
		return timer;
	}
}
