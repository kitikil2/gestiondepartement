package org.tpe.gestiodep.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.tpe.gestiodep.entitys.Etudiant;
import org.tpe.gestiodep.entitys.Parcour;
import org.tpe.gestiodep.entitys.UniteEnseignement;

@Entity
public class Niveau implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long idNiveau;
    
   private String nomNiveau;
   
    @OneToMany(mappedBy = "niveau")
   private List<Etudiant> etudiant;
   
    @OneToMany(mappedBy = "niveau")
   private List<UniteEnseignement> uniteEnseignement;
   
    @ManyToOne
    @JoinColumn(name = "Id_Parcour")
   private Parcour parcour;

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Niveau(String nomNiveau) {
		super();
		this.nomNiveau = nomNiveau;
	}

	public long getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(long idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getNomNiveau() {
		return nomNiveau;
	}

	public void setNomNiveau(String nomNiveau) {
		this.nomNiveau = nomNiveau;
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

	public Parcour getParcour() {
		return parcour;
	}

	public void setParcour(Parcour parcour) {
		this.parcour = parcour;
	}
   
   
}
