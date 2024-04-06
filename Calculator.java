import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int  res=0;
            while(true){
                System.out.println("enter the operator :");
                char op=sc.next().trim().charAt(0);
                if(op=='+'|| op == '*' || op=='/' ||op=='%')
                {
                    System.out.println("enter two number :");
                   int num1=sc.nextInt();
                   int num2=sc.nextInt();
                   if(op=='+')
                   {
                    res=num1+num2;
                    System.out.println("addition of two number is"+res);
                   }
                   if(op=='-')
                   {
                    res=num1-num2;
                    System.out.println("substraction of two number is"+res);
                   }
                   if(op=='*')
                   {
                    res=num1*num2;
                    System.out.println("multiplication of two number is"+res);
                   }
                   if(op=='%')
                   {
                    res=num1%num2;
                    System.out.println("division of two number is"+res);
                   }
                }
                else if(op=='x' || op=='x')
                {
                    break;
                }
              else{
                System.out.println("invalid operation");
              }
                }
                System.out.println(res);
            }
        }
    }

