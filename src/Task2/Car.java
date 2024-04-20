package Task2;

import java.util.Objects;

public class Car implements Cloneable{
    private String produser;

    public Car(String produser) {
        this.produser = produser;

    }

    public Car() {
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    @Override
    public String toString() {
        return "Car{" +
                "produser='" + produser + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
