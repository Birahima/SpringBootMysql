package service;
import java.util.List;

import com.springsql.Produit;
import com.springsql.SpringBootMysqlApplication;


public interface ProduitService {
	
	//Recuperer la liste de tous les produit
	public List<Produit> findAllProduits();
	
	//Enreggistrer un produit
	public void saveProduit(Produit p);
	
	//Rechercher un produit
	public Produit findProduitById(long id);
	
	//Supprimer un produit
	public void deleteProduitById(long id);

}
