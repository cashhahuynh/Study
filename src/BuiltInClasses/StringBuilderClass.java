package BuiltInClasses;

public class StringBuilderClass {

    //StringBuilder class can create mutable sequence of chars
    public static void stringBuilderTest() {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(str);

        String newStr = sb2.reverse().toString();
        System.out.println("Reversing a string with StringBuilder method chaining: " + newStr);

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("Manually reversing a string: " + sb.toString());
    }

}
