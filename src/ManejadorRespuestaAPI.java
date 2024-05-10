import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ManejadorRespuestaAPI {

    public Conversor conectarConAPI(String monedaBase){

        String llaveAPI = ""; // Llave API eliminada por seguridad

        if(llaveAPI.equals("")){
            return null;
        }

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + llaveAPI + "/latest/" + monedaBase))
                .build();
        try {

            HttpResponse<String> respuesta = cliente
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());
            String json = respuesta.body();

            ManejadorGson transformador = new ManejadorGson();
            return transformador.transformar(json);

        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
