package com.reactiveworks.weatherforecast.model;

public class WeatherForecast {

	private int offset1;
	private HourlyWeatherData hourly;
	private double longitude;
	private DailyWeatherData daily;
	private String timezone;
	private double latitude;
	private CurrentWeatherData currently;
	private MinutelyWeatherData minutely;
	private Flags flags;

	public int getOffset() {
		return offset1;
	}

	public void setOffset(int offset) {
		this.offset1 = offset;
	}

	public HourlyWeatherData getHourly() {
		return hourly;
	}

	public void setHourly(HourlyWeatherData hourly) {
		this.hourly = hourly;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public DailyWeatherData getDaily() {
		return daily;
	}

	public void setDaily(DailyWeatherData daily) {
		this.daily = daily;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public CurrentWeatherData getCurrently() {
		return currently;
	}

	public void setCurrently(CurrentWeatherData currently) {
		this.currently = currently;
	}

	public MinutelyWeatherData getMinutely() {
		return minutely;
	}

	public void setMinutely(MinutelyWeatherData minutely) {
		this.minutely = minutely;
	}

	public Flags getFlags() {
		return flags;
	}

	public void setFlags(Flags flags) {
		this.flags = flags;
	}

	@Override
	public String toString() {
		return "WeatherForecast [offset=" + offset1 + ", hourly=" + hourly + ", longitude=" + longitude + ", daily="
				+ daily + ", timezone=" + timezone + ", latitude=" + latitude + ", currently=" + currently
				+ ", minutely=" + minutely + ", flags=" + flags + "]";
	}

}
