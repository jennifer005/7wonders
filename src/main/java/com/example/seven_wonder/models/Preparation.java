package com.example.seven_wonder.models;

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
    ProgressCoins progressCoins = new ProgressCoins(1, "Urbanisme", "Lorsque vous prenez une carte Grise, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(2, "Artisanat", "Lorsque vous prenez une carte Grise, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(3, "Joaillerie", "Lorsque vous prenez une carte Grise ou une carte Jaune, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(4, "Science", "Lorsque vous prenez une carte Verte, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(5, "Propagande", "Lorsque vous prenez une carte Rouge, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(6, "Architecture", "Lorsque vous construisez une Etape, choisissez 1 carte supplémentaire parmi les 3 disponibles", null);
    ProgressCoins progressCoins = new ProgressCoins(7, "Economie", "1 carte Jaune en votre possession vous offre 2 Pièces au lieu d'une seule ", null);
    ProgressCoins progressCoins = new ProgressCoins(8, "Ingénierie", "Lorsque vous construisez une Etape, vous pouvez utiliser n'importe quelle Ressource sans tenir compte de la restriction identique ou différente", null);
    ProgressCoins progressCoins = new ProgressCoins(9, "Tactique", "Ajoutez 2 Boucliers à votre total de Boucliers", null);
    ProgressCoins progressCoins = new ProgressCoins(10, "Décoration", "A la fin de la partie, gagnez 4 points de victoire si votre merveille est encore en construction ou 6 points de victoire si vous avez terminé sa construction", null);
    ProgressCoins progressCoins = new ProgressCoins(11, "Politique", "A la fin de la partie, gagnez 1 point de victoire par icone chat présente sur vos cartes Bleues ", null);
    ProgressCoins progressCoins = new ProgressCoins(12, "Stratégie", "A la fin de la partie, gagnez 1 point de victoire par jeton Victoire Militaire en votre possession ", null);
    ProgressCoins progressCoins = new ProgressCoins(13, "Education", "A la fin de la partie, gagnez 2 points de victoire par jeton Progrès en votre possession", null);
    ProgressCoins progressCoins = new ProgressCoins(14, "Culture", "Ce jeton est présent en 2 exemplaires. A la fin de la partie, gagnez 4 points de victoire si vous en avez 1, ou 12 points de victoire si vous avez les 2", null);

    
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
