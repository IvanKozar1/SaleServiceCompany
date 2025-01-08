package Clase;

public class RetailCompany extends Company{
    Article[] articles;


    public RetailCompany(String name, String id, int maxClients, int maxEmployees, int numArticles) {
        super(name, id, maxClients, maxEmployees); // Pozivamo konstruktor nadklase (Company)
        this.articles = new Article[numArticles]; // Inicijaliziramo articles niz
    }

    public void addArticle (Article article, int numOfArticles) {
        articles[numOfArticles] = article;
    }
    public void printArticle() {
        for (int i = 0; i < articles.length; i++) {
            System.out.println((i+1) + ")");
            System.out.println("Naziv artikla: " + articles[i].name);
            System.out.println("Kategorija artikla: "+ articles[i].category);
        }
    }
}


