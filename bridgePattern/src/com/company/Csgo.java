package com.company;

public class Csgo extends Game{
    protected Csgo(GameDeveloper gameDeveloper) {
        super(gameDeveloper);
    }

    @Override
    public void developGame() {
        System.out.println("Cs:go is in a progress");
        gameDeveloper.writeGameCode();
    }
}
