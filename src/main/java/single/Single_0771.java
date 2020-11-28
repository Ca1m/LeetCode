package single;

public class Single_0771 {

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}

	public static int numJewelsInStones(String jewels, String stones) {
		int num = 0;
		int[] lowAlph = new int[26];
		int[] uppAlph = new int[26];

		for (char c : stones.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				lowAlph[c - 'a']++;
			} else {
				uppAlph[c - 'A']++;
			}
		}

		for (char c : jewels.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				num += lowAlph[c - 'a'];
			} else {
				num += uppAlph[c - 'A'];
			}

		}
		return num;
	}

}
