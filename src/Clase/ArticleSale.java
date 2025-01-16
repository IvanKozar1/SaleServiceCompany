package Clase;
import java.math.BigDecimal;
import java.util.Date;

public class ArticleSale extends Service implements Merchandise {
    private BigDecimal articlePrice;

    public ArticleSale(Client client, String type, String description, Date date, BigDecimal price, BigDecimal articlePrice) {
        super(client, type, description, date, price, false, false);  // postavljamo completed i charged na false
        this.articlePrice = articlePrice;
    }

    public BigDecimal sale(int numberOfArticles) {
        BigDecimal totalPrice = articlePrice.multiply(BigDecimal.valueOf(numberOfArticles));  // izračunavamo ukupnu cijenu
        this.completed = true;  // postavljamo completed na true
        this.charged = true;    // postavljamo charged na true
        return totalPrice;
    }
    public Client getClient() {
        return client;
    }
}
