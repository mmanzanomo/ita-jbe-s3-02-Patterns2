package n3DependencyInjection.articles;

import n3DependencyInjection.converter.Currency;
import n3DependencyInjection.converter.ICurrencyConverter;


/*
 * This class uses the currency conversion service through dependency injection
 */
public class ArticleDisplayPrices {
    private final ICurrencyConverter currencyConverter;


    // Injects the currency conversion dependency.
    public ArticleDisplayPrices(ICurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public double convertCurrency(double amount, Currency toCurrency) {
        return currencyConverter.convert(amount, toCurrency);
    }

}
