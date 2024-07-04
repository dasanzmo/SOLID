/*
 * Refactoriza el código para que cumpla con el Principio de Inversión de Dependencias. 
 * Introduce una abstracción para la funcionalidad de almacenamiento de datos.
*/
public interface DataStorage {
    void save(String data);
}

public class Database implements DataStorage {
    @Override
    public void save(String data) {
        // Lógica para guardar datos en la base de datos
    }
}

public class DataService {
    private DataStorage dataStorage;

    public DataService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        dataStorage.save(data);
    }
}