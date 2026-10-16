package com.xenon.game;

public class Player {
    private float x;
    private float y;
    private float width;
    private float height;

    public Player( float x, float y, float width, float height ) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public float getX() {
        return x;
    }
    public void setX( float x ) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY( float y ) {
        this.y = y;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth( float width ) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight( float height ) {
        this.height = height;
    }
}

