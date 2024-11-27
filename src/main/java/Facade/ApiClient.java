package Facade;


public class ApiClient {

    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();
        String joke = apiFacade.getAttributeValue("https://api.chucknorris.io/jokes/random", "value");
        String exchangeRate = apiFacade.getAttributeValue("https://api.fxratesapi.com/latest", "rates.EUR");
        System.out.println("Joke: " + joke);
        System.out.println("Exchange rate: " + exchangeRate);

    }
}