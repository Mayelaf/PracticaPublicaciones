package ejemplo.publicaciones;

public class Revista extends Publicacion
{
    private String ISSN;
    private String periodicidad;
    private int numero;
    private int numpag;

    public String getISSN(){
        return ISSN;
    }

    public void setISSN(String issn){
        ISSN = issn;
    }
    public String getPeriodicidad(){
        return periodicidad;
    }

    public void setPeriodicidad(String per){
        periodicidad = per;
    }
    public int getNumero(){
        return numero;
    }

    public void setNumero(int num){
        numero = num;
    }

    @Override
    protected void SetExtension(Object infExt) {
        numpag =((Integer)infExt).intValue();

    }

    @Override
    protected Object getExtension() {
        return numpag;
    }

}
