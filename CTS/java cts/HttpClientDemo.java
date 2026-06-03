import java.net.URI;
import java.net.http.*;

public class HttpClientDemo {

    public static void main(String[] args)
            throws Exception {

        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(new URI(
                                "https://api.github.com"))
                        .GET()
                        .build();

        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: "
                + response.statusCode());

        System.out.println(response.body());
    }
}