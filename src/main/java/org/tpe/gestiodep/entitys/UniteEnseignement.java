package org.tpe.gestiodep.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class UniteEnseignement implements Serializable {
	@Id
	@GeneratedValue
   private long idUE;
   private String nomUE;
   private String codeUE;
   
   @ManyToOne
   @JoinColumn(name = "Id_departement")
   private Departement departement;
   
   @ManyToOne
   @JoinColumn(name = "Id_parcour")
   private Parcour parcour;
    
   @ManyToOne
   @JoinColumn(name = "Id_niveau")
   private Niveau niveau;
     
   @ManyToOne
   @JoinColumn(name = "Id_enseignant")
   private Enseignant enseignant;

public long getIdUE() {
	return idUE;
}

public void setIdUE(long idUE) {
	this.idUE = idUE;
}

public String getNomUE() {
	return nomUE;
}

public void setNomUE(String nomUE) {
	this.nomUE = nomUE;
}

public String getCodeUE() {
	return codeUE;
}

public void setCodeUE(String codeUE) {
	this.codeUE = codeUE;
}

public Departement getDepartement() {
	return departement;
}

public void setDepartement(Departement departement) {
	this.departement = departement;
}

public Parcour getParcour() {
	return parcour;
}

public void setParcour(Parcour parcour) {
	this.parcour = parcour;
}

public Niveau getNiveau() {
	return niveau;
}

public void setNiveau(Niveau niveau) {
	this.niveau = niveau;
}

public Enseignant getEnseignant() {
	return enseignant;
}

public void setEnseignant(Enseignant enseignant) {
	this.enseignant = enseignant;
}

public UniteEnseignement(String nomUE, String codeUE) {
	super();
	this.nomUE = nomUE;
	this.codeUE = codeUE;
}

public UniteEnseignement() {
	super();
	// TODO Auto-generated constructor stub
}
   

}
