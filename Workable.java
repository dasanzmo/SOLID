/*
 * 
 * Refactoriza el código para que cumpla con el Principio de Segregación de Interfaces. 
 * Crea interfaces más específicas para evitar que las clases implementen métodos que no necesitan.
 * 
 */

public interface Workable {
    void work();
}

public interface Worker {
    void eat();
}

public class HumanWorker implements Workable, Worker {
    @Override
    public void work() {
        // Lógica para trabajar
    }

    @Override
    public void eat() {
        // Lógica para comer
    }
}

public class RobotWorker implements Workable {
    @Override
    public void work() {
        // Lógica para trabajar
    }
}