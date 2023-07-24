package org.example;

/**
 * Интерфейс QueueBehaviour, который описывает
 * логику очереди – помещение в/освобождение из
 * очереди, принятие/отдача заказа
 */

public interface IQueueBehaviour {
    void takeInQueue(Actor actor); // Добавление покупателя в очередь
    void takeOrders(Actor actor); // Принять заказ
    void giveOrders(Actor actor); // Отдать заказ
    void releaseFromQueue(Actor actor); // Удаление покупателя из очереди
}
