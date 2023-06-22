**BLACKJACK**

Write a program that lets the user play against the dealer (computer) in a variation of the popular blackjack card game. In this variation of the game, two six-sided dice are used instead of cards. The dice are rolled, and the player tries to beat the computer's hidden total without going over 21.

Here are the requirements for the game's design:
* At the beginning of each round, the program will ask the user whether he or she wants to roll the dice to accumulate points.
* During each round, the program simulates the rolling of two six-sided dice. You will create a class player that has two dice. This class needs to tell the player the current score, reset it to 0 and roll them. (Use the Die class we wrote in class to simulate the dice.)
* Each round of the game is performed as an iteration of a loop that repeats as long as the player agrees to roll the dice, and the player's total does not exceed 21. If the player busts, then end the game.
* The loop keeps a running total for the user's points.
* Once the user stop rolling the dice, it will be the computer's turn. If the user didn't exceed 21, the computer will roll the dice until it has passed the user but not exceeded 21. You will need to keep the running total of the dealer at this point.
* After the loop has finished, the computer's total is revealed, and the player with the most points, without going over 21, wins.
  The solution for this version of the program cannot be found online. If you decide to use the solutions in the internet for a similar program you will automatically get a 0.