package deck_of_cards;
/*Shuffle the cards using Random method and then distribute 9 Cards
 *  to 4 Players and Print the Cards received by
 *  the 4 Players using 2D Array */

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome To Deck Of Cards Game!");

        DeckOfCards deck = new DeckOfCards();
        deck.shuffleCard();
        deck.assignCards();
        deck.display();
    }
}