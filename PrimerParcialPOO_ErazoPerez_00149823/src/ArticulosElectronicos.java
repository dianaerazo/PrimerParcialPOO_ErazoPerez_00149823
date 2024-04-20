public abstract class ArticulosElectronicos {

    private String nombre;
    private String modelo;
    private String descripcion;

    private String marca;

    protected float precio;

    public ArticulosElectronicos(String nombre, String modelo, String descripcion, float precio, String marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void articulosElectronicos(){
        this.nombre = "";
        this.modelo = "";
        this.descripcion = "";
        this.precio = 0;
    }

    public abstract float obtenerPrecio();
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
