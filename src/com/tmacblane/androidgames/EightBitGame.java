package com.tmacblane.androidgames;

import com.tmacblane.androidgames.framework.Screen;
import com.tmacblane.androidgames.framework.impl.AndroidGame;

public class EightBitGame extends AndroidGame {
	
    /** Called when the activity is first created. */
    @Override
    public Screen getStartScreen() {
    	return new LoadingScreen(this);
    }
    
    // display main screen controls (new, load, options)
}