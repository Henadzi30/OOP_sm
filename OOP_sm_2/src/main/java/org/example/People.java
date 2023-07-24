package org.example;

class People extends Actor {

    public People(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean bool) {
        this.isMakeOrder = bool;
    }

    @Override
    public void setTakeOrder(boolean bool) {
        this.isTakeOrder = bool;
    }

    @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }
}
