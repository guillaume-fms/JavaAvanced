package fr.fms.city;

// Exercice 1.2 : Reprendre au choix un exercice des semaines précédentes puis ajouter un
// traitement à base d’exceptions là il vous semble pertinent, il faut à minima utiliser les mots
// clés throws, throw, try catch...

public class City {
	
	// Add attributs
		 private String town;
		 private String country;
		 private Integer nbInhabitants; 

		// Create Constructeur
		 public City(String town, String country, Integer nbInhabitants) {
			 setTown(town);
			 setCountry(country);
			 setNbInhabitants(nbInhabitants);
		 }
		// Create Getters and Setters
		public String getTown() {
			return town;
		}


		public void setTown(String town) {
			this.town = town;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public Integer getNbInhabitants() {
			return nbInhabitants;
		}


		public void setNbInhabitants(Integer nbInhabitants) {
			if(nbInhabitants < 0)
				throw new RuntimeException("{Attention ! La population ne peut pas être négative !!}");
			this.nbInhabitants = nbInhabitants;
		}


		// Create Méthode 
		
		public String toString() {
				return "{ Town : " + getTown() + "\t" + "Country : " + getCountry() + "\t" + "NbInhabitants : "
			+ this.getNbInhabitants() + " }" ;
				}
		
	}
