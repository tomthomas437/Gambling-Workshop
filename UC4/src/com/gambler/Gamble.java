package com.gambler;

public class Gamble {
	int StakePerDay = 100;
	int BetPrice = 1;
	int min_stake = 50;
	int max_stake = 150;
	int win = 0;
	int loose = 0;
	
 
  public void play() {
  StakePerDay=100;	  
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
    	   System.out.println(" The stake after playing the game is $" + StakePerDay);
       break;  
 }
   }
}
  
  public void gamble20Days() {
	  for(int days = 1; days <= 20; days++) {         // loop for 20 days
		 play();
		 System.out.println(" \n The player has stake of " + StakePerDay + " on day " + days);   
	  if(StakePerDay > min_stake) {
		  loose++;     // if player looses then the loose days increments
	  } else {
		  win++;
	  } System.out.println(" In total 20 days, the player has won " + win + " days and loose " + loose+ " days");
  }
}
}
 
 
