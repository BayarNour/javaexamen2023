package maison2023;

public class Blog  {
	
	private String titre;
	private Publiable[] lbillets;
	private int nbbillets;
	private int capacite;
	
	public Blog(String titre,int capacite) {
		this.titre=titre;
		this.capacite=capacite;
		this.lbillets=new Publiable[capacite];
		this.nbbillets=0;
		
	}
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbbillets() {
		return nbbillets;
	}
	public void setNbbillets(int nbbillets) {
		this.nbbillets = nbbillets;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public void post(Publiable lbillet) throws InvalidURLException{
		if (lbillet instanceof Video) {
			String url=((Video)lbillet).getUrl();
			if(!url.startsWith("\"https://\"")) {
				throw new InvalidURLException("l'url de la video n'est pa securisee";)
			}
		}
			if (nbbillets<capacite) {
				lbillets[nbbillets++]=lbillet;
			}else {
				System.out.println("capacite maximale");
			}
	
		

	}
	
	public int getNombreBilletsTaggables() {
	    int count = 0;

	    for (Publiable billet : lbillets) {
	        if (billet instanceof Billettaggables) {
	            count++; 
	            }
	    }

	    return count;
	    }
	
	public Publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
	    int count = 0;
	    for (Publiable billet : lbillets) {
	        if (billet instanceof Billettaggables && billet.getAuteur().equals(auteur)) {
	            count++;
	        }
	    }

	    Publiable[] result = new Publiable[count];
	    int index = 0;

	    for (Publiable billet : lbillets) {
	        if (billet instanceof Billettaggables && billet.getAuteur().equals(auteur)) {
	            result[index++] = billet;
	        }
	    }

	    return result;
	}
	

	public Publiable getPlusRécentBillet() {
	    Publiable plusRecent = null;

	    if (nbbillets > 0) {
	        plusRecent = lbillets[0];

	        for (int i = 1; i < nbbillets; i++) {
	            if (lbillets[i].getDatePublication().isAfter(plusRecent.getDatePublication())) {
	                plusRecent = lbillets[i];
	            }
	        }
	    }

	    return plusRecent;
	}
	
	
	public Publiable[] RechercheBilletsParContenu(String[] mots) {
	    int count = 0;

	    for (Publiable billet : billets) {
	        if (billet instanceof Message) {
	            boolean allFound = true;

	            for (String mot : mots) {
	                if (!((Message) billet).getContenu().contains(mot)) {
	                    allFound = false;
	                    break;
	                }
	            }

	            if (allFound) {
	                count++;
	            }
	        }
	    }

	    Publiable[] result = new Publiable[count];
	    int index = 0;

	    for (Publiable billet : lbillets) {
	        if (billet instanceof Message) {
	            boolean allFound = true;

	            for (String mot : mots) {
	                if (!((Message) billet).getContenu().contains(mot)) {
	                    allFound = false;
	                    break;
	                }
	            }

	            if (allFound) {
	                result[index++] = billet;
	            }
	        }
	    }

	    return result;
	}
	
}
