package com.reactiveworks.weatherforecast.model;

import java.util.Arrays;

public class MinutelyWeatherData {

	private String summary;
	private String icon;
	private Minutelydata[] data;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Minutelydata[] getData() {
		return data;
	}

	public void setData(Minutelydata[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MinutelyWeatherData [summary=" + summary + ", icon=" + icon + ", data=" + Arrays.toString(data) + "]";
	}

}
