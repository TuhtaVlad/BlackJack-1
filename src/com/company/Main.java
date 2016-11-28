package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Table t = new Table();
        t.MakeBets();
        t.DealCards();
        t.Game();
        t.WinLows();
        t.Money();
        t.ResertCards();

        List<Player> players = new LinkedList<>();
        players.add(new Computer("NIKITA", new LimitIntellect(14)));
        players.add(new Computer("ANDREY", new LimitIntellect(20)));
        players.add(new Human("VASYA"));
        Dealer dealer = new Dealer();
        players.add(dealer);

        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);

        }


        for (Player player : players) {
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
}