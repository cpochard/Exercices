
public class MainClass {

	public static void main(String[] args) {

		int iAChanger = 3;
		changeInt (iAChanger);
		System.out.println(iAChanger);
		
		Holder contenant = new Holder();
		Holder contenant2 = new Holder();
		Holder contenant3 = new Holder();
		Words w = new Words();

		contenant.setDonnees(12);
		System.out.println("Avant : " + contenant.getDonnees());
		
		changeHolder (contenant);
		System.out.println("Après : " + contenant.getDonnees());
		
		threeHolder (contenant, contenant2, contenant3);
		
		String bonj = "Bien le bonjour";
		//Afficher tout en minuscules
		System.out.println(bonj.toLowerCase());
		//Tout en majuscules
		System.out.println(bonj.toUpperCase());
		//Afficher 2e caractère (i de Bien)
		System.out.println(bonj.charAt(1));
		//Affichez la position du premier « e » de bonj
		System.out.println(bonj.indexOf("e"));
		//Separer fonction des espaces
		for (int i = 0; i<bonj.split(" ").length ;i++ ) {
			System.out.println(bonj.split(" ")[i]);
		}
		//Récuperer bonjour
		System.out.println(bonj.substring(8, 15));
		
		//Afficher lettre majuscule aléatoire
		System.out.println(w.lettreAleatoireMajuscule());
		//Afficher mot aléatoire
		System.out.println(w.motAleatoire(5));
		//Afficher tableau aléatoire
		String [] t;
		t= w.tableauAleatoire(2, 3);
		for (String temp :t) {
			System.out.println(temp);	
		}
		
		//checker si lettre en position 0 est une voyelle (true) ou consonne (false)
		w.chekVoy("coucou", 0);
		
		//Générer une mot de passe de 10 caractères avec minuscule/majuscule aléatoire, symbole etc ...
		w.generatePassword();
		
		int i1 = 3;
		int i2 = 5;
		int i3 = 10;
		int somme = (i1+i2)*i3;
		System.out.println(somme);
		System.out.println(i3++);
		System.out.println(++i3);
		System.out.println((false && false) || true);
		System.out.println(false && (false || true));
		System.out.println(false && false || true);
		
		//Afficher ligne de i+5 etoiles
		System.out.println(Formes.ligne(5));
		//Afficher rectangle de iXi etoiles
		System.out.println(Formes.rectangleSansLigne(5));
		System.out.println(Formes.rectangleAvecLigne(4));
		//Afficher triangle montant allant de 1 a i etoiles
		System.out.print(Formes.triangleMontant(5));
		//Afficher triangle descendant partant de i etoiles jusqu'à 1
		System.out.println(Formes.triangleDescendant(5));
		//Afficher losange
		System.out.println(Formes.losange(8));
		
		}
	
	public static void changeInt(int i) {
		i = i + 3;
		System.out.println("La valeur de i est de : " + i);
	}
	
	public static void changeHolder (Holder h) {
		h.setDonnees(42);
		System.out.println("La valeur de h dans la méthode est de : " + h.getDonnees());
	}
	
	public static void threeHolder (Holder h1, Holder h2, Holder h3) {
		h1.setDonnees(10);
		h2.setDonnees(20);
		
		h3.setDonnees(h1.getDonnees()+h2.getDonnees());
		System.out.println("La valeur de h3 est de :" + h3.getDonnees());
	}
	
	}

