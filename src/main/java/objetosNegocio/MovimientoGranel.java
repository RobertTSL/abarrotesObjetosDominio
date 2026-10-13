
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Date;

/**
 * Representa un movimiento de productos a granel en la abarrotera. Hereda los
 * atributos y métodos de la clase Movimiento.
 *
 * @author anton
 */
public class MovimientoGranel extends Movimiento {

    /**
     * Producto a granel asociado con el movimiento.
     */
    private ProductoGranel productoGranel;

    /**
     * Constructor por defecto.
     */
    public MovimientoGranel() {
    }

    /**
     * Constructor que inicializa los atributos del movimiento y establece el
     * producto a granel asociado.
     *
     * @param productoGranel Producto a granel asociado al movimiento
     * @param cveMovimiento Clave del movimiento
     * @param fecha Fecha en la que se realiza el movimiento
     * @param procesado Indica si el movimiento ya fue procesado
     * @throws IllegalArgumentException Si el producto a granel es nulo
     */
    public MovimientoGranel(ProductoGranel productoGranel,
            String cveMovimiento, Date fecha, boolean procesado) {

        super(cveMovimiento, fecha, procesado);

        if (productoGranel == null) {
            throw new IllegalArgumentException("El producto no existe");
        }

        this.productoGranel = productoGranel;
    }

    /**
     * Constructor que recibe solamente la clave del movimiento. Inicializa los
     * atributos heredados mediante el constructor de Movimiento y establece el
     * producto a granel en null.
     *
     * @param cveMovimiento Clave del movimiento
     */
    public MovimientoGranel(String cveMovimiento) {
        super(cveMovimiento);
        this.productoGranel = null;
    }

    /**
     * Obtiene el producto a granel asociado al movimiento.
     *
     * @return Producto a granel asociado al movimiento
     */
    public ProductoGranel getProductoGranel() {
        return productoGranel;
    }

    /**
     * Establece el producto a granel asociado al movimiento. Comprueba que la
     * referencia del producto no sea nula.
     *
     * @param productoGranel Nuevo producto a granel del movimiento
     * @throws IllegalArgumentException Si el producto a granel es nulo
     */
    public void setProductoGranel(ProductoGranel productoGranel) {
        if (productoGranel != null) {
            this.productoGranel = productoGranel;
        } else {
            throw new IllegalArgumentException("El producto no existe");
        }
    }

    /**
     * Devuelve una representación en texto del movimiento a granel. Incluye los
     * atributos heredados de Movimiento y los datos del producto a granel,
     * separados por comas.
     *
     * @return Cadena con los atributos del movimiento a granel
     */
    @Override
    public String toString() {
        return super.toString() + "," + productoGranel;
    }
}
