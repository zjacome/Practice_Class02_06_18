import java.util.Scanner;
public class Country_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("What is the County's name?");
		String Name=scanner.nextLine();
	System.out.println("What is the county's population?");
		int Population=scanner.nextInt();
	System.out.println("When was the county stablished?");
		int stablished=scanner.nextInt();
	System.out.println("What is the land volume of the county?");
		double LandVolume=scanner.nextDouble();
		
	County county= new County(Name,  Population, stablished, LandVolume);
	
	System.out.println("County Name:"+county.Name);
	System.out.println("County Population:"+county.Population);
	System.out.println("County was stablished in"+ county.stablished);
	System.out.println("County's land volume:"+county.LandVolume+"km^3");
		

	}

}
