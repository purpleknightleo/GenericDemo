package com.lee.demo.generic.model;

public class BandStats extends Stats {

	private double band;

	public BandStats() {
		super();
	}

	public BandStats(long timestamp, double band) {
		super(timestamp);
		this.band = band;
	}

	public double getBand() {
		return band;
	}

	public void setBand(double band) {
		this.band = band;
	}
}
