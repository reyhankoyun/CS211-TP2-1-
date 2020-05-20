/*
 * Group: Project Team #5
 * Course: CS211 (C) Spring 2020
 * Date: May 19, 2020
 * Assignment: Ch16 Programming Project #3
 *  
 */

//This is an abstract class which contains the common methods and behaviors of Lists and is inherited
//by the ArrayList and LinkedList classes

import java.util.*;

public abstract class AbstractList<E> implements List<E> {
   
   //methods implemented in LinkedList and ArrayList classes
   public abstract int size();
   public abstract Iterator<E> iterator();  
   public abstract void add (int index, E value);
   public abstract void clear();
   
   // post: appends the given value to the end of the list
   public void add(E value) {
       add(size(), value);
   }
       
   // post: appends all values in the given list to the end of this list
   public void addAll(List<E> other) {
       for (E value: other) {
           add(value);
       }
   }
   
   // post: returns true if list is empty, false otherwise
   public boolean isEmpty() {
	   return size() == 0;
   }

   // post: returns true if the given value is contained in the list,
   //       false otherwise
   public boolean contains(E value) {
	   return indexOf(value) >= 0;
   }

   // post: creates a comma-separated, bracketed version of the list
   public String toString() {
      if (size() == 0) 
         return "[]";
      Iterator i = iterator();
      String s = "[" + i.next(); //fencepost
      while (i.hasNext())
         s += ", " + i.next();
      return s + "]";
   }

   // post : returns the position of the first occurrence of the given
   //        value (-1 if not found)
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
   
   // post: throws an IndexOutOfBoundsException if the given index is
   //       not a legal index of the current list
   protected void checkIndex(int index) {
       if (index < 0 || index >= size()) {
           throw new IndexOutOfBoundsException("index: " + index);
       }
   }

}