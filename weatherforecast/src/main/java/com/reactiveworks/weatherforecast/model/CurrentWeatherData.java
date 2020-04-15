package com.reactiveworks.weatherforecast.model;

public class CurrentWeatherData {

	private double temperature;
	private double windSpeed;
	private double humidity;
	private int windBearing;
	private double cloudCover;
	private Long time;
	private double dewPoint;
	private String summary;
	private String icon;
	private int precipIntensity;
	private double visibility;
	private int nearestStormBearing;
	private double apparentTemperature;
	private double pressure;
	private int precipProbability;
	private int nearestStormDistance;
	private double ozone;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public int getWindBearing() {
		return windBearing;
	}

	public void setWindBearing(int windBearing) {
		this.windBearing = windBearing;
	}

	public double getCloudCover() {
		return cloudCover;
	}

	public void setCloudCover(double cloudCover) {
		this.cloudCover = cloudCover;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public double getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}

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

	public int getPrecipIntensity() {
		return precipIntensity;
	}

	public void setPrecipIntensity(int precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public int getNearestStormBearing() {
		return nearestStormBearing;
	}

	public void setNearestStormBearing(int nearestStormBearing) {
		this.nearestStormBearing = nearestStormBearing;
	}

	public double getApparentTemperature() {
		return apparentTemperature;
	}

	public void setApparentTemperature(double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public int getPrecipProbability() {
		return precipProbability;
	}

	public void setPrecipProbability(int precipProbability) {
		this.precipProbability = precipProbability;
	}

	public int getNearestStormDistance() {
		return nearestStormDistance;
	}

	public void setNearestStormDistance(int nearestStormDistance) {
		this.nearestStormDistance = nearestStormDistance;
	}

	public double getOzone() {
		return ozone;
	}

	public void setOzone(double ozone) {
		this.ozone = ozone;
	}

	@Override
	public String toString() {
		return "CurrentWeatherData [temperature=" + temperature + ", windSpeed=" + windSpeed + ", humidity=" + humidity
				+ ", windBearing=" + windBearing + ", cloudCover=" + cloudCover + ", time=" + time + ", dewPoint="
				+ dewPoint + ", summary=" + summary + ", icon=" + icon + ", precipIntensity=" + precipIntensity
				+ ", visibility=" + visibility + ", nearestStormBearing=" + nearestStormBearing
				+ ", apparentTemperature=" + apparentTemperature + ", pressure=" + pressure + ", precipProbability="
				+ precipProbability + ", nearestStormDistance=" + nearestStormDistance + ", ozone=" + ozone + "]";
	}

}
