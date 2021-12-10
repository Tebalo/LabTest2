import java.util.Scanner;

public class CreditCardCheck {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cardNumber = in.nextInt();
        int sum1=0;
        int temp1 = cardNumber;
        int total = 0;
        String strd = "";
        int lastdig;

        for (int i=1;i<8;i+=2)
        {
            sum1+= temp1%10;
            temp1/= 100;  
        }
        
        int sum2=0;
        int temp2= cardNumber / 10;  //start with d2 not d1
        for (int i=1; i<8; i+=2)
        {
            int digit = (temp2 % 10) *2; // don't forget to double the value- thus the *2 here
            sum2 += digit%10;  //the ones digit
            digit /= 10;  //the tens digit 
            sum2 += digit;  
            temp2 /= 100; // move left two digits, base, ten, to get to the next relevant digit...
        }
        total = sum1+sum2;
        strd = Integer.toString(total);
        lastdig = Integer.parseInt(strd.substring(strd.length()-1, strd.length()));
        
        if (lastdig == 0)
        {
            System.out.println(cardNumber+" is valid");
        }else
        {
            System.out.println(cardNumber+" is not valid. Required check digit is " + ((cardNumber - (sum1+sum2) + 10) % 10));
        }
    }
}