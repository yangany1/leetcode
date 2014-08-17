package string;

public class ImplementstrStr {
	public String strStr(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0)
			return haystack;
		if (haystack.length() == 0 && needle.length() != 0)
			return null;

		int i = haystack.indexOf(needle);
		if (i == -1)
			return null;
		else
			return haystack.substring(i);
	}

	public String strStr2(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0)
			return haystack;
		if (haystack.length() == 0 && needle.length() != 0)
			return null;
		int i = 0;
		int j = 0;
		int pos = 0;
		while (i < haystack.length() && j < needle.length()) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			} else {
				i = i - j + 1;
				j = 0;
			}
		}
		if (j >=needle.length()) {
			pos = i - needle.length();
			return haystack.substring(pos);
		} else {
			return null;
		}

	}
}
