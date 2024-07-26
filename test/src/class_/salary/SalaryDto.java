package class_.salary;

public class SalaryDto {
    private String name;
    private Job job;
    private int basic;
    private int extra;


    public void setTotal(int total) {
        this.total = total;
    }

    private int total;

    public void setRate(double rate) {
        this.rate = rate;
    }

    private double rate;

    public void setTax(int tax) {
        this.tax = tax;
    }

    private int tax;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public void setData(String name,Job job,int basic,int extra){
        this.name=name;
        this.job=job;
        this.basic=basic;
        this.extra=extra;
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public int getBasic() {
        return basic;
    }

    public int getExtra() {
        return extra;
    }

    public int getTotal() {
        return total;
    }

    public double getRate() {
        return rate;
    }

    public int getTax() {
        return tax;
    }

    public int getSalary() {
        return salary;
    }
}


/*
[문제] 월급 계산 프로그램
1. 세율
합계가 5,000,000원 이상이면 3% (0.03)
        3,000,000원 이상이면 2% (0.02)
아니면 1% (0.01)
        2. 숫자는 3자리마다 , 표시
3. 소수이하는 표시하지 않는다. (정수형)

클래스명 : SalaryDTO
필드 : name, job, basic, extra, total, rate, tax, salary
메소드 : setData(이름, 직급, 기본급, 수당)
calc() - 합계, 세율, 세금, 월급 계산
getName()
getJob()
getBasic()
getExtra()
getTotal()
getRate()
getTax()
getSalary()

클래스명 : SalaryMain

[실행결과]
이름      직급      기본급      수당         합계      세율      세금      월급
------------------------------------------------------------------------
홍길동   이사      4,800,000   300,000
송중기   사원      2,000,000   100,000
아이유   주임      2,900,000   150,000*/
