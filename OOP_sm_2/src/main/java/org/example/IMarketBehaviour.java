package org.example;

/**
 * Интерфейс MarketBehaviour, который описывает
 * логику магазина – приход/уход покупателей,
 * обновление состояния магазина
 */

public interface IMarketBehaviour {
    void acceptToMarket(Actor actor); // Приход покупателя
    void releaseFromMarket(); // Уход покупателя
    void update();

}
