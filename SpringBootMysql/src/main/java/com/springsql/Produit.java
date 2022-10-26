package com.springsql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column
	private String CodeB;
	@Column
	private String libele;
	@Column
	private float prix;
	@Column
	private int quantite;
	
	public Produit() {
		super();
	}
	
	public Produit(Long id, String codeB, String libele, float prix, int quantite) {
		super();
		Id = id;
		CodeB = codeB;
		this.libele = libele;
		this.prix = prix;
		this.quantite = quantite;
	}

	
	public Produit(String codeB, String libele, float prix, int quantite) {
		super();
		CodeB = codeB;
		this.libele = libele;
		this.prix = prix;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [Id=" + Id + ", CodeB=" + CodeB + ", libele=" + libele + ", prix=" + prix + ", quantite="
				+ quantite + "]";
	}

	
	
	

}
