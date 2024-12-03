package maison2023;

import java.time.LocalDate;

public class Message extends Billet {
	private String contenu;
	
	public Message(LocalDate DatePublication, String auteur,String contenu) {
		super(DatePublication, auteur);
		this.contenu=contenu;
	}
	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


}
