public class Switch extends Node{
    public Switch(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Switch{" +
                "name='" + getName() + '\'' +
                //", cost=" + getCost() +
                "}";
    }
}
