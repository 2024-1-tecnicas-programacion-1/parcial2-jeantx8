package parcial2;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    public Automovil(String marca, String modelo,int año, int numeroPuertas, TipoCombustible tipoCombustible){
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    /**
    * complejidad constante 0(1).
     * @return    
     */
      
    @Override
    public String imprimirInformacion(){
        String info = marca + " " + modelo + " " + año + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    return info;
    }
    
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
}