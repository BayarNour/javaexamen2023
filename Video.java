package maison2023;

import java.time.LocalDate;

public class Video extends Billettaggables {
	private String url;
	
	
	public Video(LocalDate DatePublication, String auteur,int capacite, String url) {
		super(DatePublication, auteur, capacite);
		this.url = url;
		}
	
	public String getUrl() {
	return url;
	}


	public String toString() {
		return "Video ["+ super.toString()+ ", url=" + url + "]";
		}
		
	

}
