/**
 * Chaque livre a un id qui correspond à leur entrée dans le système. Chaque livre a un état qui nous permet de savoirs’il est disponible ou indisponible..
 */
import java.util.ArrayList;


public class Livre {

	private int idLivre;
	private String titre;
	private String auteur;
	private String etat;
	private ArrayList<Livre>T;

	/**
	 * 
	 * @param idLivre
	 * @param titre
	 * @param auteur
	 * @param etat
	 */
	public Livre(int idLivre, String titre, String auteur, String etat) {
		throw new UnsupportedOperationException();
	}

	public String getTitre() {
		return this.titre;
	}

	/**
	 * 
	 * @param titr
	 */
	public void setTitre(String titr) {
		this.titre = titr;
	}

	public String getEtat() {
		return this.etat;
	}

	/**
	 * 
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public ArrayList<Livre> getT() {
		return this.T;
	}
	public boolean equals(Object obj) {
		
		Livre l = (Livre) obj;
		 return titre.equals(l.titre);
		 }

}