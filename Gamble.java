package com.gamble;

public class Gamble {
			int StakePerDay = 100;
			int BetPrice = 1;
			int min_stake = 50;
			int max_stake = 150;
			int win = 0, dayWin =0;
			int winMax = 0;
			int loss = 0, dayLoss = 0;
			int lossMax = 0;
			int days = 0;
			
			int luckyDay = 0, worstDay = 0;
			
		 
		  public void play() {
		  StakePerDay=100;	  
		   while(StakePerDay > min_stake && StakePerDay < max_stake)  // Win or Lost 50% of stake
		   {
		      int play = (int)(Math.random() *2);   // 0 = Win, 1 = Loose
		      switch(play) {
		      case 0:  //Win
		    	   StakePerDay += BetPrice;
		    	   win++;
		    	   System.out.println("The player wins $1");
		    	   System.out.println("The stake after playing the game is $" + StakePerDay);
		        break;
		        
		      case 1: //Loose
		    	   StakePerDay -= BetPrice;
		    	   loss++;
		    	   System.out.println("The player looses $1");
		    	   System.out.println(" The stake after playing the game is $" + StakePerDay);
		       break;  
		 }
		   }
		}
		  
		  public void gamble30Days() {
			  for(int days = 1; days <= 30; days++) {         // loop for 30 days
				 play(); 
				 if(win > winMax) {    // for lucky day
						winMax = win;
						luckyDay = days + 1;
					}
					
					// for unluckiest day
					if(loss > lossMax) {
						lossMax = loss;
						worstDay = days + 1;
					}
					
					win = 0;
					loss = 0;
					
				  if(StakePerDay > min_stake) {
					  dayLoss++;     // if player looses then the loose days increments
				  } else {
					  dayWin++;
				  } System.out.println(" In a month, the player has won " + dayWin + " days and loose " + dayLoss+ " days");
			  }
			
		  System.out.println("  \n The luckiest day you had was day " + luckyDay + " with winnings of " + winMax);
			System.out.println(" \n The worst day you had was day " + worstDay + " with losses of " + lossMax);
			}
		  
		  public void continueOrStopGamble() {
				
				int count = 1;
				do{
					System.out.println("\n Month: " + count + " The[player has continue to play the next month");
					gamble30Days();
					count++;
				} while( StakePerDay > 0);
			}
			
	}
