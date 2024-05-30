import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Remember to enter 'X' if your inputs are over");
        System.out.println("Enter the input: ");
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            String number=input.nextLine();
           if(number.equalsIgnoreCase("X")){
               break;
           }
           int number1=Integer.parseInt(number);
           numbers.add(number1);
        }
        int sum=0;
        for(int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);
        }
}
