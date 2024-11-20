public class StringConcatenation {
    public static String concatenatedStrings(String str1, String str2, String str3) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        char[] str4 = new char[len1 + len2 + len3];

        int i = 0;
        while (i < len1) {
            str4[i] = str1.charAt(i);
            i++;
        }
        int j = 0;
        while (j < len2) {
            str4[i] = str2.charAt(j);
            i++;
            j++;
        }

        int k = 0;
        while (k < len3) {
            str4[i] = str3.charAt(k);
            i++;
            k++;
        }
        return new String(str4);
    }

    public static void main(String[] args) {
        String str1 = "Don ";
        String str2 = "Kaleb ";
        String str3 = "Mesias";

        String concatenatedString = concatenatedStrings(str1, str2, str3);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}