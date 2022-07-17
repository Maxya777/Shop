class Product {
    String name;
    Money price;
    Shop shop;

    public Product(String name, Money price, Shop shop) {
        this.name = name;
        this.price = price;
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Название продукта: " + name + ", "
                + "Цена: " + price +
                " магазин: " + shop + "\n";
    }
}
