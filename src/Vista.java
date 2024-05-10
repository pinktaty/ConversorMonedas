public class Vista {
    // Constantes para códigos de escape ANSI
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";

    public void imprimirMenuPrincipal() {
        System.out.println(
                WHITE + "Bienvenidx al convertidor de monedas." +
                "\nElija el número de la conversión que desee hacer." + YELLOW +
                "\n1." + WHITE + " Pesos mexicanos a dólares estadounidenses." + YELLOW +
                "\n2." + WHITE + " Pesos mexicanos a bolivianos." + YELLOW +
                "\n3." + WHITE + " Dólares estadounidenses a pesos mexicanos." + YELLOW +
                "\n4." + WHITE + " Dólares estadounidenses a pesos argentinos." + YELLOW +
                "\n5." + WHITE + " Bolivianos a pesos argentinos." + YELLOW +
                "\n6." + WHITE + " Bolovianos a pesos mexicanos." + YELLOW +
                "\n7." + WHITE + " Pesos argentinos a bolivianos." + YELLOW +
                "\n8." + WHITE + " Pesos argentinos a dólares estadounidenses." + RED +
                "\n9. Salir.");
    }

    public void pedirCantidad(){
        System.out.println(WHITE + "Ingrese la cantidad positiva a convertir. (Formato: 00.0)");
    }

    public void numeroInvalido(){
        System.out.println("Introducir un número válido.");
    }

    public void errorConversor(){
        System.out.println(RED + "Ha ocurrido un error al intentarse conectar con la API.");
    }

    public void imprimirRespuesta(String monedaBase, String monedaFinal, double cantidad, double respuesta){
        System.out.println(
                "**************\n" + "Se ha convertido la cantidad de " + cantidad + " en moneda " + monedaBase + " a" +
                        " " + GREEN + respuesta + WHITE + " " + monedaFinal + "\n**************"
        );
    }

}