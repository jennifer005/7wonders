package com.example.seven_wonder.models;

import java.util.List;

public class Player {
    private String name;
    private Wonders wonders;
    private int victoryClashCoins;
    private boolean catPawn;
    private ProgressCoins progressCoins;
    private List<Cards> cards;

    public Player(String name, Wonders wonders, int victoryClashCoins, boolean catPawn, ProgressCoins progressCoins, List<Cards> cards) {
        this.name = name;
        this.wonders = wonders;
        this.victoryClashCoins = victoryClashCoins;
        this.catPawn = catPawn;
        this.progressCoins = progressCoins;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wonders getWonders() {
        return wonders;
    }

    public void setWonders(Wonders wonders) {
        this.wonders = wonders;
    }

    public int getVictoryClashCoins() {
        return victoryClashCoins;
    }

    public void setVictoryClashCoins(int victoryClashCoins) {
        this.victoryClashCoins = victoryClashCoins;
    }

    public boolean isCatPawn() {
        return catPawn;
    }

    public void setCatPawn(boolean catPawn) {
        this.catPawn = catPawn;
    }

    public ProgressCoins getProgressCoins() {
        return progressCoins;
    }

    public void setProgressCoins(ProgressCoins progressCoins) {
        this.progressCoins = progressCoins;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }
}
