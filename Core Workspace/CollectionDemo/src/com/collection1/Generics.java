/*
 * { public static void main(String[] args) {
 * 
 * //WITHOUT GENERICS ArrayList a = new ArrayList(); a.add(1); a.add(2);package
 * com.collection1;
 * 
 * import java.util.ArrayList; import java.util.Iterator;
 * 
 * import in.com.raystec.basics.Add; //genrics - It defines the datatype of
 * collection element
 * 
 * public class Generics a.add(3); a.add("Name");//here all type of data
 * lelement can be added System.out.println(a);
 * 
 * Iterator it = a.iterator(); while(it.hasNext()) { Object o =
 * (Object)it.next();//here we need to typecast the elements
 * System.out.println(o); }
 * 
 * //GENERICS ArrayList<Integer> a1 = new ArrayList<Integer>();//here generics
 * is applied a1.add(1); a1.add(2); a1.add(3); //a1.add("Name");//it will give
 * complie time error because after grenerics same kind of data elements can be
 * isereted
 * 
 * System.out.println(a1);
 * 
 * Iterator<Integer> it1 = a1.iterator(); while(it1.hasNext()) { int i =
 * it1.next();//there is no need to typecast System.out.println(i); } } }
 */