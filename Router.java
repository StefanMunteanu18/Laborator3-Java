public class Router extends Node implements Identifiable{
    private String address;

    public Router(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + getName() + '\'' +
                ", address='" + address + '\'' +
                //", cost=" + getCost() +
                '}';
    }
}
