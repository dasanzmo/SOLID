/*
 * Refactoriza la clase Employee para que cumpla con el Principio de Responsabilidad Única. 
 * Debes separar las responsabilidades de cálculo, generación de reportes y almacenamiento en clases diferentes.
 */


public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}

public class PayrollService {
    public void calculatePay(Employee employee) {
        // Lógica para calcular el salario
    }
}

public class EmployeeReport {
    public void generateReport(Employee employee) {
        // Lógica para generar un reporte del empleado
    }
}

public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        // Lógica para guardar el empleado en la base de datos
    }
}