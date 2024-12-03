package maison2023;
import java.time.LocalDate;

public class Billet implements Publiable{

			private LocalDate DatePublication;
			private String auteur;
			
			
			public Billet(LocalDate DatePublication, String auteur) {
				this.DatePublication = DatePublication;
				this.auteur = auteur;
				
			}



			public LocalDate getDatePublication() {
				return DatePublication;
			}


			public void setDatePublication(LocalDate DatePublication) {
				this.DatePublication=DatePublication;		}


			public String getAuteur() {
				return auteur;
			}


			public void setAuteur(String auteur) {
				this.auteur = auteur;
			}
		
			

		


	}


