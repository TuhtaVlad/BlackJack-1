package com.company;

/**
 * Created by student1 on 21.11.16.
 */
public class LimitIntellect extends Intellect {
    private int limit;

    public  LimitIntellect (int limit) {
        this.limit = limit;
    }

    @Override
        public Command decide(int score) {
            if (score<limit)
                return Command.HIT;
             else
                 return Command.STAND;
        }
}
