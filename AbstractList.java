import java.util.*;

public abstract class AbstractList<E> implements List<E> {
   
   public abstract int size();
   public abstract Iterator<E> iterator();   
   
   public boolean isEmpty() {
      return size() == 0;
   }

   public boolean contains(E value) {
       return indexOf(value) != -1;
   }

   public String toString() {
      if (size() == 0) 
         return "[]";
      Iterator i = iterator();
      String s = "[" + i.next(); //fencepost
      while (i.hasNext())
         s += ", " + i.next();
      return s + "]";
   }

   public int indexOf(E value) {
      int count = 0;
      Iterator i = iterator();
      while (i.hasNext()) {
         E test = (E) i.next();
         if (test.equals(value))
            return count;
         count++;
      }
      return -1;
   }

}
