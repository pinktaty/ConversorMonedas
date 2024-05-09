import java.util.Scanner;

public class RecibirRespuestas {
    int eleccion = -1;
    double cantidad = -1;

    public int recibirEleccion(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int aux = sc.nextInt();
            if (aux < 10 && aux > 0){
                eleccion = aux;
                return eleccion;
            }
        }
        return -1;
    }

    public int recibirCantidad(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            double aux = sc.nextDouble();
            if (aux > 0){
                cantidad = aux;
                return 1;
            }
        }
        return -1;
    }

    public double obtenerCantidad(){
        return this.cantidad;
    }

    public String obtenerMonedaBase(){

        if(this.eleccion == 1 || eleccion == 2){
            return "MXN";
        } else if(this.eleccion == 3 || eleccion == 4){
            return "USD";
        } else if(this.eleccion == 5 || eleccion == 6){
            return "ARS";
        } else{
            return "BOB";
        }

    }

    public String obtenerMonedaFinal(){

        if(this.eleccion == 1 || eleccion == 8){
            return "USD";
        } else if(this.eleccion == 2 || eleccion == 7){
            return "BOB";
        } else if(this.eleccion == 3 || eleccion == 6){
            return "MXN";
        } else{
            return "ARS";
        }

    }

}