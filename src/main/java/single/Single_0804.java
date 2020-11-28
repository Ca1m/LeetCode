package single;

public class Single_0804 {

	private static String[] str = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
			"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
			"--.." };

	public static void main(String[] args) {

		String[] words = { "gin", "zen", "gig", "msg" };

		int count = Single_0804.uniqueMorseRepresentations(words);
		System.out.println(count);

	}

	public static int uniqueMorseRepresentations(String[] words) {

		String[] enc = new String[words.length];
		int enc_index = 0;
		for (int i = 0; i < words.length; i++) {
			char[] cs = words[i].toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < cs.length; j++) {
				int index = cs[j] - 97;
				sb.append(str[index]);
			}
			System.out.println(sb.toString());
			if (i == 0) {
				enc[i] = sb.toString();
				enc_index++;
			} else {
				boolean flag = false;
				for (int z = 0; z < enc_index; z++) {
					if (sb.toString().equals(enc[z])) {
						flag = false;
						break;
					} else {
						flag = true;
					}
				}
				if (flag) {
					enc[enc_index] = sb.toString();
					enc_index++;
					System.out.println(enc_index);
				}
			}
		}
		return enc_index;
	}

}
