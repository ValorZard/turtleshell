package com.team1458.turtleshell.physical;

import com.team1458.turtleshell.TurtleMotor;

import edu.wpi.first.wpilibj.Victor;

public class TurtleVictor extends TurtleMotor {
	private Victor victor;
	private boolean isReversed;

	public TurtleVictor(int port) {
		victor = new Victor(port);
	}

	public TurtleVictor(int port, boolean isReversed) {
		this(port);
		this.isReversed = isReversed;
	}

	@Override
	public void set(double power) {
		victor.set((isReversed ? -1 : 1) * power);
	}

	@Override
	public double get() {
		return (isReversed ? -1 : 1) * victor.get();
	}

	@Override
	public boolean isReversed() {
		return isReversed;
	}
}
