package org.example;

/**
 * Класс Market, который реализовывает два
 * вышеуказанных интерфейса и хранит в списке
 * список людей в очереди в различных статусах
 */

import java.util.ArrayList;
import java.util.List;


class Market implements IQueueBehaviour, IMarketBehaviour {

    private List<Actor> queue; // Очередь покупателей
    private List<Actor> market; //  Список обслуженных покупателей

    public Market() {
        queue = new ArrayList<>();
        market = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " Занимает очередь");
    }

    @Override
    public void takeOrders(Actor actor) {
        actor.setTakeOrder(true);
        System.out.println(actor.getName() + " получает заказ.");

    }

    @Override
    public void giveOrders(Actor actor) {
        actor.setMakeOrder(true);
        System.out.println(actor.getName() + " делает заказ.");
    }

    @Override
    public void releaseFromQueue(Actor actor) {
        queue.remove(actor);
        market.remove(actor);
        System.out.println(actor.getName() + " уходит из очереди");
    }

    // Методы из интерфейса MarketBehaviour
    @Override
    public void acceptToMarket(Actor actor) {
        market.add(actor);
        System.out.println(actor.getName() + " заходит в магазин");
    }

    @Override
    public void releaseFromMarket() {
        if (market.size() == 0) {
            System.out.println("В магазине нет покупателей!");
        } else {
            for (int i = 0; i < market.size(); i++) {
                System.out.println(market.get(i).getName() + ", ");
            }
            System.out.println("Формирует корзину заказа в магазине.");
        }
    }

    @Override
    public void update() {
        // Обновление состояния магазина

        // Принимает и отдает заказы
    }
}
