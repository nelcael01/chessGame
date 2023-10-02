package chessLayer.exceptions;

import boardLayer.exceptions.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
