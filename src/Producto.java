public class Producto implements Comparador{
    private int identificador;
    private String nombre;
    private double precio;

    public Producto(int identificador, String nombre, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean igualQue(Object q) {
        return this.precio == ((Producto) q).precio;
    }

    @Override
    public boolean menorQue(Object q) {
        return this.precio < ((Producto) q).precio;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        return this.precio <= ((Producto) q).precio;
    }

    @Override
    public boolean mayorQue(Object q) {
        return this.precio > ((Producto) q).precio;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        return this.precio >= ((Producto) q).precio;
    }
}
