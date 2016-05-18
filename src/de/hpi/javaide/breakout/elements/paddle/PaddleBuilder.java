package de.hpi.javaide.breakout.elements.paddle;

import java.awt.Dimension;
import java.awt.Point;

import de.hpi.javaide.breakout.interfaces.Builder;
import de.hpi.javaide.breakout.starter.Game;

public class PaddleBuilder implements Builder<Paddle> {
	
	Point position;
	Game game;
	
	public PaddleBuilder(Point position, Game game) {
		this.position = position;
		this.game = game;
	}
	
	public Paddle build() {
		Dimension size = new Dimension(Paddle.WIDTH, Paddle.HEIGHT);
		PaddleData data = new PaddleData(position, size);
		PaddleLogic logic = new PaddleLogic(data);
		PaddleDisplay display = new PaddleDisplay(game, data);
		return new Paddle(logic, display);
	}

}
