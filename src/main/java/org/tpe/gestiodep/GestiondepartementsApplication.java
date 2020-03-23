package org.tpe.gestiodep;


import org.tpe.gestiodep.metier.ImplImetierInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestiondepartementsApplication implements CommandLineRunner {

	@Autowired
	private ImplImetierInit implImetierInit;
	
	public static void main(String[] args) {
		SpringApplication.run(GestiondepartementsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		implImetierInit.initDepartement();
		implImetierInit.initEtudiant();
		implImetierInit.initEnseignant();
		implImetierInit.initUniteEnseignement();
		implImetierInit.initParcour();
		implImetierInit.initNiveau();
		System.out.println("Bonjour");
	}


}
