public class Controlador {
    private Vista vista;
    // Modelo
    private RecibirRespuestas receptor;
    private ManejadorRespuestaAPI conector;

    public Controlador() {
        vista = new Vista();
        receptor = new RecibirRespuestas();
        conector = new ManejadorRespuestaAPI();
    }

    public void ejecutarPrograma(){
        while(true){
            vista.imprimirMenuPrincipal();
            int auxEleccion = receptor.recibirEleccion();
            if(auxEleccion == -1){
                vista.numeroInvalido();
            } else if(auxEleccion == 9){
                break;
            } else {
                while(true){
                    vista.pedirCantidad();
                    if(receptor.recibirCantidad() == -1){
                        vista.numeroInvalido();
                    } else {
                        break;
                    }
                }
                Conversor conversor = conector.conectarConAPI(receptor.obtenerMonedaBase());
                if(conversor == null){
                    vista.errorConversor();
                    break;
                }
                vista.imprimirRespuesta(
                        conversor.convertir(
                                receptor.obtenerMonedaFinal()
                                , receptor.obtenerCantidad()
                                ));
            }
        }
    }

}