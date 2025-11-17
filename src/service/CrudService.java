package service;

import java.util.List;

public interface CrudService<T> {
    void cadastrar();
    List<T> listAll();

}
