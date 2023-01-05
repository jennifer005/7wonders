package com.example.seven_wonder;

import com.example.seven_wonder.models.Cards;
import com.example.seven_wonder.models.Player;
import com.example.seven_wonder.models.ProgressCoins;
import com.example.seven_wonder.models.Wonders;

import java.util.ArrayList;
import java.util.List;

public class Preparation { // PREPARATION MISE EN PLACE DU JEU

    // 7 merveilles
    Wonders wonders1 = new Wonders(1, "Rhodes", new ArrayList<>(), null, 0, "wonder1.png");
    Wonders wonders2 = new Wonders(2, "Olympie", new ArrayList<>(), null, 0, "wonder2.png");

    // 15 jetons
    ProgressCoins progressCoins = new ProgressCoins(1, "Urbanisme", "Lorsque vous prenez une carte Grise choisissez 1 carte supplémentaire parmi les 3 disponibles", null);

    /*
    235 cartes -
    7 cartes merveilles
    40 cartes rouges
    40 cartes vertes
    40 cartes bleues
    40 cartes jaunes
     */

    Cards cards = new Cards(1, "rouge", "bataille", 0, 2, null, "bouclier", null);


    Player player1 = new Player("raphael", wonders1, 0, false, null, new ArrayList<>());
    Player player2 = new Player("jennifer", wonders2, 0, false, null, new ArrayList<>());

    List<Cards> deck = new ArrayList<>();



}
