import java.util.Scanner;

public class whatifcompletion {


    public static void main(String[] args) {
        int num1, num2, sum, av,prod;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        av = (num1 + num2) / 2;
        prod= num1*num2;

        if (sum > 200 && sum < 1000)
            System.out.print(sum + "*~" + av );
            //System.out.println("its more than 200 big boi you gotta change it");
        else if (sum < 200 && sum > 1000)
            System.out.print(sum+"*"+av+ " "+ prod);

         else System.out.print(sum+ " " +av+ " "+ prod);
    }
}

