package Taller17.Singleton;
import java.util.HashMap;
import java.util.Map;
public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;

    private Settings() {
        configuraciones = new HashMap<>();
        configuraciones.put("theme", "light");
        configuraciones.put("language", "En");
    }

    public static Settings getInstance() {
        if (instancia == null) {
            instancia = new Settings();
        }
        return instancia;
    }

    public String getConfiguracion(String clave) {
        return configuraciones.get(clave);
    }

    public void setConfiguracion(String clave, String valor) {
        configuraciones.put(clave, valor);
    }
}
