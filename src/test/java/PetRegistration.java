/**
 * File Name: PetRegistration.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 17, 2016
 */
/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */

import com.sqa.yn.util.helpers.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	static String[] age;

	static String[] animalType;

	static String appName = "Pet Entry";

	static int numPets;

	static String[] petNames;

	static String[] price;

	static String username;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		username = AppBasics.welcomeUserAndGetUsersName(appName);
		numPets = RequestInput.getInt("How many pets do you want to enter into the system? ");
		initializeArrays();
		requestUserInput();
		displayEmployeeDetails();
		AppBasics.farewellUser(username, appName);
	}

	/**
	 *
	 */
	private static void displayEmployeeDetails() {
		for (int i = 0; i < numPets; i++) {
			System.out.println("#" + i + ":");
			System.out.println("Name: " + petNames[i]);
			System.out.println("Price of registration: " + price[i]);
			System.out.println("City: " + animalType[i]);
			System.out.println("Ages: " + age[i]);
		}
	}

	/**
	 *
	 */
	private static void initializeArrays() {
		petNames = new String[numPets];
		animalType = new String[numPets];
		age = new String[numPets];
		price = new String[numPets];
	}

	/**
	 *
	 */
	private static void requestUserInput() {
		for (int i = 0; i < numPets; i++) {
			petNames[i] = RequestInput.getString("What is pet " + i + "'s name: ");
			animalType[i] = RequestInput.getString("What is the animal type for " + i + " Pet: ");
			age[i] = RequestInput.getString("What is animal " + i + "'s age: ");
			price[i] = RequestInput.getString("What is animal " + i + "'s price for Registration: ");
		}
	}
}