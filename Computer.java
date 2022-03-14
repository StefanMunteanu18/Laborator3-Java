public class Computer extends Node implements Identifiable, Storage{
    private String address;
    private int storageCapacity;

    public Computer(String address, String name, int storageCapacity) {
        super(name);
        this.address = address;
        this.storageCapacity = storageCapacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + getName() + '\'' +
                ", address='" + address + '\'' +
                ", storageCapacity=" + storageCapacity +
                //", cost=" + getCost() +
                '}';
    }
}
