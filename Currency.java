package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

import jdk.internal.jshell.tool.resources.version;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
            case "UAE Dirham":
            this.exchangeValues.put("AED", 1.00);
            this.exchangeValues.put("AUD", 0.37);
            this.exchangeValues.put("CAD", 0.35);
            this.exchangeValues.put("CFA", 151.01);
            this.exchangeValues.put("CHF", 0.25);
            this.exchangeValues.put("CNY", 1.80);
            this.exchangeValues.put("EGP", 4.25);
            this.exchangeValues.put("EUR", 0.23);
            this.exchangeValues.put("GBP", 0.20);
            this.exchangeValues.put("ILS", 0.92);
            this.exchangeValues.put("INR", 20.25);
            this.exchangeValues.put("JPY", 28.71);
            this.exchangeValues.put("KWD", 0.08);
            this.exchangeValues.put("KRW", 302.83);
            this.exchangeValues.put("NZD", 0.39);
            this.exchangeValues.put("PLN", 1.0367);
            this.exchangeValues.put("SAR", 1.02);
            this.exchangeValues.put("SGD", 0.36);
            this.exchangeValues.put("RUB", 20.75);
            this.exchangeValues.put("USD", 0.27);
            break;
            case "Australian Dollar":
            this.exchangeValues.put("AED", 2.67);
            this.exchangeValues.put("AUD", 1.00);
            this.exchangeValues.put("CAD", 0.94);
            this.exchangeValues.put("CFA", 403.90);
            this.exchangeValues.put("CHF", 0.66);
            this.exchangeValues.put("CNY", 4.82);
            this.exchangeValues.put("EGP", 11.39);
            this.exchangeValues.put("EUR", 0.61);
            this.exchangeValues.put("GBP", 0.54);
            this.exchangeValues.put("ILS", 2.46);
            this.exchangeValues.put("INR", 54.21);
            this.exchangeValues.put("JPY", 76.84);
            this.exchangeValues.put("KWD", 0.22);
            this.exchangeValues.put("KRW", 810.56);
            this.exchangeValues.put("NZD", 1.05);
            this.exchangeValues.put("PLN", 2.77);
            this.exchangeValues.put("SAR", 2.73);
            this.exchangeValues.put("SGD", 0.98);
            this.exchangeValues.put("RUB", 55.55);
            this.exchangeValues.put("USD", 0.72);
            break;
            case "Canadian Dollar":
            this.exchangeValues.put("AED", 2.81);
            this.exchangeValues.put("AUD", 1.05);
            this.exchangeValues.put("CAD", 1.00);
            this.exchangeValues.put("CFA", 425.22);
            this.exchangeValues.put("CHF", 0.70);
            this.exchangeValues.put("CNY", 5.08);
            this.exchangeValues.put("EGP", 12.00);
            this.exchangeValues.put("EUR", 0.65);
            this.exchangeValues.put("GBP", 0.57);
            this.exchangeValues.put("ILS", 2.59);
            this.exchangeValues.put("INR", 57.07);
            this.exchangeValues.put("JPY", 80.92);
            this.exchangeValues.put("KWD", 0.23);
            this.exchangeValues.put("KRW", 853.86);
            this.exchangeValues.put("NZD", 1.11);
            this.exchangeValues.put("PLN", 2.92);
            this.exchangeValues.put("SAR", 2.87);
            this.exchangeValues.put("SGD", 1.03);
            this.exchangeValues.put("RUB", 58.50);
            this.exchangeValues.put("USD", 0.76);
            break;
            case "Central African Franc ":
            this.exchangeValues.put("AED", 0.0066);
            this.exchangeValues.put("AUD", 0.0025);
            this.exchangeValues.put("CAD", 0.0024);
            this.exchangeValues.put("CFA", 1.00);
            this.exchangeValues.put("CHF", 0.0017);
            this.exchangeValues.put("CNY", 0.012);
            this.exchangeValues.put("EGP", 0.028);
            this.exchangeValues.put("EUR", 0.0015);
            this.exchangeValues.put("GBP", 0.0014);
            this.exchangeValues.put("ILS", 0.0061);
            this.exchangeValues.put("INR", 0.13);
            this.exchangeValues.put("JPY", 0.19);
            this.exchangeValues.put("KWD", 0.00055);
            this.exchangeValues.put("KRW", 2.01);
            this.exchangeValues.put("NZD", 0.0026);
            this.exchangeValues.put("PLN", 0.0069);
            this.exchangeValues.put("SAR", 0.0068);
            this.exchangeValues.put("SGD", 0.0024);
            this.exchangeValues.put("RUB", 0.14);
            this.exchangeValues.put("USD", 0.0018);
            break;
            case "Swiss Franc":
            this.exchangeValues.put("AED", 4.02);
            this.exchangeValues.put("AUD", 1.50);
            this.exchangeValues.put("CAD", 1.43);
            this.exchangeValues.put("CFA", 608.16);
            this.exchangeValues.put("CHF", 1.00);
            this.exchangeValues.put("CNY", 7.23);
            this.exchangeValues.put("EGP", 17.12);
            this.exchangeValues.put("EUR", 0.93);
            this.exchangeValues.put("GBP", 0.83);
            this.exchangeValues.put("ILS", 3.70);
            this.exchangeValues.put("INR", 81.32);
            this.exchangeValues.put("JPY", 115.16);
            this.exchangeValues.put("KWD", 0.34);
            this.exchangeValues.put("KRW", 1221.60);
            this.exchangeValues.put("NZD", 1.60);
            this.exchangeValues.put("PLN", 4.15);
            this.exchangeValues.put("SAR", 4.11);
            this.exchangeValues.put("SGD", 1.48);
            this.exchangeValues.put("RUB", 83.66);
            this.exchangeValues.put("USD", 1.10);
            break;
            case "Chinese Yuan":
            this.exchangeValues.put("AED", 0.55);
            this.exchangeValues.put("AUD", 0.21);
            this.exchangeValues.put("CAD", 0.20);
            this.exchangeValues.put("CFA", 83.11);
            this.exchangeValues.put("CHF", 0.14);
            this.exchangeValues.put("CNY", 1.00);
            this.exchangeValues.put("EGP", 2.35);
            this.exchangeValues.put("EUR", 0.13);
            this.exchangeValues.put("GBP", 0.12);
            this.exchangeValues.put("ILS", 0.51);
            this.exchangeValues.put("INR", 11.00);
            this.exchangeValues.put("JPY", 15.82);
            this.exchangeValues.put("KWD", 0.046);
            this.exchangeValues.put("KRW", 170.70);
            this.exchangeValues.put("NZD", 0.23);
            this.exchangeValues.put("PLN", 0.58);
            this.exchangeValues.put("SAR", 0.56);
            this.exchangeValues.put("SGD", 0.20);
            this.exchangeValues.put("RUB", 11.67);
            this.exchangeValues.put("USD", 0.15);
            break;
            case "Egyptian Pound":
            this.exchangeValues.put("AED", 0.23);
            this.exchangeValues.put("AUD", 0.087);
            this.exchangeValues.put("CAD", 0.083);
            this.exchangeValues.put("CFA", 35.57);
            this.exchangeValues.put("CHF", 0.058);
            this.exchangeValues.put("CNY", 0.42);
            this.exchangeValues.put("EGP", 1.00);
            this.exchangeValues.put("EUR", 0.054);
            this.exchangeValues.put("GBP", 0.048);
            this.exchangeValues.put("ILS", 0.21);
            this.exchangeValues.put("INR", 4.75);
            this.exchangeValues.put("JPY", 6.74);
            this.exchangeValues.put("KWD", 0.019);
            this.exchangeValues.put("KRW", 71.122);
            this.exchangeValues.put("NZD", 0.092);
            this.exchangeValues.put("PLN", 0.24);
            this.exchangeValues.put("SAR", 0.23);
            this.exchangeValues.put("SGD", 0.086);
            this.exchangeValues.put("RUB", 4.87);
            this.exchangeValues.put("USD", 0.063);
            break;
            case "Euro":
            this.exchangeValues.put("AED", 4.28);
            this.exchangeValues.put("AUD", 1.66);
            this.exchangeValues.put("CAD", 1.55);
            this.exchangeValues.put("CFA", 654.52);
            this.exchangeValues.put("CHF", 1.07);
            this.exchangeValues.put("CNY", 7.80);
            this.exchangeValues.put("EGP", 18.29);
            this.exchangeValues.put("EUR", 1.00);
            this.exchangeValues.put("GBP", 0.90);
            this.exchangeValues.put("ILS", 3.97);
            this.exchangeValues.put("INR", 86.85);
            this.exchangeValues.put("JPY", 121.82);
            this.exchangeValues.put("KWD", 0.36);
            this.exchangeValues.put("KRW", 1324.15);
            this.exchangeValues.put("NZD", 1.76);
            this.exchangeValues.put("PLN", 4.61);
            this.exchangeValues.put("SAR", 4.37);
            this.exchangeValues.put("SGD", 1.59);
            this.exchangeValues.put("RUB", 92.60);
            this.exchangeValues.put("USD", 1.16);
            break;
            case "British Pound":
            this.exchangeValues.put("AED", 4.75);
            this.exchangeValues.put("AUD", 1.84);
            this.exchangeValues.put("CAD", 1.72);
            this.exchangeValues.put("CFA", 726.12);
            this.exchangeValues.put("CHF", 1.18);
            this.exchangeValues.put("CNY", 8.66);
            this.exchangeValues.put("EGP", 20.31);
            this.exchangeValues.put("EUR", 1.11);
            this.exchangeValues.put("GBP", 1.00);
            this.exchangeValues.put("ILS", 4.40);
            this.exchangeValues.put("INR", 96.35);
            this.exchangeValues.put("JPY", 135.16);
            this.exchangeValues.put("KWD", 0.39);
            this.exchangeValues.put("KRW", 1139.56);
            this.exchangeValues.put("NZD", 1.95);
            this.exchangeValues.put("PLN", 5.12);
            this.exchangeValues.put("SAR", 4.85);
            this.exchangeValues.put("SGD", 1.77);
            this.exchangeValues.put("RUB", 102.73);
            this.exchangeValues.put("USD", 1.29);
            break;
            case "Israeli New Shekel":
            this.exchangeValues.put("AED", 1.08);
            this.exchangeValues.put("AUD", 0.40);
            this.exchangeValues.put("CAD", 0.38);
            this.exchangeValues.put("CFA", 164.74);
            this.exchangeValues.put("CHF", 0.27);
            this.exchangeValues.put("CNY", 1.95);
            this.exchangeValues.put("EGP", 4.62);
            this.exchangeValues.put("EUR", 0.25);
            this.exchangeValues.put("GBP", 0.22);
            this.exchangeValues.put("ILS", 1.00);
            this.exchangeValues.put("INR", 21.98);
            this.exchangeValues.put("JPY", 31.16);
            this.exchangeValues.put("KWD", 0.090);
            this.exchangeValues.put("KRW", 328.71);
            this.exchangeValues.put("NZD", 1.52);
            this.exchangeValues.put("PLN", 3.87);
            this.exchangeValues.put("SAR", 1.10);
            this.exchangeValues.put("SGD", 0.39);
            this.exchangeValues.put("RUB", 22.52);
            this.exchangeValues.put("USD", 0.29);
            break;
            case "Indian Rupee":
            this.exchangeValues.put("AED", 0.049);
            this.exchangeValues.put("AUD", 0.018);
            this.exchangeValues.put("CAD", 0.017);
            this.exchangeValues.put("CFA", 7.49);
            this.exchangeValues.put("CHF", 0.012);
            this.exchangeValues.put("CNY", 0.089);
            this.exchangeValues.put("EGP", 0.21);
            this.exchangeValues.put("EUR", 0.011);
            this.exchangeValues.put("GBP", 0.010);
            this.exchangeValues.put("ILS", 0.045);
            this.exchangeValues.put("INR", 1.00);
            this.exchangeValues.put("JPY", 1.41);
            this.exchangeValues.put("KWD", 0.0041);
            this.exchangeValues.put("KRW", 14.94);
            this.exchangeValues.put("NZD", 0.019);
            this.exchangeValues.put("PLN", 0.051);
            this.exchangeValues.put("SAR", 0.050);
            this.exchangeValues.put("SGD", 0.018);
            this.exchangeValues.put("RUB", 1.02);
            this.exchangeValues.put("USD", 0.013);
            break;
            case "Japanese Yen":
            this.exchangeValues.put("AED", 0.03);
            this.exchangeValues.put("AUD", 0.013);
            this.exchangeValues.put("CAD", 0.012);
            this.exchangeValues.put("CFA", 5.29);
            this.exchangeValues.put("CHF", 0.0087);
            this.exchangeValues.put("CNY", 0.062);
            this.exchangeValues.put("EGP", 0.14);
            this.exchangeValues.put("EUR", 0.0081);
            this.exchangeValues.put("GBP", 0.0072);
            this.exchangeValues.put("ILS", 0.032);
            this.exchangeValues.put("INR", 0.705);
            this.exchangeValues.put("JPY", 1.00);
            this.exchangeValues.put("KWD", 0.0029);
            this.exchangeValues.put("KRW", 10.54);
            this.exchangeValues.put("NZD", 0.013);
            this.exchangeValues.put("PLN", 0.036);
            this.exchangeValues.put("SAR", 0.035);
            this.exchangeValues.put("SGD", 0.012);
            this.exchangeValues.put("RUB", 0.72);
            this.exchangeValues.put("USD", 0.0095);
            break;
            case "Kuwaiti Dinar":
            this.exchangeValues.put("AED", 12.00);
            this.exchangeValues.put("AUD", 4.48);
            this.exchangeValues.put("CAD", 4.25);
            this.exchangeValues.put("CFA", 1821.99);
            this.exchangeValues.put("CHF", 3.00);
            this.exchangeValues.put("CNY", 21.63);
            this.exchangeValues.put("EGP", 51.11);
            this.exchangeValues.put("EUR", 2.77);
            this.exchangeValues.put("GBP", 2.46);
            this.exchangeValues.put("ILS", 11.05);
            this.exchangeValues.put("INR", 243.18);
            this.exchangeValues.put("JPY", 344.69);
            this.exchangeValues.put("KWD", 1.00);
            this.exchangeValues.put("KRW", 3635.59);
            this.exchangeValues.put("NZD", 4.74);
            this.exchangeValues.put("PLN", 12.44);
            this.exchangeValues.put("SAR", 12.25);
            this.exchangeValues.put("SGD", 4.41);
            this.exchangeValues.put("RUB", 249.17);
            this.exchangeValues.put("USD", 3.26);
            break;
            case "South Korean Won ":
            this.exchangeValues.put("AED", 0.0033);
            this.exchangeValues.put("AUD", 0.0012);
            this.exchangeValues.put("CAD", 0.0012);
            this.exchangeValues.put("CFA", 0.50);
            this.exchangeValues.put("CHF", 0.0008);
            this.exchangeValues.put("CNY", 0.006);
            this.exchangeValues.put("EGP", 0.014);
            this.exchangeValues.put("EUR", 0.0008);
            this.exchangeValues.put("GBP", 0.0007);
            this.exchangeValues.put("ILS", 0.003);
            this.exchangeValues.put("INR", 0.066);
            this.exchangeValues.put("JPY", 0.094);
            this.exchangeValues.put("KWD", 0.0003);
            this.exchangeValues.put("KRW", 1.00);
            this.exchangeValues.put("NZD", 0.0013);
            this.exchangeValues.put("PLN", 0.0034);
            this.exchangeValues.put("SAR", 0.0034);
            this.exchangeValues.put("SGD", 0.0012);
            this.exchangeValues.put("RUB", 0.068);
            this.exchangeValues.put("USD", 0.0009);
            break;
            case "NewZealand Dollar":
            this.exchangeValues.put("AED", 2.52);
            this.exchangeValues.put("AUD", 0.94);
            this.exchangeValues.put("CAD", 0.89);
            this.exchangeValues.put("CFA", 383.16);
            this.exchangeValues.put("CHF", 0.63);
            this.exchangeValues.put("CNY", 4.55);
            this.exchangeValues.put("EGP", 10.76);
            this.exchangeValues.put("EUR", 0.58);
            this.exchangeValues.put("GBP", 0.51);
            this.exchangeValues.put("ILS", 2.32);
            this.exchangeValues.put("INR", 51.22);
            this.exchangeValues.put("JPY", 72.61);
            this.exchangeValues.put("KWD", 0.21);
            this.exchangeValues.put("KRW", 765.85);
            this.exchangeValues.put("NZD", 1.00);
            this.exchangeValues.put("PLN", 2.62);
            this.exchangeValues.put("SAR", 2.58);
            this.exchangeValues.put("SGD", 0.92);
            this.exchangeValues.put("RUB", 52.48);
            this.exchangeValues.put("USD", 0.68);
            break;
            case "Poland Zloty":
            this.exchangeValues.put("AED", 0.96);
            this.exchangeValues.put("AUD", 0.36);
            this.exchangeValues.put("CAD", 0.34);
            this.exchangeValues.put("CFA", 146.43);
            this.exchangeValues.put("CHF", 0.24);
            this.exchangeValues.put("CNY", 1.73);
            this.exchangeValues.put("EGP", 4.10);
            this.exchangeValues.put("EUR", 0.22);
            this.exchangeValues.put("GBP", 0.19);
            this.exchangeValues.put("ILS", 0.88);
            this.exchangeValues.put("INR", 19.53);
            this.exchangeValues.put("JPY", 27.69);
            this.exchangeValues.put("KWD", 0.080);
            this.exchangeValues.put("KRW", 292.11);
            this.exchangeValues.put("NZD", 0.38);
            this.exchangeValues.put("PLN", 1.00);
            this.exchangeValues.put("SAR", 0.98);
            this.exchangeValues.put("SGD", 0.35);
            this.exchangeValues.put("RUB", 20.02);
            this.exchangeValues.put("USD", 0.26);
            break;
            case "Saudi Arabian Riyal":
            this.exchangeValues.put("AED", 0.97);
            this.exchangeValues.put("AUD", 0.36);
            this.exchangeValues.put("CAD", 0.34);
            this.exchangeValues.put("CFA", 148.63);
            this.exchangeValues.put("CHF", 0.24);
            this.exchangeValues.put("CNY", 1.76);
            this.exchangeValues.put("EGP", 4.17);
            this.exchangeValues.put("EUR", 0.22);
            this.exchangeValues.put("GBP", 0.20);
            this.exchangeValues.put("ILS", 0.90);
            this.exchangeValues.put("INR", 19.83);
            this.exchangeValues.put("JPY", 28.11);
            this.exchangeValues.put("KWD", 0.081);
            this.exchangeValues.put("KRW", 296.58);
            this.exchangeValues.put("NZD", 0.38);
            this.exchangeValues.put("PLN", 1.01);
            this.exchangeValues.put("SAR", 1.00);
            this.exchangeValues.put("SGD", 0.35);
            this.exchangeValues.put("RUB", 20.32);
            this.exchangeValues.put("USD", 0.26);
            break;
            case "Singapore Dollar":
            this.exchangeValues.put("AED", 2.72);
            this.exchangeValues.put("AUD", 0.68);
            this.exchangeValues.put("CAD", 0.96);
            this.exchangeValues.put("CFA", 412.96);
            this.exchangeValues.put("CHF", 0.68);
            this.exchangeValues.put("CNY", 4.90);
            this.exchangeValues.put("EGP", 11.59);
            this.exchangeValues.put("EUR", 0.62);
            this.exchangeValues.put("GBP", 0.55);
            this.exchangeValues.put("ILS", 2.50);
            this.exchangeValues.put("INR", 55.14);
            this.exchangeValues.put("JPY", 78.15);
            this.exchangeValues.put("KWD", 0.22);
            this.exchangeValues.put("KRW", 824.34);
            this.exchangeValues.put("NZD", 1.07);
            this.exchangeValues.put("PLN", 2.82);
            this.exchangeValues.put("SAR", 2.77);
            this.exchangeValues.put("SGD", 1.00);
            this.exchangeValues.put("RUB", 56.49);
            this.exchangeValues.put("USD", 0.74);
            break;
            case "Russian Ruble":
            this.exchangeValues.put("AED", 0.048);
            this.exchangeValues.put("AUD", 0.018);
            this.exchangeValues.put("CAD", 0.017);
            this.exchangeValues.put("CFA", 7.30);
            this.exchangeValues.put("CHF", 0.012);
            this.exchangeValues.put("CNY", 0.086);
            this.exchangeValues.put("EGP", 0.20);
            this.exchangeValues.put("EUR", 0.011);
            this.exchangeValues.put("GBP", 0.0099);
            this.exchangeValues.put("ILS", 0.044);
            this.exchangeValues.put("INR", 0.97);
            this.exchangeValues.put("JPY", 1.38);
            this.exchangeValues.put("KWD", 0.004);
            this.exchangeValues.put("KRW", 14.59);
            this.exchangeValues.put("NZD", 0.019);
            this.exchangeValues.put("PLN", 0.049);
            this.exchangeValues.put("SAR", 0.049);
            this.exchangeValues.put("SGD", 0.017);
            this.exchangeValues.put("RUB", 1.00);
            this.exchangeValues.put("USD", 0.01);
            break;
     


            case "US Dollar":
            this.exchangeValues.put("AED", 3.67);
            this.exchangeValues.put("AUD", 1.42);
            this.exchangeValues.put("CAD", 1.32);
            this.exchangeValues.put("CFA", 557.48);
            this.exchangeValues.put("CHF", 0.91);
            this.exchangeValues.put("CNY", 6.68);
            this.exchangeValues.put("EGP", 15.72);
            this.exchangeValues.put("EUR", 0.85);
            this.exchangeValues.put("GBP", 0.77);
            this.exchangeValues.put("ILS", 3.38);
            this.exchangeValues.put("INR", 73.51);
            this.exchangeValues.put("JPY", 105.62);
            this.exchangeValues.put("KWD", 0.31);
            this.exchangeValues.put("KRW", 1139.56);
            this.exchangeValues.put("NZD", 1.52);
            this.exchangeValues.put("PLN", 3.87);
            this.exchangeValues.put("SAR", 3.75);
            this.exchangeValues.put("SGD", 1.36);
            this.exchangeValues.put("RUB", 77.78);
            this.exchangeValues.put("USD", 1.00);
            break;
            
    }
}
    

