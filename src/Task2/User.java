package Task2;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private int id;
    private Car car;

    public User(String name, int id, Car car) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(car, user.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, car);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", car=" + car +
                '}';
    }

    public static User userClone(User user1, int number) throws CloneNotSupportedException {
        User user;
        if(number == 1){
            user = user1.cloneShallow();
        }else{
            user = user1.cloneDeep();
        }
        return user;
    }


    public User cloneShallow() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User cloneDeep() throws CloneNotSupportedException {
        User usercloned = (User) super.clone();
        Car carCloned = (Car) usercloned.getCar().clone();
        usercloned.setCar(carCloned);
        return usercloned;
    }
}
