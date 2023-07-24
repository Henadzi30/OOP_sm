package org.example;

abstract class Actor implements IActor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    public String getName() {
        return name;
    }

    public abstract void setMakeOrder(boolean bool);

    public abstract void setTakeOrder(boolean bool);

}
