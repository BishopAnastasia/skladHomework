public class Sklad {
    private String product;
    private int productNumber;

    Sklad(int productNumber, String product) {
        this.product = product;
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return productNumber + " " + product;
    }




}
