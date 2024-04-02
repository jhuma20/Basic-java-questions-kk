public class Sumfun {
    /**
     * @param args
     */
    public static void main(String[] args) {
        {
            sumfun();
        }
     static  void sum(){
        Scanner sc= new Scanner (System.in);
        System.out.print("enter number 1:" );
        int num1=sc.nextInt();
        System.out.print("enter number 2:");
        int num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println("the sum =" +sum);
     }
    }
}
