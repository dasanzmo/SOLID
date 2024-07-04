/*
 * 
 * Refactoriza la clase Order para que cumpla con el Principio de Responsabilidad Única.
 * Debes separar las responsabilidades de cálculo, impresión y almacenamiento en clases diferentes.
 * 
 */



// Order.java
public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        // Lógica para calcular el total de la orden
        return 100.0; // simplificado
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

// OrderPrinter.java
public class OrderPrinter {
    public void printOrder(Order order) {
        // Lógica para imprimir la orden
    }
}

// OrderDatabase.java
public class OrderDatabase {
    public void saveToDatabase(Order order) {
        // Lógica para guardar la orden en la base de datos
    }
}