package com.bombarder;

public class PlayerUI {

    private PlayerSearchService searchService = new PlayerSearchService();

    public void printAlPlayers(){
        searchService.getAllPlayers().subscribe(System.out::println);
    }

    public static void main(String[] args) {
        PlayerUI UI = new PlayerUI();
        UI.printAlPlayers();
    }
}
