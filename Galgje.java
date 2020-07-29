import java.util.ArrayList;
import java.util.Scanner;

public class Galgje {
	
			public static void main(String[] args) {
				
				String WoordTeRaden[] = {"appeltaart", "boek", "fietsje", "programmeren", "lopen in het bos"};
				String Woord = WoordTeRaden[(int) (Math.random() * WoordTeRaden.length)];
				int AantalKansen = 7;
				raden(Woord, AantalKansen);
	
			}
	
			public static void raden (String Woord, int AantalKansen) {
				
				char [] Sterretje = new char [Woord.length()];
				int i = 0;
				while (i < Woord.length()) {
					Sterretje[i] = '*';
					if(Woord.charAt(i) == ' ') {
						Sterretje [i]= ' ';
					} i++;			
				} 
				
				System.out.println("Raad het woord! --- Je hebt nog " + AantalKansen + " kansen om het woord te raden");
				System.out.println(Sterretje);
				
				Scanner scanner = new Scanner(System.in);
	
				ArrayList listArr = new ArrayList();
			
				
				while (AantalKansen > 0) {
					char InvoerSpeler = scanner.next().charAt(0);
					
					if (listArr.contains(InvoerSpeler)) {
						System.out.println("Deze letter heb je al gebruikt. Kies een andere letter.");
						continue;
					}
					
					listArr.add(InvoerSpeler);
					
					if(Woord.contains(InvoerSpeler +"")) {
					for(int y = 0; y < Woord.length(); y++){
						if (Woord.charAt(y) == InvoerSpeler) {
							Sterretje[y] = InvoerSpeler;
						}
					}
				} 
					else {
					AantalKansen--;	
					}	
						if(Woord.equals(String.valueOf(Sterretje))) {
							System.out.println(Sterretje);
							System.out.println("Goed geraden! Je hebt gewonnen.");
							break;
						}

					System.out.println("Raad het woord! --- Je hebt nog " + AantalKansen + " kansen om het woord te raden");
					System.out.println(Sterretje);
				}
					if (AantalKansen == 0) {
						System.out.println("Jammer! Je hebt verloren.");
						System.out.println("Het juiste woord was: " + Woord);
					}	
			}		
	}

