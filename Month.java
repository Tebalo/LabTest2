import java.util.Scanner;
class Month{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String names = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
		System.out.println("Enter month number");

		int month = input.nextInt();
		input.close();

		String month_text = names.substring((month - 1) *9, month*9);
		System.out.println(month_text);
	}
}