import java.util.concurrent.ThreadLocalRandom;
public class randChoice{
	public static void main(String[] args){
		int n= ThreadLocalRandom.current().nextInt(1, 3 + 1);
		if(n==1){
			System.out.print("Area of circle with rad 10 = "+Math.PI*10*10);
		}else if (n==2){
			System.out.print("Volume of sphere with rad 10 = "+(4.0/3.0)*Math.PI*10*10*10);
		}else if (n==3){
			System.out.print("distance between (5, 5) and (12, 6)= "+Math.sqrt((12-5)*(12-5)+(6-5)*(6-5)));
		}
	}
}