public class Main {

    public static void main(String[] args) {
        System.out.println(Basket.getInstance().getProducts());
        System.out.println("Кладем продукт: ");
        Basket.getInstance().getProducts().add(new Product("Кола", new Money("55", "RUB"), Shop.GLOBUS));
        System.out.println("Кладем еще один: ");
        Basket.getInstance().getProducts().add(new Product("Читос", new Money("100", "RUB"), Shop.METRO));
        System.out.println("Все товары в корзине:");
        System.out.println(Basket.getInstance().getProducts());
    }
}
