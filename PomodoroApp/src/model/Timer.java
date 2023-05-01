package model;

public class Timer {
//	Times in milliseconds
	public static int MIN25 = 1500000;
//	ms in one second
	public static int MS_IN_MIN = 60000;
	
	private int maxTime, timeLeft; //in milliseconds

	public Timer() {
		maxTime = MIN25;
		timeLeft = maxTime;
	}
	
	public void reduceTime() {
		timeLeft -= Environment.DELAY;
	}
	
	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}

	public int getTimeLeft() {
		return timeLeft;
	}
	
	public void resetTime() {
		timeLeft = maxTime;
	}
	
	public String timeToString() {
		int minutes;
		int seconds;
		minutes = timeLeft/MS_IN_MIN;
		seconds = (timeLeft%MS_IN_MIN)/1000;
		return String.format("%02d", minutes)+ ":"+String.format("%02d", seconds);
	}
	
	
	
	
}
