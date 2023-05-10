package com.dgd.agenda.data.local;

import com.dgd.agenda.domain.models.Contacto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ContactoMemLocalDataSource {

    private static ContactoMemLocalDataSource instance = null;

    private Map<Integer, Contacto> storage = new TreeMap<>();

    private ContactoMemLocalDataSource(){

    }

    public void save(Contacto contacto) {
        storage.put(contacto.getId(), contacto);
    }

    public Contacto findById(Integer contactoId) {
        return storage.get(contactoId);
    }

    public List<Contacto> findAll() {
        return new ArrayList<>(storage.values());
    }

    public static ContactoMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new ContactoMemLocalDataSource();
        }
        return instance;
    }
}
