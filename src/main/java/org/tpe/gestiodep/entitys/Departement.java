package org.tpe.gestiodep.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.tpe.gestiodep.entitys.Enseignant;
import org.tpe.gestiodep.entitys.Etudiant;
import org.tpe.gestiodep.entitys.UniteEnseignement;

@Entity
public class Departement implements Serializable {
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long Id_departement;
   private String nomDepartement;
   
   @OneToMany(mappedBy = "departement")
   private List<Enseignant> enseignant;
   
   @OneToMany(mappedBy = "departement")
   private List<Etudiant> etudiant;
   
   @OneToMany(mappedBy = "departement")
   private List<UniteEnseignement> uniteEnseignement;

public Departement(String nomDepartement) {
	super();
	this.nomDepartement = nomDepartement;
}

public long getId_departement() {
	return Id_departement;
}

public void setId_departement(long id_departement) {
	Id_departement = id_departement;
}

public String getNomDepartement() {
	return nomDepartement;
}

public void setNomDepartement(String nomDepartement) {
	this.nomDepartement = nomDepartement;
}

public List<Enseignant> getEnseignant() {
	return enseignant;
}

public void setEnseignant(List<Enseignant> enseignant) {
	this.enseignant = enseignant;
}

public List<Etudiant> getEtudiant() {
	return etudiant;
}

public void setEtudiant(List<Etudiant> etudiant) {
	this.etudiant = etudiant;
}

public List<UniteEnseignement> getUniteEnseignement() {
	return uniteEnseignement;
}

public void setUniteEnseignement(List<UniteEnseignement> uniteEnseignement) {
	this.uniteEnseignement = uniteEnseignement;
}
   
   
}
