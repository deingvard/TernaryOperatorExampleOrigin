/**
 * Created by iiuliyeu on 21.04.2017.
 */
public class Varibles {
    public static void main(String[] args) {
    double quantity = 9;
    double price = 100;
    double discount = 0.6;
    double cost;
    cost = quantity >= 10 ? quantity * price * discount : quantity * price;
        System.out.println(cost);
    }
}
