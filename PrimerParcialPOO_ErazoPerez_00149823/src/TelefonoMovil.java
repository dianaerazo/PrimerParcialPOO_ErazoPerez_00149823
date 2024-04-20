public class TelefonoMovil extends ArticulosElectronicos implements Metodos{

    private String marca;
    private String procesador;

    private float precioBase;


    public TelefonoMovil(String nombre, String modelo, String descripcion, float precio, String marca) {
        super(nombre, modelo, descripcion, precio, marca);
    }

    @Override
    public float obtenerPrecio() {
        return 0;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
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
