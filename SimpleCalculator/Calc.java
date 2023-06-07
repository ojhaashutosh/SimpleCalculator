package SimpleCalculator;
import java.util.Scanner;
class SimpleCalculator
{

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number");

        int a=sc.nextInt();

        System.out.println("Enter the Second Number");

        int b=sc.nextInt();

        System.out.println("Choose the Operator + - * /");

        String operator=sc.next();

        int result;

        switch(operator){

            case"+":

            result =a+b;

            System.out.println("Addition of Number is:"+result);

            break;

            case"-":

            result=a-b;

            System.out.println("Substraction of Number is "+result);

            break;

            case"*":

            result=a*b;

            System.out.println("Multiplication is"+result);

            break;

            case"/":

            result=a/b;

            System.out.println("Division is"+result);

            break;

            default:

            System.out.println("Invalid Number");

                }
    }

}