import java.net.http.*;
import java.net.URI;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser; 
public class HttpClientExample {
public static void main(String[] args) {
String url = "https://api.github.com"; 
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("User-Agent", "JavaHttpClient") 
                .build();
try {
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println("Status Code: " + response.statusCode());
System.out.println("Response Body:\n" + response.body());
if (response.statusCode() == 200) {
JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
System.out.println("\nParsed field (current_user_url): " + json.get("current_user_url"));
}
} 
catch (IOException | InterruptedException e) {
e.printStackTrace();
}
}
}
