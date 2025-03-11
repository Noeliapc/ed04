package org.example;

public class Main {
    public static void main(String[] args) {

        // Crear una nueva agendaContactos.
        IAgenda IAgendaContactos = new Agenda();

        // Añadir contactos a la agendaContactos.
        initAgenda(IAgendaContactos);

        // Imprimir todos los contactos de la agendaContactos.
        System.out.println("Todos los contactos: ");
        for (Persona c : IAgendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        IAgendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agendaContactos.
        IAgendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agendaContactos.
        IAgendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : IAgendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    /**
     *
     * @param IAgendaContactos Se trata de un metodo para añadir contactos a la agenda, por lo que esta es la agenda.
     */
    private static void initAgenda(IAgenda IAgendaContactos) {
        IAgendaContactos.addContact("John Doe", "1234567890");
        IAgendaContactos.addContact("Jane Doe", "9876543210");
        IAgendaContactos.addContact("Mary Jane", "1122334455");
    }
}