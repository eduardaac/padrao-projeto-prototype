package padroescriacao.prototype;

public class Item implements Cloneable {
    private String productCode;
    private Double price;

    public Item(String productCode, Double price) {
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Cópia superficial (shallow copy) é suficiente.
        return super.clone();
    }

    @Override
    public String toString() {
        return "Item{" +
                "productCode='" + productCode + '\'' +
                ", price=" + price +
                '}';
    }
}