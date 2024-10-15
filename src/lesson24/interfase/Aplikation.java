package lesson24.interfase;

import java.util.function.BiPredicate;

public class Aplikation {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "Михаил Булгаков");
       book.print();

        Journal cosmopolitan = new Journal("Cosmopolitan", 154);
        Printable printable;




        Printable book1 = new Book("Философия Java", "B. Ekkel");
       book1.print();

       book.test();
       Printable.testStatic("Hello!");

       Presentation presentation = new Presentation(
               "Inher",
               "Noname",
               "Interfase in OOP",
               20);
       presentation.print();
       presentation.colorPrint();
       presentation.test();

       Printable printable1 = presentation;
       printable1.print();

    }
}
