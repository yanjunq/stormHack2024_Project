import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class server {
    @Autowired
    private RestTemplate restTemplate;

    private final String BASE_URL = "https://api.nal.usda.gov/fdc/v1/";
    private final String API_KEY = "PPsaRbhlTSwLyq8paaYVmMidG7HW0EWj2PTh1sii";

    public String searchFood(String query) {
        String url = BASE_URL + "foods/search?api_key=" + API_KEY + "&query=" + query;
        return restTemplate.getForObject(url, String.class);
    }

    public String postFoodData(String jsonBody) {
        String url = BASE_URL + "foods/list?api_key=" + API_KEY;
        return restTemplate.postForObject(url, jsonBody, String.class);
    }
}
