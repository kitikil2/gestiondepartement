package org.tpe.gestiodep.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.tpe.gestiodep.entitys.Departement;
import org.tpe.gestiodep.entitys.UniteEnseignement;

@Entity
public class Enseignant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_enseignant;
   
   private String nomEnsignant;
   
   private String prenomEnsignant;
    
   private java.util.Date dateNaissance;
    
   private String lieuNaissance;
   
   @OneToMany(mappedBy = "enseignant")
   public List<UniteEnseignement> uniteEnseignement;
  
   @ManyToOne
   @JoinColumn(name = "Id_Departement")
   public Departement departement;

public Enseignant(String nomEnsignant, String prenomEnsignant, Date dateNaissance, String lieuNaissance) {
	super();
	this.nomEnsignant = nomEnsignant;
	this.prenomEnsignant = prenomEnsignant;
	this.dateNaissance = dateNaissance;
	this.lieuNaissance = lieuNaissance;
}

public Enseignant() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId_enseignant() {
	return id_enseignant;
}

public void setId_enseignant(long id_enseignant) {
	this.id_enseignant = id_enseignant;
}

public String getNomEnsignant() {
	return nomEnsignant;
}

public void setNomEnsignant(String nomEnsignant) {
	this.nomEnsignant = nomEnsignant;
}

public String getPrenomEnsignant() {
	return prenomEnsignant;
}

public void setPrenomEnsignant(String prenomEnsignant) {
	this.prenomEnsignant = prenomEnsignant;
}

public java.util.Date getDateNaissance() {
	return dateNaissance;
}

public void setDateNaissance(java.util.Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}

public String getLieuNaissance() {
	return lieuNaissance;
}

public void setLieuNaissance(String lieuNaissance) {
	this.lieuNaissance = lieuNaissance;
}

public List<UniteEnseignement> getUniteEnseignement() {
	return uniteEnseignement;
}

public void setUniteEnseignement(List<UniteEnseignement> uniteEnseignement) {
	this.uniteEnseignement = uniteEnseignement;
}

public Departement getDepartement() {
	return departement;
}

public void setDepartement(Departement departement) {
	this.departement = departement;
}
   

}