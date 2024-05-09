import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Conversor {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public double deBaseA(String moneda){
        for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
            if (entry.getKey().equals(moneda)) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException("La clave " + moneda + " no fue encontrada.");
    }

    public double convertir(String monedaFinal, double cantidad){
        double conversion = deBaseA(monedaFinal);
        return conversion * cantidad;
    }

}