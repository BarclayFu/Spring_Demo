package com.barclay.demo;

import com.barclay.demo.game.GameRunner;
import com.barclay.demo.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();

	}

}
