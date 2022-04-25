package MyTasks;

public class Event {

    String name;
    String id;
    Boolean guestaccess;
    Boolean started;
    String owner;

    Event(String name) {
        this.name = name;

    }

    public static void enter(Event event) {

        System.out.println("Пользователь входит в событие " + event.name);
    }

}
