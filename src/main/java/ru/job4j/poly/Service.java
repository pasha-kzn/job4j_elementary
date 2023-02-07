package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        Store store = new DbStore();
        /*        Store store = new FileStore(); */
        Service service = new Service(store);
        service.add();
    }
}