package de.hpi.javaide.breakout.elements.paddle;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import de.hpi.javaide.breakout.starter.Game;

class PaddleLogic {
	
	private PaddleData data;
	
	PaddleLogic(PaddleData data) {
		this.data = data;
	}

	public Point getCenter() {
		return new Point(data.getX(), data.getY());
	}

	public void move(int toX, int fromX) {
		data.changeSpeed(Math.abs(toX - fromX));
		data.setPosition(new Point(toX, data.getY()));
	}

	public double getSpeed() {
		return data.getSpeed();
	}

	public boolean intersects(Shape shape) {
		return shape.intersects((Rectangle2D) data.getGeometry());
	}

	//TODO hier fehlt noch was
}
