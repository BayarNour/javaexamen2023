package maison2023;

import java.time.LocalDate;
import java.util.Arrays;

public class Billettaggables extends Billet implements Taggable {
	private String [] tags;
	private int nbtags;
	private final int capacite;
	
	

	public Billettaggables(LocalDate DatePublication, String auteur,int capacite) {
		super(DatePublication, auteur);
		this.capacite=capacite;
		this.tags=new String[capacite];
		this.nbtags=0;
	}


	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public int getNbtags() {
		return nbtags;
	}

	public void setNbtags(int nbtags) {
		this.nbtags = nbtags;
	}

	public String toString() {
		return super.toString()+"tags=" + Arrays.toString(getTags()) + ", nbtags=" + nbtags ;
	}
	
	
	public void ajoutTag(String tag ) {
		
		for(int i=0;i<nbtags;i++) {
			if(tags[i].equals(tag)) {
				
				System.out.println("tag deja existe"+tag);
				return;
			}
		}
		
		
		if(nbtags<capacite) {
			tags[nbtags]=tag;
			nbtags++;
		}
		else {
			System.out.println("erreur tags ");
		}
	}
	
	
	public void supprimeTag(String tag) {
		boolean trouve=false;
		for(int i=0;i<nbtags;i++) {
			if (tags[i].equals(tag)) {
				trouve=true;
				
				
				for(int j=i;j<nbtags-1;j++) {
					tags[j]=tags[j+1];
				}
				tags[--nbtags]=null;
				break;
			}
			if(!trouve) {
				System.out.println(tag+"tag introuvalble");
			}
			
		}
		
	}
	
	public int nombreTags() {
		return nbtags;
	}
	
	
	public int rechercheTag(String tag) {
		for(int i=0;i<nbtags;i++) {
			if(tags[i].equals(tag)) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	
}
