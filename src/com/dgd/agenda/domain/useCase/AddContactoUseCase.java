package com.dgd.agenda.domain.useCase;

import com.dgd.agenda.domain.models.Contacto;

public class AddContactoUseCase {
    private ContactoRepository contactoRepository;

    public AddContactoUseCase(ContactoRepository contactoRepository){
        this.contactoRepository = contactoRepository;
    }

    public void execute(Contacto contacto){
        contactoRepository.save(contacto);
    }
}
