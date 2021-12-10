import java.util.Random;

public class DrunkenMaster{
	public static void main(String[] args3){
		int i = 0;
		
		double minVal = 0.0, maxVal = 1.0;
		double value;
      int coordinate[] = {0,0};
      double x;
		while(i <=10000){
			x = (Math.random() * ((maxVal - minVal))) + minVal;
			value = Math.round(x * 100.0) / 100.0; 
			if(value<0.25){
         //System.out.println(value+ " Add 1 to x (Take step East)");
            coordinate[0] = coordinate[0]+1;
			}else if(value>=0.25 && value<0.5){
         //System.out.println(value+ " Subtract 1 from y (Take step South)");
            coordinate[1] = coordinate[1]-1;
			}else if(value>=0.5 && value<0.75){
         //System.out.println(value+ " Subtract 1 from x (take step West)");
            coordinate[0] = coordinate[0]-1;
			}else if(value>=0.75){
         //System.out.println(value+ " Add 1 to y (Take step North)");
            coordinate[1] = coordinate[1]+1;
			}
			i++;
		}
      System.out.println("("+coordinate[0]+","+coordinate[1]+")");
      double xsqr = Math.pow(3,2);
      double ysqr = Math.pow(-4,2);
      double res = Math.sqrt((xsqr+ysqr));
      String distance = String.format("%.2f", res);
      System.out.println("Drunken Master started (0,0) and finished at (" +coordinate[0]+", "+coordinate[1]+").");
      System.out.println("Drunken Master is "+distance+" units away");
	}
}