package apiCoinGecko;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarCripto {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual moeda você deseja pesquisar");
        var moeda = scan.nextLine();

        String chave = "CG-TPX7juPZcP3tkTSpcVnNHVPZ";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + moeda + "api_key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
