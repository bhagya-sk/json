package com.reactiveworks.weatherforecast.model;

public class DailyData {

	private double windSpeed;
	private double pressure;
	private double precipIntensity;
	private Long time;
	private String summary;
	private Long sunsetTime;
	private Long apparentTemperatureMaxTime;
	private String icon;
	private double moonPhase;
	private Long sunriseTime;
	private double temperatureMin;
	private Long apparentTemperatureMinTime;
	private double visibility;
	private Long temperatureMinTime;
	private double apparentTemperatureMin;
	private double precipIntensityMax;
	private double humidity;
	private double dewPoint;
	private String precipType;
	private int windBearing;
	private Long precipIntensityMaxTime;
	private double cloudCover;
	private double ozone;
	private double precipProbability;
	private double temperatureMax;
	private Long temperatureMaxTime;
	private double apparentTemperatureMax;

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getPrecipIntensity() {
		return precipIntensity;
	}

	public void setPrecipIntensity(double precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getSunsetTime() {
		return sunsetTime;
	}

	public void setSunsetTime(Long sunsetTime) {
		this.sunsetTime = sunsetTime;
	}

	public Long getApparentTemperatureMaxTime() {
		return apparentTemperatureMaxTime;
	}

	public void setApparentTemperatureMaxTime(Long apparentTemperatureMaxTime) {
		this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public double getMoonPhase() {
		return moonPhase;
	}

	public void setMoonPhase(double moonPhase) {
		this.moonPhase = moonPhase;
	}

	public Long getSunriseTime() {
		return sunriseTime;
	}

	public void setSunriseTime(Long sunriseTime) {
		this.sunriseTime = sunriseTime;
	}

	public double getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public Long getApparentTemperatureMinTime() {
		return apparentTemperatureMinTime;
	}

	public void setApparentTemperatureMinTime(Long apparentTemperatureMinTime) {
		this.apparentTemperatureMinTime = apparentTemperatureMinTime;
	}

	public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public Long getTemperatureMinTime() {
		return temperatureMinTime;
	}

	public void setTemperatureMinTime(Long temperatureMinTime) {
		this.temperatureMinTime = temperatureMinTime;
	}

	public double getApparentTemperatureMin() {
		return apparentTemperatureMin;
	}

	public void setApparentTemperatureMin(double apparentTemperatureMin) {
		this.apparentTemperatureMin = apparentTemperatureMin;
	}

	public double getPrecipIntensityMax() {
		return precipIntensityMax;
	}

	public void setPrecipIntensityMax(double precipIntensityMax) {
		this.precipIntensityMax = precipIntensityMax;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}

	public String getPrecipType() {
		return precipType;
	}

	public void setPrecipType(String precipType) {
		this.precipType = precipType;
	}

	public int getWindBearing() {
		return windBearing;
	}

	public void setWindBearing(int windBearing) {
		this.windBearing = windBearing;
	}

	public Long getPrecipIntensityMaxTime() {
		return precipIntensityMaxTime;
	}

	public void setPrecipIntensityMaxTime(Long precipIntensityMaxTime) {
		this.precipIntensityMaxTime = precipIntensityMaxTime;
	}

	public double getCloudCover() {
		return cloudCover;
	}

	public void setCloudCover(double cloudCover) {
		this.cloudCover = cloudCover;
	}

	public double getOzone() {
		return ozone;
	}

	public void setOzone(double ozone) {
		this.ozone = ozone;
	}

	public double getPrecipProbability() {
		return precipProbability;
	}

	public void setPrecipProbability(double precipProbability) {
		this.precipProbability = precipProbability;
	}

	public double getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public Long getTemperatureMaxTime() {
		return temperatureMaxTime;
	}

	public void setTemperatureMaxTime(Long temperatureMaxTime) {
		this.temperatureMaxTime = temperatureMaxTime;
	}

	public double getApparentTemperatureMax() {
		return apparentTemperatureMax;
	}

	public void setApparentTemperatureMax(double apparentTemperatureMax) {
		this.apparentTemperatureMax = apparentTemperatureMax;
	}

	@Override
	public String toString() {
		return "DailyData [windSpeed=" + windSpeed + ", pressure=" + pressure + ", precipIntensity=" + precipIntensity
				+ ", time=" + time + ", summary=" + summary + ", sunsetTime=" + sunsetTime
				+ ", apparentTemperatureMaxTime=" + apparentTemperatureMaxTime + ", icon=" + icon + ", moonPhase="
				+ moonPhase + ", sunriseTime=" + sunriseTime + ", temperatureMin=" + temperatureMin
				+ ", apparentTemperatureMinTime=" + apparentTemperatureMinTime + ", visibility=" + visibility
				+ ", temperatureMinTime=" + temperatureMinTime + ", apparentTemperatureMin=" + apparentTemperatureMin
				+ ", precipIntensityMax=" + precipIntensityMax + ", humidity=" + humidity + ", dewPoint=" + dewPoint
				+ ", precipType=" + precipType + ", windBearing=" + windBearing + ", precipIntensityMaxTime="
				+ precipIntensityMaxTime + ", cloudCover=" + cloudCover + ", ozone=" + ozone + ", precipProbability="
				+ precipProbability + ", temperatureMax=" + temperatureMax + ", temperatureMaxTime="
				+ temperatureMaxTime + ", apparentTemperatureMax=" + apparentTemperatureMax + "]";
	}

}
