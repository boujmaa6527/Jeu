import java.util.*;
public class Jeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first commmit to pc to guitHub
		Scanner scan = new Scanner(System.in);
		// list of word in the array
		String[] motMystere = {"camion",
				"velo",
				"cle",
				"pain",
				"voiture",
				"tapist"};
		// 1er) partis
		// number of random
		int intSecret = (int) (Math.random() * motMystere.length); 
		// word "ramdom" of array
		String wordSecret = motMystere[intSecret];
		String wordTiret = "";
		//System.out.println("("+wordSecret+")");
		System.out.print("Mots Mystère : ");
		
		for(int i =0; i < wordSecret.length(); i++) {
			wordTiret += "-";
		}
		
		System.out.println(wordTiret);
		System.out.println();
		String findWord = "";
		int counterTry = 10;
		
		int positionChar = 0; 
		boolean ok = false; 
		while(counterTry  > 0) {
			
			System.out.println("Proposez une lettre: ");
			String c = scan.nextLine();
			if(wordSecret.contains(c)) {
				//positionChar = i; 
				
				System.out.println("Bien joué ! La lettre: "+ c +" est dans le mot");
				int charPos = wordSecret.indexOf(c);
				char charVar = wordSecret.charAt(charPos);
				//wordTiret = wordTiret.replace('-', charVar);
				wordTiret = wordTiret.substring(0, charPos)+ charVar + wordTiret.substring(charPos + 1);
				if(wordTiret.equals(wordSecret)) {
					System.out.println("Bravo vous avez gagné! ");
					System.out.println("Le mot était '"+ wordSecret +"'");
					break;
					
				}
		      
				System.out.println(wordTiret);
				
				//String repalce = wordTiret.charAt(positionChar);
				//System.out.println(wordTiret.charAt(positionChar));
				ok = true;
				//charReplace = wordTiret.replace("_", c);
				
					
			}else {
				counterTry--; 
				System.out.println("Dommage la lettre '"+ c+"' n'est pas dans le mot. Il vous reste "+ counterTry+" essais");
				
			}
			if(counterTry == 0) {
				System.out.println("Désolé l'artiste vous avez perdu! ");
				System.out.println("Le mot msytère était : "+ wordSecret);
				
			}
			
		}
		scan.close();
		
	
	}
	public static String changeCharInPosition(int position, char ch, String str){
	    char[] charArray = str.toCharArray();
	    charArray[position] = ch;
	    return new String(charArray);
	  
	}
	
}
