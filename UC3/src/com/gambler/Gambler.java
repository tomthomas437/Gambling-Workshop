package com.gambler;

public class Gambler {
public static void main(String[] args) {
	int StakePerDay = 100;
	int BetPrice = 1;
	int min_stake = 50;
	int max_stake = 150;
	
   System.out.println("The total stake per day is $" + StakePerDay);
   System.out.println("Bet price per game is $" + BetPrice);
       
   while(StakePerDay > min_stake && StakePerDay < max_stake)  // Win or Lost 50% of stake
   {
      int play = (int)(Math.random() *2);   // 0 = Win, 1 = Loose
      switch(play) {
      case 0:  //Win
    	   StakePerDay += BetPrice;
    	   System.out.println("The player wins $1");
    	   System.out.println("The stake after playing the game is $" + StakePerDay);
        break;
        
      case 1: //Loose
    	   StakePerDay -= BetPrice;
    	   System.out.println("The player looses $1");
    	   System.out.println("The stake after playing the game is $" + StakePerDay);
       break;  
 }
   } System.out.println("Player has reached limit of $" + StakePerDay + " stake price and the game is resigned");
}
}
 
