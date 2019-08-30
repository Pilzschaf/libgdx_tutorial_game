package de.pilzschaf.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {

	public GameScreen() {

	}

	@Override
	public void render(float delta) {
		super.render(delta);
		Gdx.gl.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}
