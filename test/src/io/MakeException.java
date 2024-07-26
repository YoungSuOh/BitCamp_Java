package io;

public class MakeException extends Exception{ // 이제부터 예외처리는 MakeException으로 한다 => 사용자가 만든 예외처리 클래스
    /* 만들 때 해줘야 하는 것
    * 1. 에러 메세지가 들어오는 문자열 생성
    * 2. toString을 override를 해서 error message를 내보내야 한다.
    * */
    private String errorMsg;

    public MakeException(){}

    public MakeException(String errorMsg) {
        super();
        this.errorMsg = errorMsg;
    }
    @Override
    public String toString(){
        return errorMsg;
    }


}
