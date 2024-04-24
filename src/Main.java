import com.edwineinsen.api.ApiClient;

import static com.edwineinsen.api.ApiClient.buildApiUrl;
import static com.edwineinsen.api.ApiClient.sendGetRequest;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = buildApiUrl("USD");
        String jsonResponse = sendGetRequest(url);
        System.out.println("RESPUESTA DEL SERVICIO: " + jsonResponse);
    }
}
