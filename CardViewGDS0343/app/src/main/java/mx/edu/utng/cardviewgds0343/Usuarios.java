package mx.edu.utng.cardviewgds0343;

public class Usuarios {
    //Definir las propiedades de las clase para el modelo de datos
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String foto;
    private String email;

    //Generar constructor con todos los parámetros


    public Usuarios(int id, String nombre, String apellidoPaterno, String foto, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.foto = foto;
        this.email = email;
    }

    //Constructor solo con id
    public Usuarios(int id) {
        this.id = id;
    }

    //Definir get y set

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getFoto() {
        return foto;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//El método toString

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", foto='" + foto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
