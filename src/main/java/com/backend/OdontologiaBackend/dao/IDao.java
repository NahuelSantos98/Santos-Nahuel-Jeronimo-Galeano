package com.backend.OdontologiaBackend.dao;

import java.util.List;

public interface IDao <T>{
    T registrar(T t);
    List<T> listarTodos();
    T buscarPorId(int id);
}
