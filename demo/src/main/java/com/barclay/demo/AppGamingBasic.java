package com.barclay.demo;

import com.barclay.demo.game.GameRunner;
import com.barclay.demo.game.MarioGame;
import com.barclay.demo.game.PacmanGame;
import com.barclay.demo.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();

	}

}
