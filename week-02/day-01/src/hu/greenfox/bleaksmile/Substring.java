package hu.greenfox.bleaksmile;

public class Substring {
//  Create a function that takes two strings as a parameter
//  Returns the starting index where the second one is starting in the first one
//  Returns `-1` if the second string is not in the first one

    //  Example:
//System.out.println(subStr("this is what I'm searching in", "searching"));
//  should print: `17`
//System.out.println(subStr("this is what I'm searching in", "not"));
//  should print: `-1
    public static void main(String[] args) {

        System.out.println(subStr("imtkltearchin", "tea"));
        // System.out.println(substring("this is what I'm searching in", "not"));
    }

        /*public static int substring(String input1, String input2) {

            if (input1.contains(input2)) {
                return (input1.indexOf(input2));
            }

            return -1;
        }*/

    public static int subStr(String input, String part) {
        int contains = 0;
        for (int i = 0; i < input.length() - part.length(); i++) {
            int index = 0;
            if (part.charAt(index) == input.charAt(i)) {
                for (int j = 0; j < part.length(); j++) {
                    if (part.charAt(j) == input.charAt(j + i)) {
                        contains++;
                    }
                    if (contains == part.length()) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }




}