package org.example;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        String name1 = "Henadzi";
        String name2 = "Aleksey";
        String name3 = "Kiryll";
        String name4 = "Tatyana";

        People men = new People(name1);
        People teenager1 = new People(name2);
        People teenager2 = new People(name3);
        People human = new People(name4);

        market.acceptToMarket(men); // Покупатель Henadzi пришел в магазин
        market.takeInQueue(men); // Покупатель Henadzi занимает очередь
        market.acceptToMarket(teenager1); // Покупатель Aleksey пришел в магазин
        market.takeInQueue(teenager1); // Покупатель Aleksey занимает очередь
        market.update(); // Принимаем заказ после обновления состояния
        market.giveOrders(men); // Покупатель Henadzi сделал заказ
        market.update(); // Принимаем заказ после обновления состояния
        market.giveOrders(teenager1); // Покупатель Aleksey сделал заказ
        market.acceptToMarket(teenager2); // Покупатель Kiryll пришел в магазин
        market.takeInQueue(teenager2); // Покупатель Kiryll занимает очередь
        market.update(); // Отдаем заказ после обновления состояния
        market.takeOrders(men); // Покупатель Henadzi получил заказ
        market.releaseFromQueue(men); // Покупатель Henadzi покидает очередь
        market.update(); // Принимаем заказ после обновления состояния
        market.giveOrders(teenager2); // Покупатель Kiryll сделал заказ
        market.releaseFromMarket(); // Покупатель Henadzi уходит из магазина
        market.acceptToMarket(human); // Покупатель Tatyana пришла в магазин
        market.takeInQueue(human); // Покупатель Tatyana занимает очередь
        market.update(); // Отдаем заказ после обновления состояния
        market.takeOrders(teenager1); // Покупатель Aleksey получил заказ
        market.releaseFromQueue(teenager1); // Покупатель Aleksey покидает очередь
        market.update(); // Принимаем заказ после обновления состояния
        market.giveOrders(human); // Покупатель Tatyana сделала заказ
        market.releaseFromMarket(); // Покупатель Aleksey уходит из магазина
        market.update(); // Отдаем заказ после обновления состояния
        market.takeOrders(teenager2); // Покупатель Kiryll получил заказ
        market.releaseFromQueue(teenager2); // Покупатель Kiryll покидает очередь
        market.releaseFromMarket(); // Покупатель Kiryll уходит из магазина
        market.update(); // Отдаем заказ после обновления состояния
        market.takeOrders(human); // Покупатель Tatyana получила заказ
        market.releaseFromQueue(human); // Покупатель Tatyana покидает очередь
        market.releaseFromMarket(); // Покупатель Tatyana уходит из магазина
    }
}