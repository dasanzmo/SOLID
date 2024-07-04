/*
 * 
 * Refactoriza el código para que cumpla con el Principio de Abierto/Cerrado. 
 * Debes permitir la extensión de nuevos métodos de pago sin modificar la clase PaymentProcessor.
 * 
 */

public interface PaymentMethod {
    void processPayment();
}

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        // Lógica para procesar el pago con tarjeta de crédito
    }
}

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        // Lógica para procesar el pago con PayPal
    }
}

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}