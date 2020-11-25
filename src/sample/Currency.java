/**
 * uebung 7 & 8
 * @author Brunmayr Sarah
 * @version 12.0.1, 19.11.2020
 */
package sample;

public class Currency {

    public String sign;
    public double value;

    public Currency(String sign, double value){
        this.sign = sign;
        this.value = value;
    }

    public String getSign() {
        return sign;
    }

    public double getValue() {
        return value;
    }
}
