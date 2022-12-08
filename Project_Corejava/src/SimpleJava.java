import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleJava {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the details");

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Integer age = Integer.valueOf(b.readLine());
		String output = null;
		if (age > 18) {
			output = eligibleForVote();
			System.out.println(output);
		} else {
			output = notEligibleForVote();
			System.out.println(output);
		}

	}

	private static String notEligibleForVote() {

		return "not Eligible For Vote";
	}

	private static String eligibleForVote() {

		return "eligible For Vote";
	}

}
