
public class Formes {

	public Formes() {
	}

	public static String ligne (int nbEtoiles) {
		String s = "";
		for (int i=1; i<nbEtoiles ;i++) {
			s+= "*";
		}
		return s;
	}
	
	public static String rectangleSansLigne(int nbEtoilesParLigne) {
		String s = "";
		for(int j=1;j<=nbEtoilesParLigne;j++)
		{
			for(int i=1;i<=nbEtoilesParLigne;i++){
				s+="*";
			}
			//Mettre le retour chariot tant qu'on est pas à la dernière ligne
			if(j != nbEtoilesParLigne)
				s += "\n";
		}
		return s;
	}
	
	public static String rectangleAvecLigne(int nbEtoilesParLigne) {
		String s = "";
		for(int i=1;i<=nbEtoilesParLigne;i++) {
			s+=ligne(nbEtoilesParLigne)+"\n";
		}
		//Enlever le dernier retour chariot
		s = virerDernierAtislashN(s);
		return s;
	}
	
	public static String triangleMontant(int nbLignes) {
		String s = "";
		for(int i=nbLignes;i>=1;i--) {
			s += ligne(i);
			s+= "\n";
		}
		s = virerDernierAtislashN(s);
		return s;
	}
	
	public static String triangleDescendant(int nbLignes) {
		String s = "";
		for(int i=1;i<=nbLignes;i++) {
			s += ligne(i);
			s+= "\n";
		}
		s = virerDernierAtislashN(s);
		return s;
	}
	
	public static String losange(int nbLignes) {
		String s = "";
		if(nbLignes%2 == 0)
			nbLignes++;
		for(int nbEtoiles=1;nbEtoiles<=nbLignes;nbEtoiles+=2) {
			for(int i=1;i<=nbEspaces(nbEtoiles, nbLignes);i++)
				s+=" ";
			for(int j=1;j<=nbEtoiles;j++)
				s+="*";
			s+="\n";
		}
		for(int nbEtoiles=nbLignes-2;nbEtoiles>=1;nbEtoiles-=2) {
			for(int i=1;i<=nbEspaces(nbEtoiles, nbLignes);i++)
				s+=" ";
			for(int j=1;j<=nbEtoiles;j++)
				s+="*";
			s+="\n";
		}
		s = virerDernierAtislashN(s);
		return s;
	}
	
	protected static String virerDernierAtislashN(String forme) {
		return forme.substring(0,forme.length()-1);
	}
	
	protected static int nbEspaces(int nbEtoiles,int nbLignes) {
		return ((nbLignes-nbEtoiles)/2);
	}
}
