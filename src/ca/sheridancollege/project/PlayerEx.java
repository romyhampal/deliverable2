package ca.sheridancollege.project;

import java.util.ArrayList;

public class PlayerEx extends Player {

    private ArrayList<Card> cards; 

    public PlayerEx(String name) {
        super(name);
        
        cards = new ArrayList<>();
    }

    @Override
    public void play() {
        
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0); 
    }

    public void addCards(ArrayList<Card> wonCards) {
        cards.addAll(wonCards); 
    }

    

    public int getDeckSize() {
        return cards.size();
    }
}
