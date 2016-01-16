package com.team1458.turtleshell;

public abstract class TurtleTankChassis extends TurtleChassis {

	/**
	 * Drive the motors on the right side
	 * @param power Signed double -1 to 1 for power
	 */
	public abstract void rightDrive(double power);
	/**
	 * Drive the motors on the left side
	 * @param power Signed double -1 to 1 for power
	 */
	public abstract void leftDrive(double power);
	
	public void tankDrive(double lPower, double rPower) {
		leftDrive(lPower);
		rightDrive(rPower);
	}
	@Override
	public void straightDrive(double power) {
		tankDrive(power,power);
	}
	public void turn(double power) {
		tankDrive(power,-power);
	}
	/**
	 * Drive all motors at once, is left, right
	 */
	public void allDrive(double[] allMotorPowers) {
		tankDrive(allMotorPowers[0],allMotorPowers[1]);
	}
	
	/**
	 * Get the wheelbase of the Tank Chassis.
	 * @return The wheelbase (distance between wheels) in inches.
	 */
	public abstract double getWheelBase();
	
	/**
	 * Get the diameter of the wheels.
	 * @return Diameter of wheels in inches
	 */
	public abstract double getWheelDiameter();
}
