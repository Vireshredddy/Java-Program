import java.util.*;
public final class ImmutableClass {
    private final String name;
    private final Date date;
    private final List<String> tags;
    public ImmutableClass(String name,Date date,List<String> tags) {
        this.name=Objects.requireNonNull(name); this.date=new Date(date.getTime());
        this.tags=Collections.unmodifiableList(new ArrayList<>(tags));
    }
    public String getName(){return name;}
    public Date getDate(){return new Date(date.getTime());}
    public List<String> getTags(){return tags;}
    public static void main(String[] args){System.out.println(new ImmutableClass("A",new Date(),Arrays.asList("x")).getTags());}
}