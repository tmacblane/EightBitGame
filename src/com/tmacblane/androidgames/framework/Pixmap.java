package com.tmacblane.androidgames.framework;

import com.tmacblane.androidgames.framework.Graphics.PixmapFormat;

public interface Pixmap {
	public int getWidth();
	public int getHeight();
	public PixmapFormat getFormat();
	public void dispose();
}
