package DAO;

import java.util.List;

public interface IDAO<T> {
    T getById(int id);
    List<T> getAll();
}
