package collections.List;

import java.util.Vector;
/*
 * Vector is introduced in java 1.0 version
 * After this version collections was released in java 1.2 version
 * Generics concept is released in java 1.5 version
 * Vector disadvantage: we can store any type of data but if we want to perform any 
 * further actions like addition ..... but if the vector array contains string also 
 * then it will throw exception. So, to avoid this in generic concept we have to mention 
 * the primitive data types i.e., wrapper class like Integer,Character.....
 */
public class VectorList {
	/*
	 * Creation, Addition,
	 * Retrieval, Verification,
	 * Deletion, Updation 
	 * methods 
	 */
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();//creation
		System.out.println(v);
		System.out.println("size of the elements: "+v.size());
		System.out.println("Capacity of the array: "+v.capacity());
		v.add(1);//adding single element
		System.out.println(v);
		v.add(0, 2);//adding the element with index at required position
		System.out.println(v);
		Vector<Integer> v1 = new Vector<>();
		v1.add(45);
		v1.add(70);
		v1.add(78);
		System.out.println("v1 is:"+v1);
		v.addAll(v1);//adding the whole list
		System.out.println(v);
		v.addAll(1, v1);//adding the whole list at required position
		System.out.println(v);
		v1.add(45);//It will accepts duplicate values
		System.out.println("v1 is:"+v1);
		v1.add(null);//It will accepts null values
		System.out.println("v1 is:"+v1);
		System.out.println(v1.get(2));//retrieval of element from the list
		v1.remove(null);//removing the element from the list
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1.lastIndexOf(45));
		v1.removeElementAt(0);
		System.out.println(v1);
		System.out.println(v.contains(72));//searching this element is present in the list
		System.out.println(v);
		v.set(0,67);
		System.out.println(v);
		System.out.println(v1);
		System.out.println(v.containsAll(v1));
		v1.removeAllElements();//removing all the elements
		System.out.println(v1);
	}

}
