//First of all : Welcome new teacher !!           //First of all : Welcome new teacher !!         //First of all : Welcome new teacher !!
package br2;

public class Candidat {
	
	public String Id;
	public String Nom, Prenom, Ville, Adresse, Email;
	
	

	public String getId() {
		return Id;
	}

	public void setId(String string) {
		this.Id = string;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Candidat() {
		super();
	}

	public Candidat(String id, String nom, String prenom, String ville, String adresse, String email) {
		super();
		this.Id = id;
		Nom = nom;
		Prenom = prenom;
		Ville = ville;
		Adresse = adresse;
		Email = email;
	}

	@Override
	public String toString() {
		return "Candidat [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Ville=" + Ville + ", Adresse="
				+ Adresse + ", Email=" + Email + "]";
	}
	
}
