package test;

public class count_A {

	int countA(String word) {
		int count = 0 ; 
		for (int i = 0 ; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A')
				count++; 
		}
		System.out.println("Number of A's Are : " + count);
		return count;
	}
}
