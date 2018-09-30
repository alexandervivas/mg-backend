package com.massglobal.core;

import java.util.List;

public interface Repository<T, ID> {

    public List<T> findAll();
    public T findById(ID id);

}
