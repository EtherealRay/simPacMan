package com.jittat.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
    private PacmanGame pacmanGame;
    private Texture pacmanImg;
    private Pacman pacman;
    public SpriteBatch batch;
    private MazeRenderer mazeRenderer;
    World world;
    
    public WorldRenderer(PacmanGame pacmanGame, World world) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
        this.world = world;
        pacman = world.getPacman();
        pacmanImg = new Texture("pacman.png");
    }
    
    public void render(float delta) {
        mazeRenderer.render();
        SpriteBatch batch = pacmanGame.batch;
        Vector2 pos = pacman.getPosition();
        batch.begin();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
    }

}
