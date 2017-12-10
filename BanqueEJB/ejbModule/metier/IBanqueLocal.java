package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Compte;

@Local
public interface IBanqueLocal {


	public Compte addCompte(Compte c) ;
	public Compte getCompte(Long code);
	public List<Compte> listeCompte();
	public void verser(Long code, double m);
	public void retirer(Long code, double m);
	public void virement(Long code1, Long code2, double m);
}
