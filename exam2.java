import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int tmp =0;
		int tmp1 =0;
		for(int i =2;;i++){
			tmp = num % i;
			tmp1 = num / i;
			if(tmp == 0){
				if(tmp1 == 1){
					System.out.println("YES");
					break;
				}
				else{
					System.out.println("NO");
					break;
				}
			}
		}
	}

}
