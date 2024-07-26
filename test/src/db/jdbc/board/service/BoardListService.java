package db.jdbc.board.service;

import db.jdbc.board.dao.BoardDAO;

public class BoardListService implements Board{
    @Override
    public void execute() {
        BoardDAO.getInstance().listBoard();
    }
}
