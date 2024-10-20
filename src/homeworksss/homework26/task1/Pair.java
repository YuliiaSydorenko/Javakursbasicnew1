package homeworksss.homework26.task1;

public class Pair <T>{

    private T first;  // Первый элемент пары
    private T second;  // Второй элемент пары

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }


    public void setFirst(T value) {
        this.first = value;
    }

    public void setSecond(T value) {
        this.second = value;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;

}

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}


