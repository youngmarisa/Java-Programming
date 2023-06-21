package Projects.Project_02;

import java.util.Scanner;
/**
 * @author marisayoung
 * date: 04/29/2023
 * description: blackjack game
 *
 */
public class Project_02 {
	
    //Class representing the player with two dice
    public static class Player {
        private Die die1;
        private Die die2;
        private int score;
        
        //Constructor that initializes the player's dice and score
        public Player() {
            die1 = new Die();
            die2 = new Die();
            score = 0;
        }
        
        //Rolls the player's dice and updates the score
        public void rollDice() {
            die1.roll();
            die2.roll();
            score += die1.getValue() + die2.getValue();
            System.out.println("You rolled " + die1.getValue() + " and " + die2.getValue() + ". Your total score is now " + score);
        }
        
        //Resets the player's score to 0
        public void resetScore() {
            score = 0;
        }
        
        //Returns the player's current score
        public int getScore() {
            return score;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        Die die1 = new Die();
        Die die2 = new Die();
        int dealerScore = 0;
        
        System.out.println("Welcome to Blackjack Dice!");
        
        //Loop to play the game
        while (true) {
            System.out.println("Do you want to roll the dice? (y/n)");
            String input = keyboard.nextLine();
            
            //Player decides to roll the dice
            if (input.equals("y")) {
                player.rollDice();
                
                //Player busts, game ends
                if (player.getScore() > 21) {
                    System.out.println("You busted! Your score is " + player.getScore() + ". You lose.");
                    break;
                }
                
            //Player decides to stop rolling the dice, computer's turn
            } else {
                System.out.println("Your score is " + player.getScore() + ". It's now the dealer's turn.");
                
                //Computer rolls the dice until it passes the player but doesn't exceed 21
                while (dealerScore < player.getScore() && dealerScore <= 21) {
                    die1.roll();
                    die2.roll();
                    dealerScore += die1.getValue() + die2.getValue();
                    System.out.println("Dealer rolled " + die1.getValue() + " and " + die2.getValue() + ". Dealer's total score is now " + dealerScore);
                }
                
                //Computer busts, player wins
                if (dealerScore > 21) {
                    System.out.println("Dealer busted! Dealer's score is " + dealerScore + ". You win!");
                //Computer beats player
                } else if (dealerScore > player.getScore()) {
                    System.out.println("Dealer wins! Dealer's score is " + dealerScore + ", your score is " + player.getScore() + ".");
                //Tie game
                } else {
                    System.out.println("It's a tie! Dealer's score is " + dealerScore + ", your score is " + player.getScore() + ".");
                }
                
                //Reset player and dealer scores for next round
                player.resetScore();
                dealerScore = 0;
                
                //Ask player if they want to play again
                System.out.println("Do you want to play again? (y/n)");
                input = keyboard.nextLine();
                
                if(input.equals("n")) {
                	System.out.println("Game Over.");
                	keyboard.close();
                }

            }
        }
       }
	}
