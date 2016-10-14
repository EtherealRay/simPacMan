package com.jittat.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
    private PacmanGame pacmanGame;
    private Texture pacmanImg;
    private Pacman pacman;
    public SpriteBatch batch;
    World world;
    
    public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
 
        this.world = world;
        pacman = world.getPacman();
        pacmanImg = new Texture("pacman.png");
    }
    
    public void render(float delta) {
        SpriteBatch batch = pacmanGame.batch;
        Vector2 pos = pacman.getPosition();
        batch.begin();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
    }

}
