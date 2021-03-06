package ejemplo.publicaciones;

public abstract class Publicacion {
    private String titulo;
    private String autor;
    private double precio;

    protected abstract void SetExtension(Object infExt);
    protected abstract Object getExtension();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String tit){
        titulo = tit;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String au){
        autor = au;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double pre){
        precio = pre;
    }

}

