package javaPractice;

public class findDuplicateCharacters {

	public static void main(String[] args) {

String str="SivaSankarReddyAnkireddypalle";

char[] chars = str.toCharArray();

int[] count = new int[256];

for (char c : str.toCharArray()) {
    count[c]++;
}

for (int i = 0; i < 256; i++) {
    if (count[i] > 1) {
        System.out.println((char) i + " is repeated " + count[i] + " times");
    }
}		
		
		

	}

}
