package app;

import java.util.*;
import java.util.Arrays;

import java.util.List;

public class PrintableList <T> {
	

 List<T> list;
 
 PrintableList(T[] a){list=Arrays.asList(a);}
 List<T> getList(){return list;}
 void print(){for(T x:list)System.out.println(x);}
}
