package com.dgd.agenda.domain.useCase;

import com.dgd.agenda.domain.models.Contacto;

import java.util.List;

public class GetContactosUseCase {
    private ContactoRepository contactoRepository;

    public GetContactosUseCase(ContactoRepository contactoRepository){
        this.contactoRepository = contactoRepository;
    }

    public List<Contacto> execute(){
        return contactoRepository.getAll();
    }
}
