package org.tpe.gestiodep.metier;

import java.util.Date;
import java.util.stream.Stream;

import org.tpe.gestiodep.dao.DepartementRepository;
import org.tpe.gestiodep.dao.EnseignantRepository;
import org.tpe.gestiodep.dao.EtudiantRepository;
import org.tpe.gestiodep.dao.NiveauRepository;
import org.tpe.gestiodep.dao.ParcourRepository;
import org.tpe.gestiodep.dao.UniteEnseignantRepositiry;
import org.tpe.gestiodep.entitys.Departement;
import org.tpe.gestiodep.entitys.Enseignant;
import org.tpe.gestiodep.entitys.Etudiant;
import org.tpe.gestiodep.entitys.Niveau;
import org.tpe.gestiodep.entitys.Parcour;
import org.tpe.gestiodep.entitys.UniteEnseignement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplImetierInit implements ImetierInit{
	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private EnseignantRepository enseignantRepository;
	@Autowired
	private UniteEnseignantRepositiry uniteEnseignantRepositiry;
	@Autowired
	private NiveauRepository niveauRepository;
	@Autowired
	private ParcourRepository parcourRepository;

	@Override
	public void initDepartement() {
		Stream.of("Departement de Math-Infos").forEach(nomDepartement->{
			Departement departement= new Departement();
			departement.setNomDepartement(nomDepartement);
			departementRepository.save(departement);
		});
	}

	@Override
	public void initEtudiant() {
		departementRepository.findAll().forEach(depart->{
			for (int i = 0; i < 6; i++) {
				Etudiant etudiant=new Etudiant("ABBEL"+i, "KITIKIL"+i, "16A"+i+"FS", new Date(), "MAROUA"+i);
				etudiant.setDepartement(depart);
				etudiantRepository.save(etudiant);
			}
		});
	}

	@Override
	public void initEnseignant() {
		departementRepository.findAll().forEach(depart->{
			for (int i = 0; i < 6; i++) {
				Enseignant enseignant=new Enseignant("ABBA"+i, "BOUBA"+i, new Date(), "GAROUA"+i);
				enseignant.setDepartement(depart);
				enseignantRepository.save(enseignant);
			}
		});
	}

	@Override
	public void initParcour() {
		Parcour parcour= new Parcour("Master");
		parcour.setNiveau(niveauRepository.findAll());
		parcourRepository.save(parcour);
	}

	@Override
	public void initUniteEnseignement() {
		departementRepository.findAll().forEach(depart->{
			enseignantRepository.findAll().forEach(enseignenant->{
				for (int i = 0; i < 3; i++) {
					UniteEnseignement uniteEnseignant = new UniteEnseignement("GENIE"+i+""+enseignenant.getId_enseignant(), "INF01"+i);
					uniteEnseignant.setDepartement(depart);
					uniteEnseignant.setEnseignant(enseignenant);
					uniteEnseignantRepositiry.save(uniteEnseignant);
				}
			});
		});
	}

	@Override
	public void initNiveau() {
		java.util.List<Etudiant> etudiant=etudiantRepository.findAll();
			Niveau niveau=new Niveau("Master 1");
			niveau.setEtudiant(etudiant);
			Parcour parcour=parcourRepository.findById((long) 1).get();
			System.out.println(parcour.toString());
			niveau.setParcour(parcour);
			niveauRepository.save(niveau);
	}

}

