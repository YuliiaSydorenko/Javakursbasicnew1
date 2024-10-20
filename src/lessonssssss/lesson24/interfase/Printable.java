package lessonssssss.lesson24.interfase;

public interface Printable {

   //public abstract
    void print();

    default void test(){
        System.out.println("Test");

    }
    static void testStatic(String str){
        System.out.println("Static method printable: " +str);

    }



}
