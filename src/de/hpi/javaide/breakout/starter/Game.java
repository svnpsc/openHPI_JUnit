package de.hpi.javaide.breakout.starter;

import de.hpi.javaide.breakout.basics.Font;
import de.hpi.javaide.breakout.screens.Screen;
import de.hpi.javaide.breakout.screens.ScreenManager;
import processing.core.PApplet;

/**
 * This class extends Processing's PApplet and by this provides us with access to the Processing features.
 * It overrides Processing's setup() and draw() methods to setup the game and redraw the (updated) screen x times per second.
 * It also overrides the keyboard and mouse interaction methods to enable us to define the intended interaction.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
@SuppressWarnings("serial")
public class Game extends PApplet implements GameConstants {
	// Setup the game
	@Override
	public void setup() {
		settings();
	}
	
	public void settings() {
		size(SCREEN_X, SCREEN_Y);
		background(0);
		frameRate(30);
		Font.init(this);
		ScreenManager.setScreen(this, Screen.START);
	}

	// Update and draw everything in the game
	@Override
	public void draw() {
		background(0);
		ScreenManager.getCurrentScreen().update();
		ScreenManager.getCurrentScreen().display();
	}

	// Interact with the mouse
	@Override
	public void mouseMoved() {

	}

	@Override
	public void mouseDragged() {
		ScreenManager.getCurrentScreen().handleMouseDragged();
	}

	// Interact with the keyboard
	@Override
	public void keyPressed() {
		switch (key) {
		case RETURN:
		case ENTER:
			ScreenManager.getCurrentScreen().handleKeyPressed(Screen.KEY_ENTER);
			break;
		default: System.out.println("key:" + key + "/"); break;
		}
	}

	@Override
	public void keyReleased() {

	}

	public void increaseScore(int i) {
		if(ScreenManager.getCurrentScreen() != null){
			ScreenManager.getCurrentScreen().increaseScore(i);			
		}
	}
}
