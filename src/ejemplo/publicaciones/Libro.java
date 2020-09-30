package ejemplo.publicaciones;

public class Libro extends Publicacion
{
    private String ISBN;
    private String edicion;
    private int numpag;

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String isbn){
        ISBN = isbn;
    }

    public String getEdicion(){
        return edicion;
    }

    public void setEdicion(String ed){
        edicion = ed;
    }

    @Override
    protected void SetExtension(Object infExt) {
        numpag = (int)infExt;
    }

    @Override
    protected Object getExtension() {
        return numpag;
    }

}
