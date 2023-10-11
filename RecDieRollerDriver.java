/**
 * Tests the RecDieRoller class and further examines the Roll(int Rolls) class in it.
 */

/**
 * @author Brandon Esarey
 * @version 5.0 Assignment 3.1 CS215 Semester year Fall 2023
 */
public class RecDieRollerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecDieRoller dice = new RecDieRoller();
		dice.Roll(1000);
		System.out.println("Out of the " + dice.getRollCount() + " dice rolls, the dice landed on 2 a total of "
				+ dice.getTwoCounter() + " times.");
		double mean = dice.getRollCount() / dice.getTwoCounter();
		System.out.println("The dice landed on 2 on average every " + mean + " rolls.");

	}// end main()

}// end RecDieRollerDriver
