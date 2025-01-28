package Clase;

import java.util.List;

public class RetailCompany extends Company{
    //Article[] articles;
    List<Article> articles;

    public RetailCompany(List<Article> articles, String name, String id) {
        super(name, id); 
        this.articles = articles; 
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    
    public void printArticle() {
        for (int i = 0; i < articles.size(); i++) {
            System.out.println((i+1) + ")");
            System.out.println("Naziv artikla: " + articles.get(i).name);
            System.out.println("Kategorija artikla: "+ articles.get(i).category);
        }
    }
}


