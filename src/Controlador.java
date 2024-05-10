public class Controlador {
    private Vista vista;
    // Modelo
    private ReceptorRespuestas receptor;
    private ManejadorRespuestaAPI conector;

    public Controlador() {
        vista = new Vista();
        receptor = new ReceptorRespuestas();
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
                String auxMonedaBase = receptor.obtenerMonedaBase();
                Conversor conversor = conector.conectarConAPI(auxMonedaBase);
                if(conversor == null){
                    vista.errorConversor();
                    break;
                }
                String auxMonedaFinal = receptor.obtenerMonedaFinal();
                double auxCantidad = receptor.obtenerCantidad();
                double auxRespuesta = conversor.convertir(auxMonedaFinal, auxCantidad);
                vista.imprimirRespuesta(auxMonedaBase, auxMonedaFinal, auxCantidad, auxRespuesta);
            }
        }
    }

}