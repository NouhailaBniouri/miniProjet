import gestionBiblio.Livre;

/**
 *   Un id donne a l’emprunteur , il peut rechercher et emprunter les livres de la bibliothèque.
 */
public class Emprunteur {

	
	private int idEmprunteur;
	private String nom;
	private String prenom;
	
	/**
	 * @param idEmprunteur
	 * @param nom
	 * @param prenom
	 */
	public Emprunteur(int idEmprunteur, String nom, String prenom) {
		this.idEmprunteur = idEmprunteur;
		this.nom = nom;
		this.prenom = prenom;
	}



	public void rechercher() {
		throw new UnsupportedOperationException();
		
			for(Livre l: T) if (l.getTitre().equals(titre)) return l;
			
		}
	}

	public void emprunter() {
		throw new UnsupportedOperationException();
	}

}