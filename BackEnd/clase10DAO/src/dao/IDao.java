package dao;


import java.util.ArrayList;

public interface IDao<T> {
    public T guardar(T t);
}
