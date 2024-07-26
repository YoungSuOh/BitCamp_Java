package class_.salary;

import java.util.Scanner;

public class SalaryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalaryDto [] arr = new SalaryDto[3];

        for(int i=0;i<3;i++){
            SalaryDto salaryDto = new SalaryDto();
            String name, job; int basic, extra, total;
            System.out.print("이름 입력 : ");
            name = scanner.next();

            System.out.print("직급 입력 : ");
            job = scanner.next();

            System.out.print("기본급 입력 : ");
            basic = scanner.nextInt();

            System.out.print("수당 입력 : ");
            extra = scanner.nextInt();
            total = basic+extra;


            try{
                salaryDto.setData(name, Job.valueOf(job),basic,extra);
            }
            catch (IllegalArgumentException e){
                System.out.println("직급을 올바르게 입력하시오. 이사, 사원, 주임 중 택 1");
                i--;
                continue;

            }

            salaryDto.setTotal(total);

            if(total>=5000000){
                salaryDto.setRate(0.03);
            } else if (total >= 3000000) {
                salaryDto.setRate(0.02);
            }
            else{
                salaryDto.setRate(0.01);
            }

            salaryDto.setTax((int)(total*salaryDto.getRate()));
            salaryDto.setSalary(salaryDto.getTotal()-salaryDto.getTax());
            arr[i]=salaryDto;

        }
        System.out.println("이름\t\t직급\t기본급\t수당\t\t합계\t\t세율\t\t세금\t\t월급");
        for(int i=0;i<3;i++){
            System.out.println(arr[i].getName()+"\t"+arr[i].getJob()+"\t"+
                    arr[i].getBasic()+"\t"+arr[i].getExtra()+"\t"+
                    arr[i].getTotal()+"\t"+arr[i].getRate()+"\t"+
                    arr[i].getTax()+"\t"+arr[i].getSalary());
        }
        scanner.close();

    }
}


/*이름      직급      기본급      수당         합계      세율      세금      월급
------------------------------------------------------------------------
홍길동   이사      4,800,000   300,000
송중기   사원      2,000,000   100,000
아이유   주임      2,900,000   150,000*/
