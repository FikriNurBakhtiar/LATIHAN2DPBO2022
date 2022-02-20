package W2.Latihan1.Java;

class Product {
    private int Price;
    private String IdProduct;

    public Product(int Price, String IdProduct) {
        this.setPrice(Price);
        this.setIdProduct(IdProduct);
    }

    public Product() {
    }

    // GetSet IdProduct
    public String getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(String IdProduct) {
        this.IdProduct = IdProduct;
    }

    // GetSet Price
    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void printProduct() {
        System.out.println("Price      : " + this.Price);
        System.out.println("Id Product : " + this.IdProduct);
    }

}