// Initialize currencies
public static ArrayList<Currency> init() {
    ArrayList<Currency> currencies = new ArrayList<Currency>();

currencies.add( new Currency("United Arab Emirates Dirham", "AED") );
currencies.add( new Currency("Australian Dollar", "AUD") );
currencies.add( new Currency("Canadian Dollar", "CAD") );
currencies.add( new Currency("Central African Franc", "CFA") );
currencies.add( new Currency("Swiss Franc", "CHF") );
currencies.add( new Currency("Chinese Yuan ", "CNY") );
currencies.add( new Currency("Egyptian Pound", "EGP") );
currencies.add( new Currency("Euro", "EUR") );
currencies.add( new Currency("British Pound", "GBP") );
currencies.add( new Currency("Israeli New Shekel", "ILS") );
currencies.add( new Currency("Indian Rupee", "INR") );
currencies.add( new Currency("Japanese Yen", "JPY") );
currencies.add( new Currency("Kuwaiti Dinar", "KWD") );
currencies.add( new Currency("South Korean Won", "KRW") );
currencies.add( new Currency("NewZealandian Dollar", "NZD") );
currencies.add( new Currency("Poland Zloty", "PLN") );
currencies.add( new Currency("Saudi Riyal", "SAR") );
currencies.add( new Currency("Singapore Dollar", "SGD") );
currencies.add( new Currency("Russian Ruble", "RUB") );
currencies.add( new Currency("US Dollar", "USD") );
 for (Integer i =0; i < currencies.size(); i++) {
    currencies.get(i).defaultValues();
}		

return currencies;
}

// Convert a currency to another
public static Double convert(Double amount, Double exchangeValue) {
Double price;
price = amount * exchangeValue;
price = Math.round(price * 100d) / 100d;

return price;
}
}