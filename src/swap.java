public class swap {
    public static void main(String[] args) {
        //swap using third variable;
// before swaping
        int x= 20;
        int y=12;
        System.out.println("values of x :"+x);
        System.out.println("values of y :"+y);
        //take third variable;
        int temp;
        temp = x;
         x = y;
        y = temp;
        //after swap
        System.out.println("x :" +x);
        System.out.println("values of y :"+y);
    }
}
