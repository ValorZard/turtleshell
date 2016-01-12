package com.team1458.turtleshell;

public class TurtlePID {
	protected final double kP;
	protected final double kI;
	protected final double kD;
	public TurtlePID(double kP, double kI, double kD) {
		this.kP=kP;
		this.kI=kI;
		this.kD=kD;
	}
	/**
	 * A simple PID function, using the k that are created with the object
	 * @return
	 */
	public double simplePID(double value, double integralvalue, double derivativevalue, double target, double integraltarget, double derivativetarget) {
		return kP*(value-target)+kI*(integralvalue-integraltarget)+kD*(derivativevalue-derivativetarget);
	}
}