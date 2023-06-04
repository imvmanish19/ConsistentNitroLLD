package design.chess;

import java.util.Queue;

public abstract class BoardGame {
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
            /** Current player will win if his move made him win right! **/
            if(isOver()) {
                System.out.println("Game Over: " + currentPlayer.getName() + " has won!");
                break;
            }
            /** Add player back to queue **/
            players.add(currentPlayer);
        }
    }

    public abstract boolean isOver();
}
