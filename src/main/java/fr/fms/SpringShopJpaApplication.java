package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;



@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category smartphone = categoryRepository.save(new Category("SmartPhone"));
		Category tablet = categoryRepository.save(new Category("Tablet"));
		Category pc = categoryRepository.save(new Category("PC"));
		
		//categoryRepository.save(new Category("Smartphone"));
		//articleRepository.save(new Article("S9", "SamSung", 250));
		
		// Smartphones
		articleRepository.save(new Article("S10", "SamSung", 450, smartphone));
	    articleRepository.save(new Article("S9", "SamSung", 250, smartphone));
	    articleRepository.save(new Article("MI10", "Xiaomi", 180, smartphone));
	    articleRepository.save(new Article("G60", "Nokia", 249, smartphone));
	    
	    // Tablet
	    articleRepository.save(new Article("GalaxyTab", "SamSung", 480, tablet));
	    articleRepository.save(new Article("Ipad", "Apple", 680, tablet));		
	    articleRepository.save(new Article("T21", "Nokia", 380, tablet));
	    
	    // PC
	    articleRepository.save(new Article("R510", "Asus", 600, pc));		
	    articleRepository.save(new Article("XPS", "Dell", 1380, pc));
		
		
//		for(Article article : articleRepository.findByBrandAndPrice("SamSung",290)) {
//			System.out.println();
//			System.out.println("***************** ARTICLES Brand and Price ***************** ");
//			System.out.println(article);
//			System.out.println("***************** ARTICLES Brand and Price ***************** ");
//			System.out.println();
//		}
//		
//		for(Article article : articleRepository.findByBrandAndPriceGreaterThan("SamSung",350)) {
//			System.out.println();
//			System.out.println("***************** ARTICLES Brand And Price GreaterThan ***************** ");
//			System.out.println(article);
//			System.out.println("***************** ARTICLES Brand And Price GreaterThan ***************** ");
//			System.out.println();
//		}
	    
	    for(Article article : articleRepository.searchArticles("sung", 200)) {
	    	System.out.println();
			System.out.println("***************** ARTICLES searchArticles ***************** ");
			System.out.println(article);
			System.out.println("***************** ARTICLES searchArticles ***************** ");
			System.out.println();
	    }
		
		for(Article article : articleRepository.findByCategoryId((long) 2)) {
			System.out.println();
			System.out.println("***************** ARTICLES findByCategoryId ***************** ");
			System.out.println(article);
			System.out.println("***************** ARTICLES findByCategoryId ***************** ");
			System.out.println();
		}
	}

}
