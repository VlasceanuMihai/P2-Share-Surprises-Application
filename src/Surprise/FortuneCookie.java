package Surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FortuneCookie implements ISurprise {
    private static final ArrayList<String> sayings = new ArrayList<String>(Arrays.asList("What is Christmas? It is tenderness for the past, courage for the present, hope for the future. ",
            "Christmas is the day that holds all time together. ",
            "One of the most glorious messes in the world is the mess created in the living room on Christmas Day. Don't clean it up too quickly. ",
            "A good conscience is a continual Christmas. ",
            "Christmas isn't a season. It's a feeling. ",
            "Let us keep Christmas beautiful without a thought of greed. ",
            "T'was the night before Christmas, when all through the house, not a creature was stirring, not even a mouse. ",
            "Unless we make Christmas an occasion to share our blessings, all the snow in Alaska won't make it 'white.'",
            "The best of all gifts around any Christmas tree: the presence of a happy family all wrapped up in each other. ",
            "Christmas will always be as long as we stand heart to heart and hand in hand. ",
            "Love the giver more than the gift. ",
            "Christmas is a necessity. There has to be at least one day of the year to remind us that we're here for something else besides ourselves. ",
            "My idea of Christmas, whether old-fashioned or modern, is very simple: loving others. ",
            "To cherish peace and goodwill, to be plenteous in mercy, is to have the real spirit of Christmas. ",
            "The smells of Christmas are the smells of childhood. ",
            "Christmas magic is silent. You don't hear it — you feel it. You know it. You believe it. ",
            "Blessed is the season which engages the whole world in a conspiracy of love. ",
            "I don't think Christmas is necessarily about things. It's about being good to one another.",
            "Christmas is a time when you get homesick — even when you're home. ",
            "Christmas, children, is not a date. It is a state of mind. "));
    private String symbolicMessage;


    public FortuneCookie(String symbolicMessage){
        this.symbolicMessage = symbolicMessage;
    }


    public String getSymbolicMessage() {
        return symbolicMessage;
    }

    public static FortuneCookie generate(){
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 19);
        FortuneCookie fortuneCookie = new FortuneCookie(sayings.get(randomNumber));
//        fortuneCookie.enjoy();

        return fortuneCookie;
    }


    @Override
    public void enjoy(){
        System.out.println("FORTUNE COOKIE: " + this.symbolicMessage);
    }
}
