package design.chess;

import java.util.HashMap;
import java.util.Map;

public abstract class ChessPlayer extends Player {

    private final Map<PieceName, ChessPiece> pieces;

    public ChessPlayer(String name) {
        super(name);
        this.pieces = new HashMap<>();
    }

    public ChessPiece getName(PieceName pieceName) {
        if(!pieces.containsKey(pieceName)) {
            throw new IllegalArgumentException("Invalid Piece");
        }
        return this.pieces.get(pieceName);
    }
}
