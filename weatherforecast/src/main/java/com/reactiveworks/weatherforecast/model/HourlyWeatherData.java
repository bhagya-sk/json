package com.reactiveworks.weatherforecast.model;

import java.util.Arrays;

public class HourlyWeatherData {
	
	private String summary;
	private String icon;
	private HourlyData[] data;
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
	public HourlyData[] getData() {
		return data;
	}
	public void setData(HourlyData[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "HourlyWeatherData [summary=" + summary + ", icon=" + icon + ", data=" + Arrays.toString(data) + "]";
	}
	

}
