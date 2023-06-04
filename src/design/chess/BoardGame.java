package design.chess;

import java.util.Queue;

public class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame() {
        while(true) {
            /** First Player of the queue **/
            Player currentPlayer = players.poll();
            /** Current Player has to make a move **/
            Move move = currentPlayer.makeMove();
            /** Apply the move on the board **/
            board.applyMove(move);
        }
    }
}
