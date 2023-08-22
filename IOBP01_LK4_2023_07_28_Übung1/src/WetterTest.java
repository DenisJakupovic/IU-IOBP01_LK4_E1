import java.util.Scanner;
public class WetterTest {

	public static void main(String[] args) {
		System.out.println("Bitte sage mir, " 
							+ "\nob gerade die Sonne scheint (1), "
							+ "\nob es gerade regnet (2),"
							+ "\nob es gerade schneit (3),"
							+ "\nob es gerade blitzt (4),"
							+ "\nob es gerade stuermt (5)");
		Scanner scan = new Scanner (System.in);
		int aktuellesWetter = scan.nextInt();
		scan.close();
		
		if (aktuellesWetter == 1) {
			System.out.println ("Es geht heute zum Picknick!");
		}
		else if (aktuellesWetter == 2) {
			System.out.println ("Es geht heute ins Kino!");
		}
		else if (aktuellesWetter == 3) {
			System.out.println ("Es geht heute zum Schlittenfahren!");
		}
		else if (aktuellesWetter == 4 || aktuellesWetter == 5) {
			System.out.println ("Es wird heute Karten gspielt!");
		}
		else {
			System.out.println("Falsche Eingabe!");
			System.out.println("Bitte einen Wert von 1 bis 5 eingeben");
		}
	}

}
