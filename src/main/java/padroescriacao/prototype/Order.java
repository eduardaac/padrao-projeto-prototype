package padroescriacao.prototype;

public class Order implements Cloneable {
    private int orderId;
    private String customerName;
    private Item item;
    private String status;

    public Order(int orderId, String customerName, Item item, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.item = item;
        this.status = status;
    }

    // Getters e Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método Clone para Cópia Profunda
    @Override
    public Order clone() throws CloneNotSupportedException {
        Order orderClone = (Order) super.clone();
        // Cópia profunda: clona o objeto composto 'item'
        orderClone.item = (Item) orderClone.item.clone();
        return orderClone;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", item=" + item +
                ", status='" + status + '\'' +
                '}';
    }
}