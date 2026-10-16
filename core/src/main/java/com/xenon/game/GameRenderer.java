package com.xenon.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class GameRenderer {
    private OrthographicCamera camera;
    private FitViewport viewport;
    private ShapeRenderer shape;

    private static final float WORLD_WIDTH = 1280f;
    private static final float WORLD_HEIGHT = 720f;
    private static final float GROUND_Y = 160f;


    public GameRenderer() {
        camera = new OrthographicCamera();
        viewport = new FitViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);
        shape = new ShapeRenderer();
        viewport.apply(true);
    }

    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }
    public void render(Player player) {
        camera.update();
        shape.setProjectionMatrix(camera.combined);

        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        shape.begin(ShapeRenderer.ShapeType.Filled);

        shape.setColor(Color.GRAY);
        shape.rect(0, 0, WORLD_WIDTH, GROUND_Y);

        shape.setColor(Color.RED);
        shape.rect(player.getX(), player.getY(), player.getWidth(), player.getHeight());

        shape.end();
    }

    public void dispose() {
        shape.dispose();
    }
}
