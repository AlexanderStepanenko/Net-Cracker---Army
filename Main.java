/**
 * Created by Пользователь on 02.11.2017.
 */
public class Main {

    public static void main(String[] args) {

        Soldier soldier = new Soldier("Иванов", Order.PEACE);

        General general = new General("Генерал", "Петров", Order.PEACE);

        Commander commander = new Commander("Коммандир", "Сидоров", Order.WAR);

        GO go[] = {general, commander, soldier, soldier};
        for (GO go1 : go) {
            go1.report();
            go1.fight();

        }
    }
}
