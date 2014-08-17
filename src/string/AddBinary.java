package string;

public class AddBinary {
	public String addBinary(String a, String b) {
		int carry = 0;
		StringBuffer result = new StringBuffer();
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int a1 = i >= 0 ? (a.charAt(i) - '0') : 0;
			int b1 = j >= 0 ? (b.charAt(j) - '0') : 0;
			int digit = (a1 + b1 + carry) % 2;
			carry = (a1 + b1 + carry) / 2;
			result.insert(0, digit);
		}
		if (carry == 1)
			result.insert(0, '1');
		return result.toString();
	}
}
