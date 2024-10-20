package lessonssssss.lesson25;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue(String string) {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

   @Override
    public String toString(){
        return "GenericBox{" + "value= " + value + '}';

}
}

