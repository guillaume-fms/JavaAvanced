package fr.fms.city;

//Exercice 1.2 : Reprendre au choix un exercice des semaines précédentes puis ajouter un
//traitement à base d’exceptions là il vous semble pertinent, il faut à minima utiliser les mots
//clés throws, throw, try catch...


public class TestCity {

	public static void main(String[] args) {
		
		City bordeaux = new City ("Bordeaux", "France",249712 );
		
		System.out.println(bordeaux + "\n");
		
		 bordeaux.setNbInhabitants(bordeaux.getNbInhabitants());
		 bordeaux.setNbInhabitants(- 9712);
	}

}
