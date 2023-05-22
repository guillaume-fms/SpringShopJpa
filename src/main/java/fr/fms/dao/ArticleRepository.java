package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {
	

	// requête qui renvoie l’ensemble des articles
	public List<Article> findByBrand(String brand);
	
	public List<Article> findByBrandContains(String brand);
	public List<Article> findByBrandAndPrice(String brand, double price);
	public List<Article> findByBrandAndPriceGreaterThan(String brand, double price);
	public List<Article> findByCategoryId(Long categoryId);
	
	//@Query("select A from Article A where A.brand like %:x% and A.price > :y")	
	//public List<Article> searchArticles(@Param("x") String kw, @Param("y")double price);
	
	
	// exo 1.2
		//public List<Article> findByDescription(String description);
	// exo 1.2
	
	
	// exo 1.3
	//public List<Article> findByBrandAndDescription(String brand, String description);
	// exo 1.3
	
	// exo 1.4 Delete by ID
	//public List<Article> deleteArticleById(Long Id);
	
	
	// exo 1.5 Update by ID
	//public List<Article> saveById(Long id);	
	
	
	

	
}


	

