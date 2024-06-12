package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Jashanpreet Kaur Chahal
 */
public abstract class Game {

    private final String name; 
    private ArrayList<Player> players; 

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    
    public ArrayList<Player> getPlayers() {
        return players;
    }

    
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    
    public abstract void play();

    
    public abstract void declareWinner();
}
