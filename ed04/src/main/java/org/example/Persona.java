package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto con nombre y una lista de números de teléfono.
 */

class Persona {
    private String name;
    private List<String> phones;

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor que crea un contacto con un nombre y un número de teléfono.
     * @param name Nombre del contacto
     * @param phone Número de teléfono
     */

    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto buscado.
     * @return Nombre del contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Obtiene en lista los números de teléfono del contacto.
     * @return Lista de teléfonos del conctacto
     */

    public List<String> getPhones() {
        return this.phones;
    }
}