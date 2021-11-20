import java.util.Scanner;
import java.util.ArrayList;
public class Function {
	
	static Scanner keyboard = new Scanner(System.in);
		
	public static void gamestart() { // Starts the game with round 1 //
		for(int i = 1;i <= 50; i++) { 
			for(int j = 0; j <= 3; j++) {
				System.out.println(Game.tablep[j].getPlayerName()+" is your turn to play"); 
				
				
				
				
				
				
				
				System.out.println("From where do you want to attack ?"); // Attack
				String tempColor = Game.tablep[j].getPlayerColor(); // Attacker's color ( temporary )
				ArrayList<String> alliedStates = new ArrayList<String>();
				for(int k = 0; k <= 19; k++) {
					if(tempColor.equals(Game.tabler[k].getRegionColor())) {
						alliedStates.add(Game.tabler[k].getRegionName());
						System.out.println(Game.tabler[k].getRegionName());						
					}
				}
				
				boolean flag = true; // Check valid input
				while(flag) {
					String ra = keyboard.nextLine();
					for(int counter = 0; counter <= alliedStates.size(); counter++) {
						if(ra.equals(alliedStates.get(counter))) {
							flag = false;
							break;
						}
					}
								
				}
			}
		}
	}
	
	public void checkSoldiers() { // Gives soldiers to players depending on their regions' number //
		
	}
	
	public void placeSoldiers() { // Players choose where to place their soldiers //
		
	}
	
	public void attack(Region ra, Region rd) { // The option of attack ( from where to where; ) //
		
		
	}
	
	public void fortify() { // The option of fortifying soldiers ( from where; to where; how much; ) //
	
	}
		
}
