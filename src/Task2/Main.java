package Task2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Bob", 1, new Car("BMW"));
        User user2 = User.userClone(user1,2);
        User user3 = user1.cloneDeep();

        user1.getCar().setProduser("Audi");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
