package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;
import fr.fms.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

	//  exo 1.6 Noms des catégories classées par ordre croissant
	public List<Category> findAllByOrderByNameAsc();
	
	// exo 1.6 Noms des catégories classées par ordre décroissant
	public List<Category> findAllByOrderByNameDesc();	
	
	// Afficher toutes les catégories par nom
	public Category findByName(String name);
}
