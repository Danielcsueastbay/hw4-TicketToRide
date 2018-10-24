/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class TicketCardDeck {
    //skelly code
    public ArrayList<TicketCard> Ticketdeck = new ArrayList();    //ticket cards deck
    //public static TicketCard[] Ticketdeck = new TicketCard[16];
    public TicketCardDeck() {
        // create ticket cards and ticket deck
        Ticketdeck.add( 0, new TicketCard(0, 1, 1));
        Ticketdeck.add( 1, new TicketCard(0, 2, 1));
        Ticketdeck.add( 2, new TicketCard(0, 3, 1));
        Ticketdeck.add( 3, new TicketCard(1, 2, 1));
        Ticketdeck.add( 4, new TicketCard(1, 4, 1));
        Ticketdeck.add( 5, new TicketCard(2, 3, 1));
        Ticketdeck.add( 6, new TicketCard(2, 4, 1));
        Ticketdeck.add( 7, new TicketCard(3, 4, 1));

        //TicketCard.TicketCard(3, 4, 14, true);
    }
    public TicketCard drawTicketCard(){
        //draw 1 cards from ticket deck and return ticketcard
        TicketCard card = Ticketdeck.get(0);
        Ticketdeck.remove(0);
        return card;
    }
    public void shuffleTicketdeck(){
        TicketCard [] temp = new TicketCard[1];
        temp[0] = Ticketdeck.get(0);
        int position = 0, rand;
        for (int i = 1; i < (Ticketdeck.size()-1); i++){
            rand = ((int) (Math.random() * 100) % (16 - i)) + position;
            if (rand < 0)
                rand = 0;
            Ticketdeck.set(position, Ticketdeck.get(rand));
            Ticketdeck.set(rand, temp[0]);
            position++;
        }
    }
    /*
        //test print for TicketCard
    public static void main(String[] args)  {
        TicketCardDeck d = new TicketCardDeck();
        System.out.print(d.Ticketdeck.get(0) + "\n");
        //run: City 0 to City 1 is: 1
   }
    */
}
