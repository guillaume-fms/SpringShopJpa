package fr.fms.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Collection<Article>articles;  // une catégorie est liée à plusieurs articles
	
	

	// Constructeur
	public Category(String name) {
		this.name = name;
	}

	public Category(Long id, String name, Collection<Article> articles) {
		this.id = id;
		this.name = name;
		this.articles = articles;
	}

	public Category() {
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	// Methode ToString
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	

}
