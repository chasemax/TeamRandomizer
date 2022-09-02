import java.util.ArrayList;

public class TeamRandomizer {

	public static void main(String[] args) {
		
		/************** SETUP ***************/
		
		// Variables
		// numOfTeams holds the desired number of teams you want
		int numOfTeams = 0;
		// nameFile holds the name of the file that has the list of names
		String nameListFile = "";
		
		// Check to see if the user provided both filename and the size of teams that they want
		if (args.length != 2) {
			printUsage();
			System.exit(0);
		}
		
		nameListFile = args[1];
		
		// Make sure they gave a number for the size of the teams
		try {
			numOfTeams = Integer.parseInt(args[0]);
		}
		catch (Exception e) {
			printUsage();
			System.exit(0);
		}
		
		/************* MAIN PROGRAM ***********/
		
		System.out.println("You've chosen to generate " + numOfTeams + " teams from the file: " + nameListFile);
		
		// First, we get all the names from the file provided
		ArrayList<String> studentNames = getNamesFromFile(nameListFile);
		// Then, we assign all the teams
		ArrayList<ArrayList<String>> teams = getNewTeams(studentNames, numOfTeams);
		// Finally, we print out the teams
		printNames(teams);
		
	}
	
	/**
	 * This function just explains to the user how to use this program in case they mess up the
	 * program arguments.
	 */
	public static void printUsage() {
		System.out.println("Usage: teamrandomizer [team_size] [filename]");
		System.out.println("Example: teamrandomizer 5 namelist.txt");
	}
	
	/**
	 * This function is supposed to get all the names that we need to assign to the team members.
	 * It takes the name of the file as a string and returns an ArrayList (the most basic list in java)
	 * with all of the names of the team members. Preferably the file is a .txt file with one
	 * name per line.
	 * @param fileName - the name of the file that contains the students' names.
	 * @return An ArrayList containing each student's name.
	 * @throws FileNotFoundException 
	 */
	public static ArrayList<String> getNamesFromFile(String fileName) throws FileNotFoundException {
		
		// Generate empty array
		ArrayList<String> names = new ArrayList<String>();
		
		// Instantiate file and scanner
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		
		// Loop lines to construct array
		while(scan.hasNextLine()) {
			names.add(scan.nextLine());
		}
		
		// Close scanner
		scan.close();
		
		// Return names list
		return names;
	}
	
	/**
	 * This function takes the ArrayList from the previous function and randomly assigns each student
	 * to a team. It gives back the results as a list of string lists. Each inner list is a list of
	 * the team members, and the outer list just contains all of those lists, essentially containing
	 * all of the teams.
	 * @param allNames - the ArrayList of strings that contains all the students' names.
	 * @param numOfTeams - the number of teams desired
	 * @return An ArrayList of ArrayLists of strings, where the inner ArrayLists contain all the
	 * team members' names.
	 */
	public static ArrayList<ArrayList<String>> getNewTeams(ArrayList<String> allNames, int numOfTeams) {
		return new ArrayList<ArrayList<String>>();
	}
	
	/**
	 * This function just prints out all the team names to the console.
	 * @param allTeams - The ArrayList of ArrayList of strings, where the inner ArrayLists contain 
	 * all the team members' names.
	 */
	public static void printNames(ArrayList<ArrayList<String>> allTeams) {
		System.out.println("Print the teams out here");
	}
	
	// Testing for git here

}
