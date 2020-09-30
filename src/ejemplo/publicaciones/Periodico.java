package ejemplo.publicaciones;

import java.util.Date;

public class Periodico extends Publicacion {

    private String edicion;
    private String fecha;
    private String noticiaPrincipal;
    private int numpag;

    public void setEdicion(String edi){
        edicion = edi;
    }

    public String getEdicion(){
        return edicion;
    }

    public void setFecha(String fec){
        fecha = fec;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNoticiaPrincipal(String noticia) {
        noticiaPrincipal = noticia;
    }

    public String getNoticiaPrincipal() {
        return noticiaPrincipal;
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
