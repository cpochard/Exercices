import java.util.Random;

public class Words {

	public Words() {
	}
	
	private static Random r = new Random(); 

	public static char lettreAleatoireMajuscule() {
		return (char)(r.nextInt(26) + 'A'); 
	}

	public static char lettreAleatoireMinuscule() {
		return (char)(r.nextInt(26) + 'a'); 
	}

	public static String motAleatoire(int nbLettres) {
		String s = "";
		for(int i=0;i<nbLettres;i++) {
			s+= lettreAleatoireMajuscule();
		}
		return s;
	}

	public static String[] tableauAleatoire(int nbMots,int nbLettres) {
		String[] tab = new String[nbMots];
		for(int i = 0; i<nbMots;i++)
			tab[i] = Words.motAleatoire(nbLettres);
		return tab;
	}
	
	public static void chekVoy(String s, int i) {
		String temp = s;
		if (temp.length() > i && temp.charAt(i) == 'a' || temp.charAt(i) == 'e' ||temp.charAt(i) == 'i' ||temp.charAt(i) == 'o' ||temp.charAt(i) == 'u' ||temp.charAt(i) == 'y' ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static String generatePassword() {
		String password = "";
		boolean choixLettre = false;
		int compteur =0;
		//Password de 5 chars dont 3 maj, 2 min
		while(compteur<3) {
			System.out.println("Nouveau password");
			password = "";
			compteur = 0;
			for(int i = 0;i < 5;i++) {
				choixLettre = r.nextBoolean();
				if(choixLettre && compteur<3) {
					password += lettreAleatoireMajuscule();
					compteur++;
				}
				else {
					password += lettreAleatoireMinuscule();
				}
			}
		}
		return password;
	}
	
	public static void checkDico (String s, String[] dico) {
	dico = new String [] {"hello", "gutten tag", "bonjour", "hi"};
	}
}
