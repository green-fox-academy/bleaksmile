public class Main {

    public static void main(String[] args) {
        // write your code here
    }
    public static double threeForOne(int number, double price){
        int threePack = number/3;
        int reminder = number%3;
        if(number % 3 == 0){
            return 1*number/3;
        } else {
            return threePack*1 + reminder*price;
        }
    }
}
