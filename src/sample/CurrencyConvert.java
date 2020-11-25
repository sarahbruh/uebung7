/**
 * uebung 7 & 8
 * @author Brunmayr Sarah
 * @version 12.0.1, 19.11.2020
 */
package sample;

import java.util.ArrayList;

public class CurrencyConvert{

    ArrayList<Currency> al = new ArrayList<Currency>();

    public CurrencyConvert() {
        al.add(new Currency("USD", 1.19));
        al.add(new Currency("Yen", 124));
    }

    public double euroTo(double y, String x){

        Currency currency = null;

        for (int i = 0; i < al.size(); i++){
            if (al.get(i).getSign().equals(x)){
                currency = al.get(i);
            }
        }
        return y * currency.getValue();
    }

    public String getName(int z){

        return al.get(z).getSign();
    }
}
