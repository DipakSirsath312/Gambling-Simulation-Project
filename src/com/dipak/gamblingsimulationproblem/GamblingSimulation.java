package com.dipak.gamblingsimulationproblem;

public class GamblingSimulation {
	
	private final static int Every_day_stake = 100;
	private final static int Every_day_bet = 1;
	
	public static void gamblingshow(){
		System.out.println("Every Day Stake:"+Every_day_stake);
		System.out.println("Every Per Bet:"+Every_day_bet);
}
public static void main(String[] args) {
		
		System.out.println("Welcome To Gambling Simulation Project");
		
		GamblingSimulation gambling = new GamblingSimulation();
		gambling.gamblingshow();
	}

}
