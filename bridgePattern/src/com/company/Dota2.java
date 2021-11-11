package com.company;

public class Dota2 extends Game{
    protected Dota2(GameDeveloper gameDeveloper) {
        super(gameDeveloper);
    }

    @Override
    public void developGame() {
        System.out.println("Dota 2 is in a progress");
        gameDeveloper.writeGameCode();
    }
}
