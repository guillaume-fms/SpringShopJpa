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
	public List<Article> findByCategoryId(Long Id);
	
	@Query("select A from Article A where A.brand like %:x% and A.price > :y")	
	public List<Article> searchArticles(@Param("x") String kw, @Param("y")double price);
}


	

