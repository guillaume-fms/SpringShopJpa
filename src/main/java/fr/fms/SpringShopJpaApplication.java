package fr.fms;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

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
		

		System.out.println();
		System.out.println(" ********************************************************* ");
		System.out.println(" * Bienvenue sur mon application E-Commerce informatique * ");
		System.out.println(" ********************************************************* ");
		System.out.println();

		System.out.println(":) Voici le menu, faites votre choix :");
		System.out.println();
		System.out.println( " 1/ Afficher tous les articles sans pagination \n" +
				" 2/ Afficher tous les articles avec pagination \n" +
				" ********************************* \n" +
				" 3/ Ajouter un article \n" +
				" 4/ Afficher un article \n" +
				" 5/ Supprimer un article \n" +
				" 6/ Modifier un article \n" +
				" ********************************* \n" +
				" 7/ Ajouter une categorie \n" +
				" 8/ Afficher une categorie \n" +
				" 9/ Supprimer une categorie \n" +
				" 10/ Mettre a jour une categorie \n"+
				" 11/ Afficher tous les articles d'une categorie \n"+
				" ********************************* \n" +
				" 12/ Sortir du programme \n");

	

	/* Creation des tables et entités base de données */


	//Category smartphone = categoryRepository.save(new Category("SmartPhone"));
	//Category tablet = categoryRepository.save(new Category("Tablet"));
	//Category pc = categoryRepository.save(new Category("PC"));

	//categoryRepository.save(new Category("Smartphone"));
	//articleRepository.save(new Article("S9", "SamSung", 250));

	// Smartphones
	//articleRepository.save(new Article("S10", "SamSung", 450, smartphone));
	//articleRepository.save(new Article("S9", "SamSung", 250, smartphone));
	//articleRepository.save(new Article("MI10", "Xiaomi", 180, smartphone));
	//articleRepository.save(new Article("G60", "Nokia", 249, smartphone));

	// exo 1.4 Delete by ID
	//articleRepository.deleteById((long) 1);

	// Tablet
	//articleRepository.save(new Article("GalaxyTab", "SamSung", 480, tablet));
	//articleRepository.save(new Article("Ipad", "Apple", 680, tablet));
	//articleRepository.save(new Article("T21", "Nokia", 380, tablet));

	// PC
	//articleRepository.save(new Article("R510", "Asus", 600, pc));
	//articleRepository.save(new Article("XPS", "Dell", 1380, pc));
	//articleRepository.save(new Article("Notebooks 470", "Hp", 1240, pc));

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

	//	    for(Article article : articleRepository.searchArticles("sung", 200)) {
	//	    	System.out.println();
	//			System.out.println("***************** ARTICLES searchArticles ***************** ");
	//			System.out.println(article);
	//			System.out.println("***************** ARTICLES searchArticles ***************** ");
	//			System.out.println();
	//	    }

	//		for (Article article : articleRepository.findByCategoryId((long) 3)) {
	//			System.out.println("");
	//			System.out.println("***************** ARTICLES findByCategoryId ***************** ");
	//			System.out.println(article);
	//			System.out.println("***************** ARTICLES findByCategoryId ***************** ");
	//			System.out.println("");
	//		}

	// exo 1.2
	//		for (Article article : articleRepository.findByDescription("G60")) {
	//			System.out.println();
	//			System.out.println("/////////////////////// Exo 1.2 //////////////////////////////////");
	//			System.out.println(article);
	//			System.out.println("/////////////////////// Exo 1.2 //////////////////////////////////");
	//			System.out.println();
	//		}

	// exo 1.3
	//		for (Article article : articleRepository.findByBrandAndDescription("Dell", "Xps")) {
	//			System.out.println();
	//			System.out.println("/////////////////////// Exo 1.3 //////////////////////////////////");
	//			System.out.println(article);
	//			System.out.println("/////////////////////// Exo 1.3 //////////////////////////////////");
	//			System.out.println();
	//		}

	// exo 1.4 Delete article by ID
	//articleRepository.deleteById((long) 1);

	// exo 1.5 Update article by Id
	//articleRepository.saveById((long)8);
	//Article article = articleRepository.findById((long) 4).get();
	//article.setPrice(1155);
	//articleRepository.save(article);


	// exo 1.6 ordre croissant
	System.out.println("Affichage ordre croissant");
	for (Category category : categoryRepository.findAllByOrderByNameAsc()) {
		System.out.println(category);
		System.out.println();

}

	// exo 1.6 ordre décroissant
	System.out.println("Affichage ordre décroissant");
	for (Category category : categoryRepository.findAllByOrderByNameDesc()) {
		System.out.println(category);
		System.out.println();
	}
}
}

