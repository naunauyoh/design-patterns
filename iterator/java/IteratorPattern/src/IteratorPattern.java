import java.util.*;
import java.io.*;

/**
 *
 * @author calem
 */
public class IteratorPattern {

  /**
   * Normally we only have next, but I added previous for giggles
   */
  public interface DemoIterable {

    public Boolean hasNext();

    public Boolean hasPrevious();

    public Object next();

    public Object previous();
  }

  public static class IterableList<T> {

    private List<T> list = new ArrayList<>();

    public class Iterator implements DemoIterable {

      private int currentIndex;

      @Override
      public Boolean hasNext() {
        return currentIndex < list.size();
      }

      @Override
      public Boolean hasPrevious() {
        return currentIndex > 0;
      }

      @Override
      public T next() {
        return list.get(currentIndex++);
      }

      @Override
      public T previous() {
        return list.get(--currentIndex);
      }
    }

    public IterableList(List<T> list) {
      this.list = list;
    }

    public Iterator getIterator() {
      return new Iterator();
    }

  }

  public static void UsingDemoIterator(List<String> list) {
    System.out.println("Demo Iterator");
    IterableList iterable = new IterableList(list);
    IterableList.Iterator iterator = iterable.getIterator();
    while (iterator.hasNext())
      System.out.println(iterator.next());
    while (iterator.hasPrevious())
      System.out.println(iterator.previous());
  }

  public static void UsingBuiltinIterator(List<String> list) {
    System.out.println("\n\nBuiltin Iterator");
    for (String s : list)
      System.out.println(s);
    Iterator iterator = list.iterator();
    while (iterator.hasNext())
      System.out.println(iterator.next());
  }

  public static void UsingJava8HigherOrderFunctions(List<String> list) {
    System.out.println("\n\nHigher Order Function");
    list.stream().forEach(System.out::println);
    // this doesn't show the flexibility or power of the higher order function
    // just a simple example
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    UsingDemoIterator(list);
    UsingBuiltinIterator(list);
    UsingJava8HigherOrderFunctions(list);
  }

}
