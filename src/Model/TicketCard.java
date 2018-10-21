/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Daniel
 */

public class TicketCard {
    //skelly code of TicketCard.java
    public int value;    //stores card’s value
    public int loc1, loc2;    //stores int location 
    boolean completed;

    public TicketCard(int card){
        // set ticket card from the list of created Ticketcards from TicketCardDeck.java
        //int card is card location from created list of cards from TicketCardDeck.java
    }
    public int getValue() {
        
        return value;
    }
    public int getLocation1() {
        
        return loc1;
    }
    public int getLocation2() {
        
        return loc2;
    }    
    
}


