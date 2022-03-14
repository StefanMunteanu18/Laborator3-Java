import java.util.Comparator;

public class CompareIdentifiable implements Comparator<Identifiable> {
    @Override
    public int compare(Identifiable o1, Identifiable o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
