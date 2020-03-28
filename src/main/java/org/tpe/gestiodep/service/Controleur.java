package org.tpe.gestiodep.service;

import org.tpe.gestiodep.dao.DepartementRepository;
import org.tpe.gestiodep.dao.EnseignantRepository;
import org.tpe.gestiodep.dao.EtudiantRepository;
import org.tpe.gestiodep.dao.UniteEnseignantRepositiry;
import org.tpe.gestiodep.entitys.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controleur {
	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private EnseignantRepository enseignantRepository;
	@Autowired
	private UniteEnseignantRepositiry uniteEnseignantRepositiry;
	
	@GetMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("listedepartement", departementRepository.findAll());
		return "index";
	}
	
	@GetMapping(value = "/departement")
	public String departmi(Model model, @RequestParam(name = "iddepartement") Long iddepart,
			@RequestParam(name = "idf") String id) {
		model.addAttribute("iddepartement", iddepart);
		Departement dep=departementRepository.findById(iddepart).get();
		model.addAttribute("listeEtudiant", dep.getEtudiant());
		model.addAttribute("listeEn", dep.getEnseignant());
		model.addAttribute("listeUE", dep.getUniteEnseignement());
		model.addAttribute("idf", id);
		return "accueil";
	}

}