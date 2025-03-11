package org.example;

import java.util.*;

/**
 * Esta clase presenta una agenda en la que se almacena una lista de contactos y puedes añadir, eliminar, modificar
 * numeros de telefono de los contactos
 * @author Noeliapc
 * @version 1.0
 * @see Persona
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor que inicializa una agenda vacia.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este metodo se usa para añadir un contacto con un numero de telefono o para añadir un telefono a un contacto existente.
     * @param name
     * @param phone
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Este metodo se usa para eliminar un contacto
     * @param name Nombre del contacto
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *  Este metodo se usa para modificar el numero de telefono
     * @param name Numero de contacto
     * @param oldPhone Telefono actual del contacto
     * @param newPhone Telefono nuevo del contacto
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Este metodo se usar para obtener un contacto
     * @return Devuelve el contacto.
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}