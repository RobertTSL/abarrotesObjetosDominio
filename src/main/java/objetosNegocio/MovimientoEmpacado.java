 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.time.LocalDate;
import java.util.Date;

/**
 * Representa un movimiento de productos empacados en la abarrotera.
 * Hereda los atributos y métodos de la clase Movimiento.
 *
 * @author anton
 */
public class MovimientoEmpacado extends Movimiento {

    /**
     * Producto empacado asociado con el movimiento.
     */
    private ProductoEmpacado productoEmpacado;

    /**
     * Constructor por defecto.
     */
    public MovimientoEmpacado() {
        super();
    }

    /**
     * Constructor que inicializa los atributos del movimiento
     * y establece el producto empacado asociado.
     *
     * @param productoEmpacado Producto empacado asociado al movimiento
     * @param cveMovimiento Clave del movimiento
     * @param fecha Fecha en la que se realiza el movimiento
     * @param procesado Indica si el movimiento ya fue procesado
     * @throws IllegalArgumentException Si el producto empacado es nulo
     */
    public MovimientoEmpacado(String cveMovimiento, LocalDate fecha, boolean procesado, ProductoEmpacado productoEmpacado) {
        super(cveMovimiento, fecha, procesado);

        if (productoEmpacado == null) {
            throw new IllegalArgumentException("El producto no existe");
        }
        this.productoEmpacado = productoEmpacado;
    }

    /**
     * Constructor que recibe solamente la clave del movimiento.
     * Inicializa los atributos heredados mediante el constructor
     * de Movimiento y establece el producto empacado en null.
     *
     * @param cveMovimiento Clave del movimiento
     */
    public MovimientoEmpacado(String cveMovimiento) {
        super(cveMovimiento);
        this.productoEmpacado = null;
    }

    /**
     * Obtiene el producto empacado asociado al movimiento.
     *
     * @return Producto empacado asociado al movimiento
     */
    public ProductoEmpacado getProductoEmpacado() {
        return productoEmpacado;
    }

    /**
     * Establece el producto empacado asociado al movimiento.
     * Comprueba que la referencia del producto no sea nula.
     *
     * @param productoEmpacado Nuevo producto empacado del movimiento
     * @throws IllegalArgumentException Si el producto empacado es nulo
     */
    public void setProductoEmpacado(ProductoEmpacado productoEmpacado) {
        if (productoEmpacado != null) {
            this.productoEmpacado = productoEmpacado;
        } else {
            throw new IllegalArgumentException("El producto no existe");
        }
    }

    /**
     * Devuelve una representación en texto del movimiento empacado.
     * Incluye los atributos heredados de Movimiento y los datos
     * del producto empacado, separados por comas.
     *
     * @return Cadena con los atributos del movimiento empacado
     */
    @Override
    public String toString() {
        return super.toString() + "," + productoEmpacado;
    }
}
