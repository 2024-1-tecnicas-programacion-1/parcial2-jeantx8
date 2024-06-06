package parcial2;


public class Vehiculo {
    String marca;
    String modelo;
    int año;
    /**
      
     *  complejidad constante O(1).
     * @param marca
     * @param modelo
     * @param año 
     */
    public Vehiculo(String marca, String modelo,int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    /**
     * complejidad constante O(1).
     * @return 
     */
    public String imprimirInformacion(){
        String info = marca + " " + modelo + " " + año;
    return info;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}