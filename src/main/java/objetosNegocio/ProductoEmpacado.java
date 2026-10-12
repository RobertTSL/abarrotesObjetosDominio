
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 * Representa un producto empacado de la abarrotera.
 * Hereda los atributos y métodos de la clase Producto.
 *
 * @author anton
 */
public class ProductoEmpacado extends Producto {

    /**
     * Cantidad de unidades del producto empacado.
     */
    private int cantidad;

    /**
     * Constructor por defecto.
     */
    public ProductoEmpacado() {
    }

    /**
     * Constructor que inicializa los atributos del producto
     * y establece la cantidad de unidades empacadas.
     *
     * @param cantidad Cantidad del producto empacado (mínimo 1)
     * @param producto Objeto Producto del cual se copian los atributos
     * @throws IllegalArgumentException Si el producto o la cantidad
     * son inválidos
     */
    public ProductoEmpacado(int cantidad, Producto producto) {
        super(producto);

        if (producto == null || producto.getClave() == null
                || !producto.getClave().matches("EM[0-9]{3}")
                || producto.getTipo() != 'E') {

            throw new IllegalArgumentException("Producto empacado inválido");
        }

        if (cantidad >= 1) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser almenos de 1 producto");
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
    public ProductoEmpacado(Producto producto) {
        super(producto);

        if (producto == null || producto.getClave() == null
                || !producto.getClave().matches("EM[0-9]{3}")
                || producto.getTipo() != 'E') {

            throw new IllegalArgumentException("Producto empacado inválido");
        }

        this.cantidad = 0;
    }

    /**
     * Obtiene la cantidad del producto empacado.
     *
     * @return Cantidad de unidades del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto empacado.
     * La cantidad debe ser mayor o igual a 1.
     *
     * @param cantidad Nueva cantidad del producto empacado
     * @throws IllegalArgumentException Si la cantidad es menor a 1
     */
    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser al menos 1 producto");
        }
    }

    /**
     * Devuelve una representación en texto del producto empacado.
     * Incluye los atributos heredados de Producto y la cantidad,
     * separados por comas.
     *
     * @return Cadena con los atributos del producto empacado
     */
    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}
