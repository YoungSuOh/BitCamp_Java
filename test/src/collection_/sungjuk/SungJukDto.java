package collection_.sungjuk;

import java.util.Scanner;

import static collection_.sungjuk.SungJukSort.temp;

public class SungJukDto implements Comparable<SungJukDto>{
    private Scanner scanner =new Scanner(System.in);
    private String name;
    private int no;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    public SungJukDto(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }
    public int getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTot() {
        tot=kor+math+eng;
    }

    public void setAvg() {
        avg=(double) tot/3;
    }

    @Override
    public String toString(){
        return no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
    }

    @Override
    public int compareTo(SungJukDto sungJukDto) {
        if(temp==1){
            if(this.tot<sungJukDto.tot) return 1;
            else if(this.tot>sungJukDto.tot) return -1;
            else return 0;
        }
        else{
            return this.name.compareTo(sungJukDto.name);
        }
    }

}




