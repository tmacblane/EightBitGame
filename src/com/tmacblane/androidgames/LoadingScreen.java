package com.tmacblane.androidgames;

import com.tmacblane.androidgames.framework.Game;
import com.tmacblane.androidgames.framework.Graphics;
import com.tmacblane.androidgames.framework.Graphics.PixmapFormat;
import com.tmacblane.androidgames.framework.Screen;

public class LoadingScreen extends Screen{

	public LoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics graphics = game.getGraphics();
		
		Assets.background = graphics.newPixmap("background.png", PixmapFormat.RGB565);
		Assets.logo = graphics.newPixmap("logo.png", PixmapFormat.ARGB4444);
		Assets.mainMenu = graphics.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
		Assets.buttons = graphics.newPixmap("buttons.png", PixmapFormat.ARGB4444);
		
		// Settings.load(game.getFileIO());
		game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		
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
