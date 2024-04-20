package Task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Bob",21);
        User user2 = new User("Bob",21);
        User user3 = new User("Bob",21);
        User user4 = new User("Tom",24);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
        System.out.println(user4.equals(user3));
    }
}
