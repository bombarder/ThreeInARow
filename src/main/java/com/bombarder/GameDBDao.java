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
                Player.create("Sammy", 12),
                Player.create("Peter", 30),
                Player.create("Helen", 45),
                Player.create("Antony", 5),
        };
        return array;
    }
}
