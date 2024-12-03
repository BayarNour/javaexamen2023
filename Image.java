package maison2023;

import java.time.LocalDate;

public class Image extends Billettaggables{
	private String url;
	
	
	public Image(LocalDate DatePublication, String auteur,int capacite, String url) {
	super(DatePublication, auteur, capacite);
	this.url = url;
	}
	public String getUrl() {
	return url;
	}
	
	public String toString() {
	return "Image ["+ super.toString()+ ", url=" + url + "]";
	}
	

}
