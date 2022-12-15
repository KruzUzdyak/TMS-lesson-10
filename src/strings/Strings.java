package strings;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        String hello = "Hello";
        String world = new String(" world" + "!");

        String helloWorld = hello;
        helloWorld = hello.concat(world);

        System.out.println(hello);
        System.out.println(helloWorld);
        System.out.println();
        System.out.println("hello length: " + hello.length());
        System.out.println("hello world length: " + helloWorld.length());

        String join = String.join(" //", hello, world);
        System.out.println(join);

        char charAt = helloWorld.charAt(7);
        System.out.println("char at 7: " + charAt);
        String charAtString = String.valueOf(charAt);
        System.out.println("char at 7: " + charAtString);

        int indexOfW = helloWorld.indexOf("w", 3);
        System.out.println("w at pos: " + indexOfW);
        int lastIndexOfL = helloWorld.lastIndexOf("l", 6);
        System.out.println("last index of l: " + lastIndexOfL);

        System.out.println();
        char[] toCharArray = helloWorld.toCharArray();
        System.out.println(Arrays.toString(toCharArray));
        byte[] getBytes = helloWorld.getBytes();
        System.out.println(Arrays.toString(getBytes));

        System.out.println();
        String replace = helloWorld.replace("ll", "****");
        System.out.println("old string: " + helloWorld + "\nreplaced: " + replace);
        String replaceAll = replace.replaceAll("[*]{2}", "----");
        System.out.println("replaceAll result: " + replaceAll);

        String notTrimmed = "  \t \t  trim   trim      ";
        String trimmed = notTrimmed.trim();
        System.out.println(notTrimmed + "///" + trimmed);

        String string = "abcDEFg";
        String toLowerCase = string.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = string.toUpperCase();
        System.out.println(toUpperCase);

        String toSplit = "cat, dog, bird";
        String[] split = toSplit.split(",");
        System.out.println(Arrays.toString(split));

        String blank = "    ";
        System.out.println("empty: " + blank.isEmpty());
        System.out.println("blank: " + blank.isBlank());

        System.out.println();
        String substring = helloWorld.substring(3, 9);
        System.out.println(substring);

        methodExample(hello, helloWorld);

        System.out.println();

        String a = "a";
        String b = "N";
        System.out.println(a.compareToIgnoreCase(b));

        boolean regionMatches1 = helloWorld.regionMatches(0, hello, 0, 4);
        System.out.println(regionMatches1);

        System.out.println(helloWorld.contains(hello));

        String deleteSubstring = helloWorld.substring(0, 3) + helloWorld.substring(8, helloWorld.length() - 1);
        System.out.println(deleteSubstring);
    }

    public static String methodExample(String string1, String string2) {
        boolean equals = string2.equals(string1);
        System.out.println(equals);
        boolean bool = "hello world!".equalsIgnoreCase(string2);
        System.out.println(bool);
        return "";
    }
}
