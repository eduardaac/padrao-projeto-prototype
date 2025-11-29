package padroescriacao.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testCloneDeepCopy() throws CloneNotSupportedException {
        // 1. Cria o objeto original
        Order originalOrder = new Order(
                5001,
                "Customer A",
                new Item("PROD123", 99.99),
                "Processing"
        );

        // 2. Clona e modifica o clone
        Order clonedOrder = originalOrder.clone();
        clonedOrder.setOrderId(5002); // Modifica atributo primitivo/imutável
        clonedOrder.setCustomerName("Customer B");
        clonedOrder.getItem().setPrice(49.99); // Modifica atributo do objeto composto (Item)
        clonedOrder.setStatus("Shipped");

        // 3. Verifica o Original (deve permanecer inalterado)
        // O preço DEVE permanecer 99.99 no original
        assertEquals("Order{orderId=5001, customerName='Customer A', item=Item{productCode='PROD123', price=99.99}, status='Processing'}", originalOrder.toString());

        // 4. Verifica o Clone (deve refletir as mudanças)
        // O preço DEVE ser 49.99 no clone
        assertEquals("Order{orderId=5002, customerName='Customer B', item=Item{productCode='PROD123', price=49.99}, status='Shipped'}", clonedOrder.toString());

        // Verifica se os objetos Item são diferentes instâncias (Deep Copy)
        assertNotSame(originalOrder.getItem(), clonedOrder.getItem());
    }
}