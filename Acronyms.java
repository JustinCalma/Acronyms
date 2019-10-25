import java.util.Scanner;

public class Acronyms {

	public static String createAcronym(String userPhrase) {
		String acronym = "";
		for (int i = 0; i < userPhrase.length(); i++) {
			if (Character.isUpperCase(userPhrase.charAt(i))) {
				acronym = "" + acronym + userPhrase.charAt(i);
			}
		}
		return acronym;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userPhrase = "";
		userPhrase = scnr.nextLine();
		String acronym = createAcronym(userPhrase);
		System.out.println(acronym);
		scnr.close();
	}
	
}
