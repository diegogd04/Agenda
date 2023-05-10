package com.dgd.agenda.presentation;

import com.dgd.agenda.data.ContactoDataRepository;
import com.dgd.agenda.domain.models.Contacto;
import com.dgd.agenda.domain.useCase.AddContactoUseCase;
import com.dgd.agenda.domain.useCase.ContactoRepository;
import com.dgd.agenda.domain.useCase.GetContactosUseCase;

import java.util.List;

public class TerminalView {
    public void init(){
        Contacto contacto = new Contacto();
        contacto.setId(1);
        contacto.setNombre("Diego");
        contacto.setApellidos("GOnzález Díaz");
        contacto.setEmail("diego@gmail.com");
        contacto.setTelefono("832745691");

        ContactoRepository contactoRepository = new ContactoDataRepository();

        AddContactoUseCase addContactoUseCase = new AddContactoUseCase(contactoRepository);
        addContactoUseCase.execute(contacto);

        GetContactosUseCase getContactosUseCase = new GetContactosUseCase(contactoRepository);
        List<Contacto> contactoList = getContactosUseCase.execute();
        System.out.println(contactoList.size());
    }
}
