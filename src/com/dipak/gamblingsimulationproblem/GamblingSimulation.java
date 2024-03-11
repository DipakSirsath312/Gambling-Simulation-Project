package com.dipak.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {
	
	private final static int Every_day_stake = 100;
	private final static int Every_day_bet = 1;
	private final static int Win = 1;
	private final static int Loose = 0; 
	
	static int winstake = 0;
	static int loosestake = 0;
	
	public static void gamblingshow(){
		
		System.out.println("Every Day Stake:"+Every_day_stake);
		System.out.println("Every Per Bet:"+Every_day_bet);
		System.out.println("Win stake :"+winstake);
		System.out.println("Loose stake :"+loosestake);
		System.out.println("---------------------");
		}
	
	public static void playgame() {
		Random random = new Random();
		int playgame = random.nextInt(9)%2;
	
		if(playgame == Loose) {
			loosestake = loosestake + 1;
			System.out.println("Lossing Stake:"+loosestake);
		}
		else {
			winstake = winstake + 1;
			System.out.println("Winning Stake:"+winstake);
		}
	}
public static void main(String[] args) {
		
		System.out.println("Welcome To Gambling Simulation Project");
		
		gamblingshow();
		playgame();
		
	}
}
