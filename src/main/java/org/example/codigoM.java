package org.example;

public class codigoM {

    public int temp; // Campo temporal innecesario


    public void procesar(String tipo, int manzanas, int caramelos, Cliente cliente) {
        int total = 0;

        // Método largo + uso de if (como switch)
        if (tipo.equals("normal")) {
            total = manzanas + caramelos;
        } else if (tipo.equals("doble")) {
            total = (manzanas + caramelos) * 2;
        } else if (tipo.equals("mitad")) {
            total = (manzanas + caramelos) / 2;
        }

        // Código duplicado
        System.out.println("Total de productos: " + total);
        System.out.println("Guardando datos...");
        System.out.println("Guardando datos...");

        // Código muerto
        if (false) {
            System.out.println("nunca se ejecuta");
        }

        // Feature Envy (envidia de características)
        if (cliente.edad > 50) {
            System.out.println("cliente mayor");
        }

        // Inappropriate Intimacy (acceso directo a datos)
        cliente.productos += total;

        // Demasiadas responsabilidades
        System.out.println("Email enviado a " + cliente.email);
        System.out.println("Guardado en base de datos");
    }
}

class Cliente {
    public int edad;
    public String email;
    public int productos;
}