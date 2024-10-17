package homework26.task3;

public class NumericPair<T extends Number> {

    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;

    }

    //public T getFirst() {return first;}
    // public T getSecond() {return second;}
    // public void setFirst(T first) {this.first = first;}
    //public void setSecond(T second) {this.second = second;}


    public  double sum()  {
        double i;
        double v = first.doubleValue() + second.doubleValue();
        return v;
    }

}

