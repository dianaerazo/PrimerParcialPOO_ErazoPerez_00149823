public class Laptop extends ArticulosElectronicos implements Metodos {

    private int almacenamiento;
    private int nucleos;

    private float precioBase;


    public Laptop(String nombre, String modelo, String descripcion, float precio, String marca) {
        super(nombre, modelo, descripcion, precio, marca);
    }

    @Override
    public float obtenerPrecio() {
        return 0;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
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
