/**
 * Created by Пользователь on 02.11.2017.
 */
public class Commander extends Human implements GO {

    private String position;
    private String name;
    private Order order;

    Commander(String position, String name, Order order) {
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
                System.out.println("Коммандир: В бой!\n");
            } else if (order == Order.PEACE) {
                System.out.println("Коммандир: Миру мир!\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void report() {
        try {
            General general = new General("Генерал", "Петров", Order.PEACE);
            System.out.println("Коммандир " + name + ", нахожусь в подчинении генерала " + general.getName() + "а.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
