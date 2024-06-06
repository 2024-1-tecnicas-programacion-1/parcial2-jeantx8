import parcial2.Vehiculo;
import parcial2.Automovil;
import parcial2.TipoCombustible;
import parcial2.Motocicleta;
import parcial2.TipoMotocicleta;
/**
 
 *  complejidad constante O(1) .
 
 */
public class Principal_1 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("CHEVROLET", "CAMARO ", 2024);
        Automovil automovil = new Automovil("LUCID MOTORS", "LUCID AIR ", 2021 , 4,TipoCombustible.ELECTRICO );
        Motocicleta motocicleta = new Motocicleta("KAWASAKI NINJA ", "400 ", 2023, TipoMotocicleta.DEPORTIVA);
        System.out.println(vehiculo.imprimirInformacion());
        System.out.println(automovil.imprimirInformacion());
        System.out.println(motocicleta.imprimirInformacion());
    }
}

    
    