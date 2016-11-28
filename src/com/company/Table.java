package com.company;


import java.util.LinkedList;
import java.util.List;


public class Table {
    Dealer dealer;
    List<Player> players;

    public Table() {
        List<Player> players = new LinkedList<>();
        players.add(new Computer("NIKITA", new LimitIntellect(14)));
        players.add(new Computer("ANDREY", new LimitIntellect(20)));
        players.add(new Human("VASYA"));
        Dealer dealer = new Dealer();
        players.add(dealer);
    }


    public void DealCards() {
        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);



        }
    }

    public void Game() { for (Player player : players) {
        while (true) {
            System.out.println(player.name
                    + ": " +
                    player.hand.getScore()
                    + ": " +
                    player.hand);
            Command command = player.decision();
            if (command == Command.STAND)
                break;
            if (command == Command.HIT)
                dealer.deal(player);


        }
    }



    }

    public void MakeBets() {

    }
}