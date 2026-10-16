 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 * Representa un producto vendido a granel en la abarrotera.
 * Hereda los atributos y métodos de la clase Producto.
 *
 * @author anton
 */
public class ProductoGranel extends Producto {

    /**
     * Cantidad del producto a granel.
     * Se representa con un número decimal.
     */
    private float cantidad;

    /**
     * Constructor por defecto.
     */
    public ProductoGranel() {
    }

    /**
     * Constructor que inicializa los atributos del producto
     * y establece la cantidad del producto a granel.
     *
     * @param cantidad Cantidad del producto a granel (mínimo 0.01)
     * @param producto Objeto Producto del cual se copian los atributos
     * @throws IllegalArgumentException Si el producto o la cantidad
     * son inválidos
     */
    public ProductoGranel(Producto producto, float cantidad) {
        super(producto);

        if (producto == null || producto.getClave() == null
                || !producto.getClave().matches("GR[0-9]{3}")
                || producto.getTipo() != 'G') {

            throw new IllegalArgumentException("Producto granel inválido");
        }

        if (Float.isFinite(cantidad) && cantidad >= 0.01f) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad mínima es 0.01");
        }
    }

    /**
     * Constructor que recibe solamente un producto.
     * Copia los atributos del producto y establece
     * la cantidad inicial en cero.
     *
     * @param producto Objeto Producto del cual se copian los atributos
     * @throws IllegalArgumentException Si el producto no es válido
     */
    public ProductoGranel(Producto producto) {
        super(producto);

        if (producto == null || producto.getClave() == null
                || !producto.getClave().matches("GR[0-9]{3}")
                || producto.getTipo() != 'G') {

            throw new IllegalArgumentException("Producto granel inválido");
        }

        this.cantidad = 0;
    }

    /**
     * Obtiene la cantidad del producto a granel.
     *
     * @return Cantidad del producto a granel
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto a granel.
     * La cantidad debe ser mayor o igual a 0.01.
     *
     * @param cantidad Nueva cantidad del producto a granel
     * @throws IllegalArgumentException Si la cantidad es menor
     * a 0.01 o no es un número finito
     */
    public void setCantidad(float cantidad) {
        if (Float.isFinite(cantidad) && cantidad >= 0.01f) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad mínima es 0.01");
        }
    }

    /**
     * Devuelve una representación en texto del producto a granel.
     * Incluye los atributos heredados de Producto y la cantidad,
     * separados por comas.
     *
     * @return Cadena con los atributos del producto a granel
     */
    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}
