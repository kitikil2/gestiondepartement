package org.tpe.gestiodep.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.tpe.gestiodep.entitys.Niveau;
import org.tpe.gestiodep.entitys.UniteEnseignement;

@Entity
public class Parcour implements Serializable{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long idParcour;
    
   private String nomparcour;
   
    @OneToMany(mappedBy = "parcour")
   private List<Niveau> niveau;
    @OneToMany(mappedBy = "niveau")
   private List<UniteEnseignement> uniteEnseignement;
	public Parcour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parcour(String nomparcour) {
		super();
		this.nomparcour = nomparcour;
	}
	public long getIdParcour() {
		return idParcour;
	}
	public void setIdParcour(long idParcour) {
		this.idParcour = idParcour;
	}
	public String getNomparcour() {
		return nomparcour;
	}
	public void setNomparcour(String nomparcour) {
		this.nomparcour = nomparcour;
	}
	public List<Niveau> getNiveau() {
		return niveau;
	}
	public void setNiveau(List<Niveau> niveau) {
		this.niveau = niveau;
	}
	public List<UniteEnseignement> getUniteEnseignement() {
		return uniteEnseignement;
	}
	public void setUniteEnseignement(List<UniteEnseignement> uniteEnseignement) {
		this.uniteEnseignement = uniteEnseignement;
	}
   
  
}