public class Human {
   private int iq;
   public static boolean alive = true;
   private static int count = 0;

   Point p;

    public Human(int iq) {
        this.iq = iq;
        count ++;
    }

    public boolean isSmart(){
        return iq>100;
    }
    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Human{" +
                "iq=" + iq +
                '}';
    }

}
