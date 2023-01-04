package com.example.seven_wonder;

import com.example.seven_wonder.models.Player;
import com.example.seven_wonder.models.Wonders;

import java.util.ArrayList;

public class Gameboard {
    Wonders wonders1 = new Wonders(1, "Rhodes", new ArrayList<>(), null, 0, "wonder1.png");
    Wonders wonders2 = new Wonders(2, "Olympie", new ArrayList<>(), null, 0, "wonder2.png");
    Player player1 = new Player("raphael", wonders1, 0, false, null, null);
    Player player2 = new Player("jennifer", wonders2, 0, false, null, null);

}
