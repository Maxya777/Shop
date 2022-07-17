import java.util.ArrayList;
import java.util.List;

class Basket {
    List<Product> products;

    private static Basket instance;

    private Basket() {
    }

    public static Basket getInstance() {
        if (instance == null) {
            instance = new Basket();
            instance.products = new ArrayList<>();
        }
        return instance;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
