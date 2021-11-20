package com.gamble;

public class Gamble {
	public static void main(String[] args) {
		int StakePerDay = 100;
		int BetPrice = 1;
		
	int play = (int)(Math.random() *2);   // 0 = Win, 1 = Loose
    switch(play) {
    case 0:  //Win
  	   StakePerDay += BetPrice;
  	   System.out.println("The player wins $1");
  	   System.out.println("The stake after winning the game is $" + StakePerDay);
      break;
      
    case 1: //Loose
  	   StakePerDay -= BetPrice;
  	   System.out.println("The player looses $1");
  	   System.out.println("The stake after loosing the game is $" + StakePerDay);
     break;  
         }
	}
}
