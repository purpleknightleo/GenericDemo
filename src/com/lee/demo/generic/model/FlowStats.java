package com.lee.demo.generic.model;

public class FlowStats extends Stats {

	private double flow;

	public FlowStats() {
		super();
	}

	public FlowStats(long timestamp, double flow) {
		super(timestamp);
		this.flow = flow;
	}

	public double getFlow() {
		return flow;
	}

	public void setFlow(double flow) {
		this.flow = flow;
	}

}
