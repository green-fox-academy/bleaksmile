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

            System.out.println(substring("I am searching here", "search"));
        }

        public static int substring(String input1, String input2) {

            if (input1.contains(input2)) {
                return (input1.indexOf(input2));
            }

            return -1;
        }
}