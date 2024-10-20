package lessonssssss.lesson24.interfase;

public class Presentation implements ColorPrintable {

    String title;
    String autor;
    String theme;
    int pages;

    public Presentation(String title, String autor, String theme, int pages) {
        this.title = title;
        this.autor = autor;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю в типографию");
        System.out.println("Printing presrntation in color ");
        ;

    }

    @Override
    public void print() {
        System.out.printf("Presentation by %s title; %s\n" ,autor ,title);
    }
}
