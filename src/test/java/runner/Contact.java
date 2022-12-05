package runner;

public class Contact {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono1;
    private String telefono2;
    private String alias;
    private String email;

    public Contact(){}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public Contact setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Contact setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Contact setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Contact setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
        return this;
    }

    public Contact setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
        return this;
    }

    public Contact setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }



}
