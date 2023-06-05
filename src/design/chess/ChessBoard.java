package design.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board {

    private final List<List<ChessCell>> cells;
    /** Avoiding Magic Numbers**/
    private static final int rowCount = 8;
    private static final int columnCount = 8;

    public ChessBoard() {
        this.cells = new ArrayList<>();
        for(int i=0;i<rowCount;i++) {
            List<ChessCell> chessCells = new ArrayList<>();
            for(int j=0;j<columnCount;j++) {
                chessCells.add(new ChessCell(i,j));
            }
            this.cells.add(chessCells);
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void applyMove(Move move) {

    }
}
