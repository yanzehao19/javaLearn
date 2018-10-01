package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodRef {
    public static MethodRef create( final Supplier< MethodRef > supplier ) {
        return supplier.get();
    }

    public static void collide( final MethodRef car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final MethodRef another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("W3CSchool");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
