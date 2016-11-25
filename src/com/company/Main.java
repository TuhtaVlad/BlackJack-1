package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();
        players.add(new Computer("comp1", new LimitIntellect(14)));
        players.add(new Computer("comp2", new LimitIntellect(20)));
        players.add(new Human("VASYA"));
        Dealer dealer = new Dealer();
        players.add(dealer);

        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);

        }


        for (Player player: players){
            while (true){
                System.out.println(player.hand.getScore()
                +": "+
                player.hand);
            Command command = player.decision();
                if (command==Command.STAND)
                    break;
                if (command==Command.HIT)
                    dealer.deal(player);

            }


        }
    }
}
