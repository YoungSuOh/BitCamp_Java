package db.jdbc.board.service;

import db.jdbc.board.bean.BoardDTO;
import db.jdbc.board.dao.BoardDAO;

import java.util.Scanner;

public class BoardWriteService implements Board{
    private Scanner scanner = new Scanner(System.in);
    private BoardDTO boardDTO;

    @Override
    public void execute() {
        System.out.print("아이디 입력 : ");
        String id = scanner.next();

        System.out.print("이름 입력 : ");
        String name = scanner.next();
        scanner.nextLine();

        System.out.print("제목 입력 : ");
        String title = scanner.nextLine();

        System.out.print("내용 입력 : ");
        String content = scanner.nextLine();

        boardDTO = new BoardDTO(id,name,title,content);
        BoardDAO.getInstance().writeBoard(boardDTO);
        System.out.println();
    }
}
