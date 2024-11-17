package order.repository;

import order.model.Order;
import order.model.Orders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderRepository {
    private Orders orders;

    public OrderRepository(Orders orders) {
        this.orders = orders;
    }

    public void saveOrder(String[] datas) {
        Pattern pattern = Pattern.compile("([가-힣\\s]+)\\((\\d+)개\\)");
        for (String data : datas) {
            Matcher matcher = pattern.matcher(data);

            if (matcher.matches()) {
                String menu = matcher.group(1);
                int quantity = Integer.parseInt(matcher.group(2));

                orders.addOrder(new Order(menu, quantity));
            }
        }//end for loop
    }
}
