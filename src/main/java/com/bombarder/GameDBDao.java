package com.bombarder;

public class GameDBDao {

    private static GameDBDao service = new GameDBDao();

    public static GameDBDao get() {
        return service;
    }

    Player[] getAllPlayersFromDB() {
        return createPlayers();

    }

    private Player[] createPlayers() {
        Player[] array = {
                Player.create("Sammy", 0),
                Player.create("Peter", 0),
                Player.create("Helen", 0),
                Player.create("Antony", 0),
        };
        return array;
    }
}
