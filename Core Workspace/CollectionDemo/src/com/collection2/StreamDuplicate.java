/*
 * package com.collection2;
 * 
 * import java.util.ArrayList; import java.util.HashSet; import java.util.List;
 * import java.util.Set;
 * 
 * import org.omg.CORBA.PUBLIC_MEMBER;
 * 
 * public class StreamDuplicate {
 * 
 * public static void main(String[] args) {
 * 
 * List<String> list = new ArrayList(); list.add("Pushpendra");
 * list.add("vipin"); list.add("Rays"); list.add("Rays");
 * list.add("Pushpendra"); list.add("Pushpendra"); list.add("Rays");
 * list.add("Rays"); list.add("vipin"); list.stream().filter(e ->
 * isDuplicate(e)).forEach(s -> System.out.println(s));
 * //System.out.println(set); }
 * 
 * static Set<String> set = new HashSet<>();
 * 
 * private static boolean isDuplicate(String x) {
 * 
 * if (set.add(x) == false) { return true; } return false; }
 * 
 * }
 */