package com.xenon.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class XenonGame extends ApplicationAdapter {

    private GameRenderer renderer;
    private Player player;

    @Override
    public void create() {
        player = new Player(250,160, 60 ,60);
        renderer = new GameRenderer();
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void render() {
        renderer.render(player);
    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
