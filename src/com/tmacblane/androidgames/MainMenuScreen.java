package com.tmacblane.androidgames;

import com.tmacblane.androidgames.framework.Game;
import com.tmacblane.androidgames.framework.Graphics;
import com.tmacblane.androidgames.framework.Screen;

public class MainMenuScreen extends Screen {
	
	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void present(float deltaTime) {
		Graphics graphics = game.getGraphics();
        
		graphics.drawPixmap(Assets.background, 0, 0);
		graphics.drawPixmap(Assets.logo, 32, 20);
		graphics.drawPixmap(Assets.mainMenu, 64, 220);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
