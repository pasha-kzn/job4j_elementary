package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int id = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                id = i;
                break;
            }
        }
        if (id == -1) {
            throw new UserNotFoundException("Пользователь с login = " + login + " не найден.");
        }
        return users[id];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь невалидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}