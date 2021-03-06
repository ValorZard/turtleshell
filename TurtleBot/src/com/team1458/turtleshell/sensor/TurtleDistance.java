package com.team1458.turtleshell.sensor;

/**
 * A distance sensor.
 * @author mehnadnerd
 *
 */
public interface TurtleDistance extends TurtleSensor {
	/**
	 * Get the distance, in inches
	 * @return
	 */
	public double getDistance();
}
