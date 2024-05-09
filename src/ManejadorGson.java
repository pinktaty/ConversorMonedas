import com.google.gson.Gson;

public class ManejadorGson {

    public Conversor transformar(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Conversor.class);
    }

}