package lessonssssss.lesson31.enums;

public enum Day {
    MONDAY("Понедельник",1),
    TUESDAY("Вторник",2),
    WEDNESDAY("Среда",3),
    THURSDAY("Четверг",4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота",6),
    SUNDAY("Воскресенье",7);

private String russian;
private  int dayOfWeek;



    Day(int dayOfWeek, String russian) {
        this.dayOfWeek = dayOfWeek;
        this.russian = russian;
    }

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }
    public String testMethod() {
        return  String.format("(%s - russ: %s, num: %d," ,
                this.name(), this.russian, this.dayOfWeek );
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Day{" +
                "russian='" + russian + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
