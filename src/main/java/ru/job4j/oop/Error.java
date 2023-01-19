package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Ошибка активна: " + active);
        System.out.println("Статус-код: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error err2 = new Error(true, 404, "Not found");
        Error err3 = new Error(false, 200, "OK");
        Error err4 = new Error(true, 500, "Internal Server Error");
        err1.printInfo();
        err2.printInfo();
        err3.printInfo();
        err4.printInfo();
    }
}
