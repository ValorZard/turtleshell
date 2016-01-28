package com.team1458.turtleshell;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Output {
	
	/**
	 * Just spew something to the SmartDashboard
	 * @param o Object to spew
	 */
	public static void spew(Object o) {
		SmartDashboard.putString(o.hashCode()+"", o.toString());
	}
	public static void outputNumber(String s, Number n) {
		SmartDashboard.putNumber(s, n.doubleValue());
	}
	public static void syso(Object o) {
		System.out.println(o);
	}
}
