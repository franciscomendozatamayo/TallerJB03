package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;

import java.util.Map;

public class MyStepdefsObject {
    @And("creo un contacto completo con:")
    public void creoUnContactoCompletoCon(Contact contact) {

        System.out.println("contacto: nombre: "+contact.getNombre());
        System.out.println("contacto: apellido: "+contact.getApellido());
        System.out.println("contacto: alias: "+contact.getAlias());
        System.out.println("contacto: email: "+contact.getEmail());
        System.out.println("contacto: direccion: "+contact.getDireccion());
        System.out.println("contacto: telefono1: "+contact.getTelefono1());
        System.out.println("contacto: telefono2: "+contact.getTelefono2());

    }

    @DataTableType
    public Contact convertToContact(Map<String,String> entity){
        Contact contact= new Contact();
        contact.setAlias(entity.get("alias"))
                .setApellido(entity.get("apellido"))
                .setNombre(entity.get("nombre"))
                .setDireccion(entity.get("direccion"))
                .setEmail(entity.get("email"))
                .setTelefono1(entity.get("telefono1"))
                .setTelefono2(entity.get("telefono2"));
        return contact;
    }
}
