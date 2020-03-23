package org.tpe.gestiodep.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idEtudiant;
   
  private String nomEtudiant;
   
  private String prenomEtudiant;
   
  private String Matricule;
   
  private Date dateNassance;
   
  private String lieuNaissance;
  
   @ManyToOne
   @JoinColumn(name = "Id_niveau")
  private Niveau niveau;
    
   @ManyToOne
   @JoinColumn(name = "Id_departement")
  private Departement departement;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomEtudiant, String prenomEtudiant, String matricule, Date dateNassance,
			String lieuNaissance) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		Matricule = matricule;
		this.dateNassance = dateNassance;
		this.lieuNaissance = lieuNaissance;
	}

	public long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getMatricule() {
		return Matricule;
	}

	public void setMatricule(String matricule) {
		Matricule = matricule;
	}

	public Date getDateNassance() {
		return dateNassance;
	}

	public void setDateNassance(Date dateNassance) {
		this.dateNassance = dateNassance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
  
  
}