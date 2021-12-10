import java.util.Scanner;
class EasterSunday{
	public static void main(String[] args){
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter year");
		int y = inputObj.nextInt();
		int a = y%19;
		// The quotient is the number obtained by dividing one number by another.
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		int n = (h-m+r+90)/25;
		int p = (h-m+r+n+19)%32;
		System.out.println("April "+p+" "+y);
	}
}