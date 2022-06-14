package com.example.TPN4;

import java.util.List;
public interface ICatalogue {
public List<Produit> getProduitsParMotCle(String mc);
public void addProduit(Produit p);
}