package com.ucergy.info.chimie;

public class Atome {
	String nom;
	String symbole;
	String famille;
	int numeroAtomique;
	double masseAtomique;
	int periode;
	int colonne;
	int nombreLiaison;
	public Atome(String nom, String symbole, String famille, int numeroAtomique, double masseAtomique, int periode, int colonne,int nombreLiaison) {
		this.nom = nom;
		this.symbole = symbole;
		this.famille = famille;
		this.numeroAtomique = numeroAtomique;
		this.masseAtomique = masseAtomique;
		this.periode = periode;
		this.colonne = colonne;
		this.nombreLiaison=nombreLiaison ;
	}
	
	public int getNombreLiaison() {
		return nombreLiaison;
	}

	
	public String getNom() {
		return nom;
	}
	
	public String getSymbole() {
		return symbole;
	}
	
	public String getFamille() {
		return famille;
	}
	
	public int getNumeroAtomique() {
		return numeroAtomique;
	}
	
	public double getMasseAtomique() {
		return masseAtomique;
	}
	
	public int getPeriode() {
		return periode;
	}
	
	public int getColonne() {
		return colonne;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atome other = (Atome) obj;
		if (colonne != other.colonne)
			return false;
		if (famille == null) {
			if (other.famille != null)
				return false;
		} else if (!famille.equals(other.famille))
			return false;
		if (Double.doubleToLongBits(masseAtomique) != Double
				.doubleToLongBits(other.masseAtomique))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numeroAtomique != other.numeroAtomique)
			return false;
		if (periode != other.periode)
			return false;
		if (symbole == null) {
			if (other.symbole != null)
				return false;
		} else if (!symbole.equals(other.symbole))
			return false;
		return true;
	}

}