package collection_.person;

import java.util.ArrayList;

public class PersonMain {
    public ArrayList<PersonDto> init(){
/*        ArrayList <PersonDto> arrayList = new ArrayList<>();  상관 없음*/
        ArrayList <PersonDto> arrayList = new ArrayList<PersonDto>();

        arrayList.add(/*aa*/new PersonDto("홍길동",25)); // aa의 주소를 준다
        arrayList.add(/*bb*/new PersonDto("프로도",25)); // bb의 주소를 준다
        arrayList.add(/*cc*/new PersonDto("라이언",25)); // cc의 주소를 준다.

        return arrayList;
    }

    public static void main(String[] args) {
        PersonDto personDto = new PersonDto();
        System.out.println("객체 personDto : "+personDto);
        System.out.println("객체 personDto : "+personDto.toString());

        personDto.setName("홍길동");
        personDto.setAge(25);
        System.out.println("이름 = "+personDto.getName()+" 나이 = "+personDto.getAge());
        System.out.println(personDto);  // overriding 하면 간단하게 풀림


        ArrayList<PersonDto>arrayList = new PersonMain().init();  // arrayList는 new PersonMain().init()의 주소를 받는다.
        System.out.println(arrayList);  // call by address
        for(PersonDto personDto1 : arrayList){
            System.out.println(personDto1);   // call by address
        }
    }
}

/*
toString override하기 전 결과
객체 personDto : collection_.person.PersonDto@682a0b20
객체 personDto : collection_.person.PersonDto@682a0b20


toString override하기 후 결과
객체 personDto : 이름 = null 나이 = 0
객체 personDto : 이름 = null 나이 = 0

*/
