package class_.sungjuk;

public class SungJuk {
    private String name;
    private Subject subject;
    private int total;
    private double avg;
    private char grade;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(double avg) {
        switch ((int)(avg/10)){
            case 10: case 9:
                this.grade='A'; break;
            case 8:
                this.grade='B'; break;
            case 7:
                this.grade='C'; break;
            case 6:
                this.grade='D'; break;
            default:
                this.grade='F'; break;

        }
    }
}
