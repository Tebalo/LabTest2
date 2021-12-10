import java.util.Scanner;
import java.text.DecimalFormat;
public class Guzzler{
	public static String display(double litres, double rate, String cost, String msg){
		String upperborder = "**************************************************************";
		String sideborder = "**";
		String space = "\t";
		String display = upperborder+"\n"+sideborder+space+"Tank size: "+litres+"L"+space.repeat(4)+"Price: P"+rate+"/L\n"+sideborder+space+"Total cost: P"+cost+space.repeat(3)+"Msg: "+msg;
		return display;
	}
	private static final DecimalFormat dfZero = new DecimalFormat("#0.00");
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of litres");
		double litres = input.nextDouble();
		System.out.println("Enter price of litre");
		double rate = input.nextDouble();
		/**
		*COST = number of litres * price per litre
		***/
		double cost = (litres * rate);
      String res = String.format("%.2f",cost);

      if(cost>=0 && cost<200){
         System.out.println(display(litres,rate,res,"I need a car like yours!"));
      }else if(cost>=200 && cost<300){
         System.out.println(display(litres,rate,res,"That’s reasonable!"));
      }else if(cost>=300 && cost<400){
         System.out.println(display(litres,rate,res,"I need a car like yours!"));
      }else if(cost>=400 && cost<500){
         System.out.println(display(litres,rate,res,"Can’t compete with you!"));
      }else if(cost>=500){
         System.out.println(display(litres,rate,res,"Is that a V8 or V12?"));
      }else{
       System.out.println("Error!!!");
      }           
	}
}