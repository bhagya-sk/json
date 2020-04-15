package com.reactiveworks.weatherforecast.model;

import java.util.Arrays;

public class Flags {

	private String[] darksky_stations;
	private String[] madis_stations;
	private String[] lamp_stations;
	private String units;
	private String[] isd_stations;
	private String[] sources;

	public String[] getDarksky_stations() {
		return darksky_stations;
	}

	public void setDarksky_stations(String[] darksky_stations) {
		this.darksky_stations = darksky_stations;
	}

	public String[] getMadis_stations() {
		return madis_stations;
	}

	public void setMadis_stations(String[] madis_stations) {
		this.madis_stations = madis_stations;
	}

	public String[] getLamp_stations() {
		return lamp_stations;
	}

	public void setLamp_stations(String[] lamp_stations) {
		this.lamp_stations = lamp_stations;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String[] getIsd_stations() {
		return isd_stations;
	}

	public void setIsd_stations(String[] isd_stations) {
		this.isd_stations = isd_stations;
	}

	public String[] getSources() {
		return sources;
	}

	public void setSources(String[] sources) {
		this.sources = sources;
	}

	@Override
	public String toString() {
		return "Flags [darksky_stations=" + Arrays.toString(darksky_stations) + ", madis_stations="
				+ Arrays.toString(madis_stations) + ", lamp_stations=" + Arrays.toString(lamp_stations) + ", units="
				+ units + ", isd_stations=" + Arrays.toString(isd_stations) + ", sources=" + Arrays.toString(sources)
				+ "]";
	}

}
