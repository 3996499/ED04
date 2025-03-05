package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        Agenda_Interfaz agendaInterfazContactos = getAgenda();

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : agendaInterfazContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaInterfazContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaInterfazContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaInterfazContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agendaInterfazContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static Agenda_Interfaz getAgenda() {
        Agenda_Interfaz agendaInterfazContactos = new Agenda();

        // Añadir contactos a la agenda.
        agendaInterfazContactos.addContact("John Doe", "1234567890");
        agendaInterfazContactos.addContact("Jane Doe", "9876543210");
        agendaInterfazContactos.addContact("Mary Jane", "1122334455");
        return agendaInterfazContactos;
    }
}