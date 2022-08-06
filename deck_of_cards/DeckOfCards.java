package deck_of_cards;

public class DeckOfCards {

    int noOfPlayers = 4;
    int noOfCardDistribution = 9;
    String[][] playerArray = new String[noOfPlayers][noOfCardDistribution];
    String[] DeckOfCard = new String[52];
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public DeckOfCards() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    //Using random() to shuffle cards
    void shuffleCard() {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            DeckOfCard[i] = rank + " of " + suit;
        }
    }

    //assign 9 cards to each player
    void assignCards() {
        int count = 0;
        for (int i = 0; i < noOfPlayers; i++) {
            for (int j = 0; j < noOfCardDistribution; j++) {
                playerArray[i][j] = DeckOfCard[count++];
            }
        }
    }

    //show cards received by 4 players
    void display() {
        for (int i = 0; i < noOfPlayers; i++) {
            for (int j = 0; j < noOfCardDistribution; j++) {
                System.out.print("\nPlayer " + (i + 1) + " : " + playerArray[i][j] + " card ");
            }
            System.out.println();
        }
    }

}
