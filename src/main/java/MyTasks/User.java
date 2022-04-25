package MyTasks;

public class User {

    String name;
    String email;
    String password;
    String initials;
    Boolean mic;
    Boolean camera;
    Boolean share;
    Boolean speaking;
    Boolean authorised;
    Boolean registered;

    User(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static void main(String[] args) {

        User user = new User("user1", "user1@test.ru", "123456");

        user.registered = registration(user);
        user.initials = login(user);
        user.authorised = !user.initials.isEmpty();
        enterEvent(user.name);
    }

    public static boolean registration(User user) {

        System.out.println("Регистрация пользователя " + user.name + " email= " + user.email + " password " + user.password);
        return (true);
    }

    public static String login(User user) {

        String initials = "U";
        System.out.println("Пользователь " + user.email + " с паролем " + user.password + " входит в приложение");
        return (initials);

    }

    public static void enterEvent(String eventname) {

        Event event = new Event(eventname);
        Event.enter(event);

        System.out.println("Успешный вход в событие " + eventname);

    }
}
