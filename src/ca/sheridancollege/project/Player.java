/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Jashanpreet Kaur Chahal June 2024
 */
public abstract class Player {

    private String name; 
    private ArrayList<Card> cards;

   
    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   

     public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public abstract void play();

}
