package etd;

import java.io.Serializable;

public class Etudiant implements Serializable {
	private String nom;
	private String matiere;
	private  float note;
	//private transient float note;
	// transient un attribut n'est pas serialiser donc est un attibus persistant
	
	public Etudiant(String nom, String matiere, float note) {
		super();
		this.nom = nom;
		this.matiere = matiere;
		this.note = note;
	}
	public Etudiant() {
		super();
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", matiere=" + matiere + ", code=" + note + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
}
