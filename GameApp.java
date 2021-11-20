import java.util.ArrayList;
import java.util.List;
public class GameApp{
	
	static ArrayList<String> br1 = new ArrayList<String>();
	static ArrayList<String> br2 = new ArrayList<String>();
	static ArrayList<String> br3 = new ArrayList<String>();
	static ArrayList<String> br4 = new ArrayList<String>();
	static ArrayList<String> br5 = new ArrayList<String>();
	static ArrayList<String> br6 = new ArrayList<String>();
	static ArrayList<String> br7 = new ArrayList<String>();
	static ArrayList<String> br8 = new ArrayList<String>();
	static ArrayList<String> br9 = new ArrayList<String>();
	static ArrayList<String> br10 = new ArrayList<String>();
	static ArrayList<String> br11 = new ArrayList<String>();
	static ArrayList<String> br12 = new ArrayList<String>();
	static ArrayList<String> br13 = new ArrayList<String>();
	static ArrayList<String> br14 = new ArrayList<String>();
	static ArrayList<String> br15 = new ArrayList<String>();
	static ArrayList<String> br16 = new ArrayList<String>();
	static ArrayList<String> br17 = new ArrayList<String>();
	static ArrayList<String> br18 = new ArrayList<String>();
	static ArrayList<String> br19 = new ArrayList<String>();
	static ArrayList<String> br20 = new ArrayList<String>();
	
	
	static Region r1 = new Region("Athens", 3, "Blue", br1);
	static Region r2 = new Region("Sparta", 5, "Red", br2);
	static Region r3 = new Region("Korinth", 3, "Green", br3);
	static Region r4 = new Region("Crete", 4, "Yellow", br4);
	static Region r5 = new Region("Macedonia", 4, "Blue", br5);
	static Region r6 = new Region("Rome", 6, "Red", br6);
	static Region r7 = new Region("Ravenna", 3, "Green", br7);
	static Region r8 = new Region("Sicily", 2, "Yellow", br8);
	static Region r9 = new Region("Florence", 4, "Blue", br9);
	static Region r10 = new Region("Sardinia", 2, "Red", br10);
	static Region r11 = new Region("Thinis", 4, "Green", br11);
	static Region r12 = new Region("Tanis", 7, "Yellow", br12);
	static Region r13 = new Region("Alexandria", 7, "Blue", br13);
	static Region r14 = new Region("Avaris", 4, "Red", br14);
	static Region r15 = new Region("Memphis", 3, "Green", br15);
	static Region r16 = new Region("Nineveh", 5, "Yellow", br16);
	static Region r17 = new Region("Susa", 2, "Blue", br17);
	static Region r18 = new Region("Ashur", 3, "Red", br18);
	static Region r19 = new Region("Persepolis", 7, "Green", br19);
	static Region r20 = new Region("Babylon", 2, "Yellow", br20);
				
	static Region[] tabler = {	r1, r2, r3, r4, r5,
								r6, r7, r8, r9, r10,
								r11, r12, r13, r14, r15,
								r16, r17, r18, r19, r20 };
		
	static Player p1 = new Player("", "Blue", 20, 5);
	static Player p2 = new Player("", "Red", 20, 5);
	static Player p3 = new Player("", "Green", 20, 5);
	static Player p4 = new Player("", "Yellow", 20, 5);
	
	static Player[] tablep = { p1, p2, p3, p4 };
	
	public static void main(String[] args) {
				
		Function.gamestart();
	}	
}
