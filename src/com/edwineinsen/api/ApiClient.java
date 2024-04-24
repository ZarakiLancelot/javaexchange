package com.edwineinsen.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.edwineinsen.util.Constants.API_KEY;
import static com.edwineinsen.util.Constants.BASE_URL;

public class ApiClient {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public static String sendGetRequest(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public static String buildApiUrl(String currency) {
        return BASE_URL + API_KEY + "/latest/" + currency;
    }
}
