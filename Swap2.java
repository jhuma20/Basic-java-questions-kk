public class Swap2 {
    public static void main(String[] args) {
        {
            int a=20;
            int b=30;
            

            swap(a,b);

            System.out.println(a+" "+b);
        }
        static void swap(int a,intb)
        {
            int temp=a;
            a=b;
            b=temp;
        }
    }
}
