package CollectionFramework.model;

public record Product (
        String name,
        double prices,
        int amount)
    implements Comparable
{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
