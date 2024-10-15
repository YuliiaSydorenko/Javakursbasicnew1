package lesson24.interfase;

public class Journal implements Printable {
    String name;
    int number;
     public Journal(String name, int number){
         this.name = name;
         this.number = number;


     }
     @Override
    public  void  print(){
         System.out.println("Journal %s #%d " );
     }
     @Override
    public void test(){
         System.out.println("Test journal");
     }

}
