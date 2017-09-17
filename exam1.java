import java.util.Scanner;
public class exam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a1 = 100*100*3.14;
		double x = input.nextDouble();
		double y = input.nextDouble();
		double a2 = (Math.sqrt((x*x)+(y*y)))*(Math.sqrt((x*x)+(y*y)))*3.14;
		if (a1 >= a2){
			System.out.println("inside");
		}
		else if(a2 > a1){
			System.out.println("outside");
		}
	}

}
