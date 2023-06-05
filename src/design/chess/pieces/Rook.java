package design.chess.pieces;

import design.chess.*;

public class Rook implements ChessPiece {
    private final Color color;
    private final PieceName name;
    private boolean isDead;

    public Rook(Color color, PieceName pieceName, boolean isDead) {
        this.color = color;
        this.name = pieceName;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public PieceName getName() {
        return this.name;
    }
}
