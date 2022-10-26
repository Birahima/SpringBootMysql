package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsql.Produit;

import repository.ProduitRepository;
@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
    ProduitRepository produitRepository;
	@Override
	public List<Produit> findAllProduits() {
		List<Produit> listProd = produitRepository.findAll();
		return listProd;
	}

	@Override
	public void saveProduit(Produit p) {
		produitRepository.save(p);

	}

	@Override
	public Produit findProduitById(long id) {
		Produit p = produitRepository.findById(id).get();
		return p;
	}

	@Override
	public void deleteProduitById(long id) {
		produitRepository.deleteById(id);

	}

}
