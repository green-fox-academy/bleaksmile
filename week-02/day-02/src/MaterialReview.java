public class MaterialReview {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Bye");
        int a = 1;
        a ++;

        helloAndBye();
        String name = "Jancsi";
        print("hello");
        print(name);
        add(2,3);
        add(5,5);
        return5();
        System.out.println(return5()/2);

    }
    public static  int return5() {
        return 5;
    }

    public static void helloAndBye(){

        System.out.println("Hello");
        System.out.println("Bye");

    }

    public static void add(int a, int b){
        int sum = a +b;
        System.out.println(sum);

    }

    public static void print(String text) {
        int a =0;
        System.out.println(text);

    }
}
