/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifiedBy kau15882
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        
        Card userCard = new Card();
        userCard.setValue(in.nextInt());
        userCard.setSuit(in.nextLine());
        
        // and search magicHand here
        boolean found = false;
        for (Card n: magicHand)
        {
            if (userCard.getValue() == n.getValue() && userCard.getSuit().equals(n.getSuit()))
            {
                found = true;
                break;
            }
        }
       
        //Then report the result here
        if (found)
        {
            System.out.println("Your card was found in magicHand");
        }
        else
        {
            System.out.println("Your card was not found in magicHand");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
