import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Пользователь on 02.11.2017.
 */
public class General extends Human implements GO {

    private String position;
    private String name;
    private Order order;

    General(String position, String name, Order order) {
        this.position = position;
        this.name = name;
        this.order = order;

    }

    public Order getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fight() {
        try {
            if (order == Order.WAR) {
                System.out.println("Генерал: В бой!\n");
            } else if (order == Order.PEACE) {
                System.out.println("Генерал: Миру мир!\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void report() {
        try {
            System.out.println(position + " " + name + ", отдаю приказы.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
