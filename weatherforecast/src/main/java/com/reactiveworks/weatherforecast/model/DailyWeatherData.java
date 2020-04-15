package com.reactiveworks.weatherforecast.model;

import java.util.Arrays;

public class DailyWeatherData {

	private String summary;
	private String icon;
	private DailyData[] data;

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

	public DailyData[] getData() {
		return data;
	}

	public void setData(DailyData[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DailyWeatherData [summary=" + summary + ", icon=" + icon + ", data=" + Arrays.toString(data) + "]";
	}

}
