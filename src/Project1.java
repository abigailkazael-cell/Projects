import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //קליטת המספרים והאופרטור מהמשתמש
            System.out.print("Enter the first number --> ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter an operator --> ");
            String operator = scanner.next();
            System.out.print("Enter the second number --> ");
            double num2 = scanner.nextDouble();
            
            double result;

            //חישוב והדפסת התוצאה בהתאם לאופרטור שנקלט
            if (operator.equals("+"))
                System.out.println("Result: "+(num1+num2));

            else if (operator.equals( "-"))
                System.out.println("Result: "+(num1-num2));

            else if (operator.equals("*"))
                System.out.println("Result: "+(num1*num2));

            else if (operator.equals("/"))
            {
                if (num2 == 0)
                    System.out.println("Cannot Divide by Zero, try again!");
                else
                    System.out.println("Result: "+(num1/num2));
            }
            else
                System.out.println("Not a valid operator");
        }
    }
}