
/**
 * Creates two recursive methods that simulate dice rolls.
 */

/**
 * @author Brandon Esarey
 * @version 5.0 Assignment 3.1 CS215 Semester year Fall 2023
 */
import java.util.*;

public class RecDieRoller {
	int Die;
	double RollCount;
	double TwoCounter;
	Random DiceRoll;

	public RecDieRoller() {
		setDie(0);
		setRollCount(0);
		setTwoCounter(0);
	}// end default constructor

	/**
	 * @param die
	 * @param diceRoll
	 * @param rollCount
	 * @param twoCounter
	 */
	public RecDieRoller(int die, Random diceRoll, double rollCount, double twoCounter) {
		Die = die;
		DiceRoll = diceRoll;
		RollCount = rollCount;
		TwoCounter = twoCounter;
	}// end preferred constructor

	/**
	 * @return the die
	 */
	public int getDie() {
		return Die;
	}// end getDie()

	/**
	 * @param die the die to set
	 */
	public void setDie(int die) {
		Die = die;
	}// end setDie()

	/**
	 * @return the diceRoll
	 */
	public Random getDiceRoll() {
		return DiceRoll;
	}// end getDiceRoll()

	/**
	 * @param diceRoll the diceRoll to set
	 */
	public void setDiceRoll(Random diceRoll) {
		DiceRoll = diceRoll;
	}// end setDiceRoll()

	/**
	 * @return the rollCount
	 */
	public double getRollCount() {
		return RollCount;
	}// end getRollCount()

	/**
	 * @param rollCount the rollCount to set
	 */
	public void setRollCount(double rollCount) {
		RollCount = rollCount;
	}// end setRollCount()

	/**
	 * @return the twoCounter
	 */
	public double getTwoCounter() {
		return TwoCounter;
	}// end getTwoCounter()

	/**
	 * @param twoCounter2 the twoCounter to set
	 */
	public void setTwoCounter(double twoCounter) {
		TwoCounter = twoCounter;
	}// end setTwoCounter()

	/*
	 * A recursive method that prints a random number from 1 and 6. The method stops
	 * when the number 2 is printed.
	 */
	public void Roll() {
		Random DiceRoll = new Random();
		Die = DiceRoll.nextInt(6) + 1;
		System.out.println(Die);
		if (Die != 2)
			Roll();
	}// end Roll

	/*
	 * A recursive method that creates a given amount of numbers and counts how many
	 * times the number 2 is printed.
	 */
	public void Roll(int Rolls) {
		Random DiceRoll = new Random();
		if (RollCount != Rolls) {
			RollCount++;
			setRollCount(RollCount);
			Die = DiceRoll.nextInt(6) + 1;
			if (Die == 2)
				TwoCounter++;
			setTwoCounter(TwoCounter);
			Roll(Rolls);
		} // end while
	}// end Roll(int Rolls)

}// end RecDieRoller
