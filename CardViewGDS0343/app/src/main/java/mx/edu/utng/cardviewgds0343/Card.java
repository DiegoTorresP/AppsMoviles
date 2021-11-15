package mx.edu.utng.cardviewgds0343;

public class Card {
    //Clase POJO

    private long id;
    private String name;
    private int color_resource;

    //Métodos set y get

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor_resource() {
        return color_resource;
    }

    public void setColor_resource(int color_resource) {
        this.color_resource = color_resource;
    }
}
