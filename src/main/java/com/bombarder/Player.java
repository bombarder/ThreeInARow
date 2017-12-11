package com.bombarder;

public class Player {

    private String name;
    private int score;

    private Player() {
    }

    public static Player create(String name, int score) {
        Player player = new Player();
        player.name = name;
        player.score = score;
        return player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player name: " + name + ", score =" + score;
    }
}
