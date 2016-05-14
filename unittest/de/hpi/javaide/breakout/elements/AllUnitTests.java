package de.hpi.javaide.breakout.elements;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.hpi.javaide.breakout.elements.ball.BallTest;
import de.hpi.javaide.breakout.elements.balldepot.BallDepotTest;
import de.hpi.javaide.breakout.elements.brick.BrickTest;
import de.hpi.javaide.breakout.elements.paddle.PaddleTest;
import de.hpi.javaide.breakout.elements.wall.WallTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BallTest.class,
	BrickTest.class,
	PaddleTest.class,
	WallTest.class,
	BallDepotTest.class
})

public class AllUnitTests {}
