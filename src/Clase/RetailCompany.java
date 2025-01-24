package Clase;

public class RetailCompany extends Company{
    Article[] articles;

    public RetailCompany(Article[] articles, String name, String id) {
        super(name, id); 
        this.articles = articles; 
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }
    
    public void printArticle() {
        for (int i = 0; i < articles.length; i++) {
            System.out.println((i+1) + ")");
            System.out.println("Naziv artikla: " + articles[i].name);
            System.out.println("Kategorija artikla: "+ articles[i].category);
        }
    }
}


