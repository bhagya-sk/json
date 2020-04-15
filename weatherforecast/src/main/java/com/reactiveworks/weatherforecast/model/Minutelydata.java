package com.reactiveworks.weatherforecast.model;

public class Minutelydata {

	private int precipProbability;
	private int time;
	private int precipIntensity;

	public int getPrecipProbability() {
		return precipProbability;
	}

	public void setPrecipProbability(int precipProbability) {
		this.precipProbability = precipProbability;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPrecipIntensity() {
		return precipIntensity;
	}

	public void setPrecipIntensity(int precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	@Override
	public String toString() {
		return "Minutelydata [precipProbability=" + precipProbability + ", time=" + time + ", precipIntensity="
				+ precipIntensity + "]";
	}

}