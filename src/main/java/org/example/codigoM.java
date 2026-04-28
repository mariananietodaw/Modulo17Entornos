package org.example;

public class codigoM {

    public int temp; // Campo temporal innecesario


    public void procesar(String tipo, int m, int ca, Cli cl) {
        int total = 0;

        // Metodo largo + uso de if (como switch)
        if (tipo.equals("normal")) {
            total = m + ca;
        } else if (tipo.equals("doble")) {
            total = (m + ca) * 2;
        } else if (tipo.equals("mitad")) {
            total = (m + ca) / 2;
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
        if (cl.x > 50) {
            System.out.println("cliente mayor");
        }

        // Inappropriate Intimacy (acceso directo a datos)
        cli.productos += total;

        // Demasiadas responsabilidades
        System.out.println("Email enviado a " + cli.email);
        System.out.println("Guardado en base de datos");
    }
}

class Cli {
    public int x;
    public String email;
    public int productos;
}