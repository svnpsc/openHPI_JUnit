package de.hpi.javaide.breakout.elements.paddle;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import java.awt.Point;

import de.hpi.javaide.breakout.starter.Game;

public class PaddleBuilderTest {
	
	@Test
	public void itShouldBuildAPaddle() {
		Point position = mock(Point.class);
		Game game = mock(Game.class);
		PaddleBuilder builder = new PaddleBuilder(position, game);
		
		Paddle paddle = builder.build();
		
		assertNotNull("PaddleBuilder did not built a paddle.", paddle);
	}

}
