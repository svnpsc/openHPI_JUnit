package de.hpi.javaide.breakout.elements.paddle;

import java.awt.Dimension;
import java.awt.Point;

import de.hpi.javaide.breakout.basics.RectangleData;
import de.hpi.javaide.breakout.starter.Game;

class PaddleData extends RectangleData {
	
	private double speed;
	
	PaddleData(Point position, Dimension dimension) {
		super(position, dimension);
		speed = Game.INITIAL_SPEED;
	}

	public void changeSpeed(double value) {
		this.speed = value;
	}

	public double getSpeed() {
		return speed;
	}
	
	//TODO this class just stores the data and provides access to it.
	
}
