import java.util.Scanner;
import java.util.ArrayList;
public class Function {
	
	static Scanner keyboard = new Scanner(System.in);
		
	public static void gameStart() { // Starts the game with round 1 //
		for(int i = 1;i <= 50; i++) { 
			for(int j = 0; j <= 3; j++) {
				System.out.println(GameApp.tablep[j].getPlayerName()+" is your turn to play"); 
				
				
				
				
				
				
				
				
				
				System.out.println("From where do you want to attack ?"); // Attack
				String tempColor = GameApp.tablep[j].getPlayerColor(); // Attacker's color ( temporary )
				ArrayList<String> alliedStates = new ArrayList<String>();
				for(int k = 0; k <= 19; k++) {
					if(tempColor.equals(GameApp.tabler[k].getRegionColor())) {
						alliedStates.add(GameApp.tabler[k].getRegionName());
						System.out.println(GameApp.tabler[k].getRegionName());						
					}
				}
				
				boolean flag = true; // Check valid input
				String ras = null;
				while(flag) {
					ras = keyboard.nextLine();
					for(int counter = 0; counter <= alliedStates.size(); counter++) {
						if(ras.equals(alliedStates.get(counter))) {
							flag = false;
							break;
						}
					}
								
				}
				int ra = 0; // Attacking Region
				for(int counter = 0; counter <= 19; counter++) {
					if(ras.equals(GameApp.tabler[counter].getRegionName())) {
						ra = counter;
						break;
						
					}
				}
				
				
				
				System.out.println("Where  do you want to attack ?"); // Defending Region
			    System.out.println(GameApp.tabler[ra].getBorders());
			    boolean flag = true;
			    String rad = null;
			    while()
			    
			    
			    
			    for(int counter = 0; counter <= 20; counter++) {
			    	
			    }
				
				
			}
		}
	}
	
	public void checkSoldiers() { // Gives soldiers to players depending on their regions' number //
		
	}
	
	public void placeSoldiers(int s) { // Players choose where to place their soldiers //
		
	}
	
	public void attack(Region ra, Region rd) { // The option of attack ( from where to where; ) //
		
		
	}
	
	public void fortify() { // The option of fortifying soldiers ( from where; to where; how much; ) //
	
	}
		
}
