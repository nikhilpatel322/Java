public class StringMethodsDemo {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello,World!";
        String str2 = "ELon Musk";
        String str3 = "JeffBezos";

        // strings printing
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Character at a specific index
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));

        // Substring
        System.out.println("Substring of str2 from index 0 to 7: " + str2.substring(0, 7));

        // Concatenation
        String concatenated = str1 + "  " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // Index of a character
        System.out.println("Index of 'W' in str1: " + str1.indexOf('W'));

        // Replace characters
        String replaced = str1.replace('o', '0');
        System.out.println("Replaced 'o' with '0' in str1: " + replaced);

        // Convert to uppercase
        System.out.println("str2 in uppercase: " + str2.toUpperCase());

        // Convert to lowercase
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // Trim whitespace
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // Check if strings are equal
        System.out.println("str1 equals str2: " + str1.equals(str2));

        // Check if strings are equal ignoring case
        System.out.println("str1 equals 'hello, world!' ignoring case: " + str1.equalsIgnoreCase("hello, world!"));

        // Split string
        String[] words = str1.split(",");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}