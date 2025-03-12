package tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {
	static GestorTienda tienda;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tienda = new GestorTienda();
	}

	@Test
	void testCalcularDescuento() {
		assertEquals(1, tienda.calcularDescuento(10, 10));
		assertEquals(0.5, tienda.calcularDescuento(10, 7));
		assertEquals(0, tienda.calcularDescuento(2, 4));
		
	}

	@Test
	void testCategorizarProducto() {
		assertEquals("Económico", tienda.categorizarProducto(5));
		assertEquals("Estándar", tienda.categorizarProducto(30));
		assertEquals("Premium", tienda.categorizarProducto(100));
		
	}

	@Test
	void testBuscarProducto() {
		String [] producto = {"leche", "agua"};
		assertNull(tienda.buscarProducto(producto, null));
		assertEquals("leche", tienda.buscarProducto(producto, "leche"));
	}

}
