package com.company;

public class Steam {

    public static void main(String[] args) {
	Game csgo = new Csgo(new JavaGameDeveloper());
        csgo.developGame();
	Game dota2 = new Dota2(new CppGameDeveloper());
        dota2.developGame();
    }
}