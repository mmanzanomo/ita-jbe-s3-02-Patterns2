package n3DependencyInjection;

import n3DependencyInjection.articles.ArticleDisplayPrices;
import n3DependencyInjection.converter.Currency;
import n3DependencyInjection.converter.CurrencyConverter;
import n3DependencyInjection.converter.ICurrencyConverter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Instantiation of the currency conversion dependency.
        ICurrencyConverter currencyConverter = new CurrencyConverter();
        // The dependency is added to the instance that performs the currency conversion.
        ArticleDisplayPrices articleDisplayPrices = new ArticleDisplayPrices(currencyConverter);


        // Set of sample products to use the converter
        Map<String, Double> articles = new HashMap<>();
        // Prices are in EUR
        articles.put("Product 1", 19.99);
        articles.put("Product 2", 21.25);
        articles.put("Product 3", 14.00);


        // Show prices in different currencies
        System.out.println("\nProduct prices:");
        System.out.println("------------------");
        articles.forEach( (product, amount) -> {
            System.out.println("Product: " + product);
            System.out.println(" - EUR: " + articleDisplayPrices.convertCurrency(amount, Currency.EUR));
            System.out.println(" - USD: " + articleDisplayPrices.convertCurrency(amount, Currency.USD));
            System.out.println(" - GBP: " + articleDisplayPrices.convertCurrency(amount, Currency.GBP));
            System.out.println();
        });

    }
}
