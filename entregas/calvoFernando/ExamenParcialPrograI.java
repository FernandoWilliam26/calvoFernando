package básico;

import java.util.Scanner;

public class ExamenParcialPrograI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionDelJugador = 0;
        int numeroDeRecuadros = 60;
        int camelloAvanzado = 0;
        double agujeroAcertado = Math.random();

        for (int rondas = 0; rondas <= 50; rondas = rondas + 1) {
            
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]| ;--;'                                                          ");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            System.out.println("Tienes 4 agujeros, elige uno.");
            
            int agujero = entrada.nextInt();

            if (agujero==1 && agujeroAcertado<=.60){
                
                posicionDelJugador = posicionDelJugador + 1;
                System.out.print("Sigues una casilla, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }else if(agujero==1 && agujeroAcertado>.60){
                
                System.out.print("No sigues ninguna casilla, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }
            
            if (agujero==2 && agujeroAcertado<=.40){
                
                posicionDelJugador = posicionDelJugador + 2;
                System.out.print("Sigues dos casillas, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }else if(agujero==2 && agujeroAcertado>.40){
                
                System.out.print("No sigues ninguna casilla, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }

            if (agujero==3 && agujeroAcertado<=.30) {
                
                posicionDelJugador = posicionDelJugador + 4;
                System.out.print("Sigues cuatro casillas, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }else if(agujero==3 && agujeroAcertado>.30){
                
                System.out.print("No sigues ninguna casilla, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }

            if (agujero==4 && agujeroAcertado<=.10) {
                
                posicionDelJugador = posicionDelJugador + 6;
                System.out.print("Sigues seis casillas, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }else if(agujero==4 && agujeroAcertado>.10){
                
                System.out.print("No sigues ninguna casilla, esta es la casilla en la que estas: " + posicionDelJugador);
                
            }

            System.out.println(" Ronda: " + rondas);
        }
        
        System.out.println("Se acabó el juego");
        
    }
}