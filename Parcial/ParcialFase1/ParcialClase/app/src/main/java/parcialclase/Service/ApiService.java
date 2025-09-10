package parcialclase.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

import parcialclase.Model.Frase;

public class ApiService {

    private final String apiUrl = "https://zenquotes.io/api/quotes";

    public List<Frase> getFrases() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            Frase[] fraseArray = gson.fromJson(response.body(), Frase[].class);

            return Arrays.asList(fraseArray);

        } catch (Exception e) {
            System.err.println("Error al obtener frases: " + e.getMessage());
            return Collections.emptyList(); 
        }
    }
}
