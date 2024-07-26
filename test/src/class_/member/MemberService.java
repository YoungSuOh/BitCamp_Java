package class_.member;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MemberService {
    private MemberDto[] arr = new MemberDto[5];
    private int memberNum = 0;
    private Scanner scanner = new Scanner(System.in);

    // menu 함수 : insert, list, update, delete
    public void menu(){
        System.out.println("*************\n" +
                "   1. 가입\n" +
                "   2. 출력\n" +
                "   3. 수정\n" +
                "   4. 탈퇴\n" +
                "   5. 끝내기\n" +
                "*************");
        while(true){
            try {
                System.out.print("번호 : ");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        insert();
                        break;
                    case 2:
                        list();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("올바른 입력이 아닙니다. 다시 입력하세요");
                        break;
                }
                if (num == 5) break;
            }
            catch (InputMismatchException e){
                System.out.println("올바르지 않은 입력값입니다. 다시 입력하세요");
            }
        }

    }

    public void insert(){
        System.out.println("insert()");
        if(memberNum==5){
            System.out.println("5명의 정원이 꽉 찼습니다.");
        }
        else{
            int cnt=0; MemberDto memberDto = new MemberDto();
            for(MemberDto dto:arr){
                if(dto==null){
                    break;
                }
                cnt++;
            }
            System.out.print(" 이름 입력 : ");
            memberDto.setName(scanner.next());

            try{
                System.out.print(" 나이 입력 : ");
                memberDto.setAge(scanner.nextInt());

                System.out.print(" 핸드폰 입력 : ");
                memberDto.setPhoneNum(scanner.next());

                System.out.print(" 주소 입력 : ");
                memberDto.setAddress(scanner.next());
                arr[cnt]=memberDto;

                System.out.println(" 회원 가입이 되었습니다.");
                memberNum++;
            }catch (InputMismatchException e){
                System.out.println("올바르지 않은 입력값입니다. 회원 가입을 취소합니다.");
            }

        }
    }


    public void list(){
        System.out.println("list()");
        System.out.println("이름\t나이\t핸드폰\t\t주소");
        for(MemberDto memberDto:arr){
            if(memberDto==null)continue;
            System.out.println(memberDto.getName()+"\t"+memberDto.getAge()+"\t"+
                    memberDto.getPhoneNum()+"\t"+memberDto.getAddress());
        }
    }
    public void update(){
        System.out.println("update()");
        System.out.print("핸드폰 번호 입력 : ");
        String phoneNum = scanner.next(); boolean exist = false; int cnt=0;
        for(MemberDto memberDto:arr){
            if(memberDto==null) continue;
            if(Objects.equals(memberDto.getPhoneNum(), phoneNum)){
                exist=true; break;
            }
            cnt++;
        }
        if(exist){
            System.out.print("수정 할 이름 입력 : ");
            arr[cnt].setName(scanner.next());

            try{
                System.out.print("수정 할 나이 입력 : ");
                arr[cnt].setAge(scanner.nextInt());

                System.out.print("수정 할 핸드폰 입력 : ");
                arr[cnt].setPhoneNum(scanner.next());

                System.out.print("수정 할 주소 입력 : ");
                arr[cnt].setAddress(scanner.next());

                System.out.println("회원의 정보를 수정하였습니다.");
            } catch (InputMismatchException e){
                System.out.println("올바르지 않은 입력값입니다. 회원 정보 수정을 취소합니다.");
            }
        }
        else{
            System.out.println("찾는 회원이 없습니다");
        }

    }

    public void delete(){
        System.out.println("delete()");
        System.out.print("핸드폰 번호 입력 : ");
        String phoneNum = scanner.next(); boolean exist = false; int cnt=0;
        for(MemberDto memberDto:arr){
            if(memberDto==null) continue;
            if(Objects.equals(memberDto.getPhoneNum(), phoneNum)){
                exist=true; break;
            }
            cnt++;
        }
        if(exist){
            arr[cnt]=null;
            System.out.println("회원의 정보를 삭제하였습니다.");
            memberNum--;
        }
        else{
            System.out.println("찾는 회원이 없습니다");
        }

    }
}


/*
클럽 회원관리 프로그램 작성

1. 여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
2. 회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
3. 회원 가입, 출력, 수정, 삭제하는 각각의 메소드을 작성한다.
4. 회원가입시 데이터를 Scanner를 통해 입력을 받은 다음 생성자로 데이터를 전달한다.
회원가입시 배열의 크기만큼 데이터가 다 입력되면 "5명의 정원이 꽉 찼습니다." 라고 메세지를 출력한다.
5. 출력시 데이터가 없으면 아무 내용도 출력되지 않는다.
6. 수정할 때는 먼저 핸드폰 번호를 입력받아서 검색하다.
만약 검색한 핸드폰 번호가 없으면 "찾는 회원이 없습니다" 라는 메세지를 출력한다.
핸드폰 번호가 있으면 수정 할 항목을 입력받아서 기존의 데이터를 수정해야 한다.
7. 삭제할 때는 먼저 핸드폰 번호를 입력받아서 검색하다.
만약 검색한 핸드폰 번호가 없으면 "찾는 회원이 없습니다" 라는 메세지를 출력한다.
핸드폰 번호가 있으면 주소를 null로 변경하면 된다.


[실행결과]
menu()
*************
        1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
번호 :

        [1번 경우]
insert()
5명의 정원이 꽉 찼습니다. //5명이 꽉 차면

또는

이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

회원 가입이 되었습니다.


[2번 경우]
list()
이름      나이      핸드폰      주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동      25      xxx      xxx

수정 할 이름 입력 :
수정 할 나이 입력 :
수정 할 핸드폰 입력 :
수정 할 주소 입력 :

회원의 정보를 수정하였습니다.

        또는

핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 :
회원의 정보를 삭제하였습니다.

        또는

핸드폰 번호 입력 :
찾는 회원이 없습니다*/
