package db.jdbc.member.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;


@Data
@AllArgsConstructor
public class MemberDTO {
    @NonNull

    private String name;
    @NonNull
    private String id;
    @NonNull
    private String pwd;
    private String phone;

    @Override
    public String toString() {  // 잘 적용됨 ㅇㅇ
        return name + "\t" + id + "\t" + pwd+"\t"+phone;
    }
}

/*
* 이름 : 15자리
* 아이디 : 30자리
* 비밀번호 : 50자리
* 핸드폰 : 20자리
* */
