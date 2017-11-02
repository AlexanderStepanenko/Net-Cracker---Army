/**
 * Created by Пользователь on 02.11.2017.
 */
public class Soldier extends Human implements GO {

    private String name;
    private Order order;

    Soldier(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public void fight() {
        try {
            Commander commander = new Commander("Коммандир", "Сидоров", Order.PEACE);
            General general = new General("Генерал", "Петров", Order.PEACE);

            if (commander.getOrder() == Order.WAR) {
                System.out.println("Солдат: В бой!\n");
            } else if (order == Order.PEACE) {
                System.out.println("Рядовой: Миру мир!\n");
            } else if (general.getOrder() == Order.PEACE) {
                System.out.println("Рядовой: Миру мир!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void report() {
        try {
            Commander commander = new Commander("Коммандир", "Сидоров", Order.WAR);
            System.out.println("Рядовой " + name + ", нахожусь в подчинении коммандира " + commander.getName() + "a.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
