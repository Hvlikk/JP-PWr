public class Student {

    private Integer indexNumber;
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public Student setNumber(Integer number) {
        this.number = number;
        return null;
    }

    public Student(Integer indexNumber, Integer number){
        this.number = number;
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public Student setIndexNumber(Integer indexNumber) {
        this.indexNumber = indexNumber;
        return null;
    }
}
