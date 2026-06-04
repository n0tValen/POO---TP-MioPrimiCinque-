package tpEntregaFinal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SistemaMP5Test {

    @Test
    void crearUsuario() {

        SistemaMP5 sistema = new SistemaMP5();

        Boolean creado = sistema.crearUsuario("Anna Rojas", "AnniiR");
        Boolean duplicado = sistema.crearUsuario("Anna Rojas", "AnniiR");

        assertTrue(creado);
        assertFalse(duplicado);
    }
}