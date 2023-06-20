/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {

    public static void main(String[] args) {
        String city = "London"; // Cidade para obter informações climáticas

        try {
            String apiKey = "YOUR_API_KEY"; // Chave de API da OpenWeatherMap
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Processar a resposta JSON e exibir as informações do clima
            String weatherData = response.toString();
            System.out.println("Informações do clima em " + city + ":");
            System.out.println(weatherData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
