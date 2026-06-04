package tpEntregaFinal;

public class Main {

    public static void main(String[] args) {

        SistemaMP5 sistema = new SistemaMP5();

        Boolean creado = sistema.crearUsuario("Valentino", "valen123");

        System.out.println("Usuario creado: " + creado);
    }
}