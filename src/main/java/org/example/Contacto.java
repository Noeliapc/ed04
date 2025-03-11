package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 *  Esta clase representa un contacto con un nombre y una lista de números de teléfono
 * @author Noeliapc
 * @version 1.0
 * @see Agenda
 */

class Contacto {
    private String name;    // nombre del contacto
    private List<String> phones;    //Lista de números de teléfono

    /**
     * Constructor de contacto que nos va a dar un nombre y un telefono
      * @param name
     * @param phone
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Metodo que nos va a devolver un nombre
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo que nos va a devolver un número de teléfono
     * @return Numero de telefono
     */
    public List<String> getPhones() {
        return this.phones;
    }
}