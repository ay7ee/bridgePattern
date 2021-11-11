package com.company;

public abstract class Game {
    protected GameDeveloper gameDeveloper;

    protected Game(GameDeveloper gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public abstract void developGame();
}
