public class Electrodomestico extends ArticulosElectronicos implements Metodos{

    private String garantia;
    private double peso;

    public Electrodomestico(String nombre, String modelo, String descripcion, float precio, String marca) {
        super(nombre, modelo, descripcion, precio, marca);
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public float obtenerPrecio() {
        return 0;
    }

    @Override
    public float obtenerPrecio(int precioBase) {
        return 0;
    }

    @Override
    public float obtenerDescripcion(String descripcion) {
        return 0;
    }
}
