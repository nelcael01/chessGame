package chessLayer.picies;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.ChessPiece;
import chessLayer.enums.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position position = new Position();

        //above
        position.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //below
        position.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //left
        position.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //right
        position.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //nw
        position.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //ne
        position.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //sw
        position.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }

        //se
        position.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(position) && canMove(position)) {
            mat[position.getRow()][position.getColumn()] = true;
        }
        return mat;
    }
}
