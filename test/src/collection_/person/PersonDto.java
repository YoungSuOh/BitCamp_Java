package collection_.person;

public class PersonDto /*extends Object가 생략됨*/implements Comparable<PersonDto>{
    private String name;
    private int age;

    public PersonDto() {
    }

    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 주석처리 하면서 학습 요망
    @Override
    public String toString(){
        return "이름 = "+name+" 나이 = "+age;
    }


    // Comparable interface overrride
    @Override  // 어떤 걸로 정렬할지 기준을 정함
    public int compareTo(PersonDto personDto) {
        // 나이로 오름차순
        if(this.age<personDto.age) return -1;
        else if(this.age>personDto.age) return 1;
        else return 0;

        // 나이로 내림차순
/*        if(this.age>personDto.age) return -1;
        else if(this.age<personDto.age) return 1;
        else return 0;*/

        // 이름으로 오름차순 -> 문자열은 크다 작다 비교불가
        // 문자열은 자체적으로 compareTo 메서드가 있다.
/*        return this.name.compareTo(personDto.name);  // -1, 1, 0 이 알아서 나옴*/

        // 이름으로 내림차순
/*        return this.name.compareTo(personDto.name)*-1;*/

    }
}