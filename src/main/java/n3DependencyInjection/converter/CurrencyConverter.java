package n3DependencyInjection.converter;


/*
 * Implementation of the currency conversion service
 */
public class CurrencyConverter implements ICurrencyConverter {
    @Override
    public double convert(double amount, Currency toCurrency) {
        double conversionUSD = 1.09;
        double conversionGBP = 0.88;
        double result = 0.0;

        switch (toCurrency) {
            case EUR:
                result = amount;
                break;
            case USD:
                result = amount * conversionUSD;
                break;
            case GBP:
                result = amount * conversionGBP;
                break;
        }
        return result;
    }

}
