package io;


import java.io.*;

/*
* 단위 : 1. byte 단위 처리 (숫자, 영문자) - byte 스트림
*       Input Stream, OutputStream -> 둘다 추상 클래스 => 생성이 안됨
* 문자 단위 처리(슷지, 영문자, 한글) - 문자 스트림
*       Reader, Writer
* */
public class DataSteam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt");  // 파일이 없으면 자동으로 생성
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeUTF("홍길동");
        dataOutputStream.writeInt(25);
        dataOutputStream.writeDouble(12.5);
        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("result.txt"));
        String name = dataInputStream.readUTF();
        int age = dataInputStream.readInt();
        double height = dataInputStream.readDouble();
        System.out.println("이름 = "+name+" 나이 : "+age+" 몸무기 : "+height);
        dataOutputStream.close();


    }
}
