package snakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Deque<Player> players = new LinkedList<>();
    private Dice dice;
    private Player winner;

    public Game(int boardSize , int numberOfSnakes , int numberOfLadders, int noOfPlayers) {
        board  = new Board(boardSize,numberOfSnakes,numberOfLadders);
        dice = new Dice(1, 6);
        for(int i = 1 ;  i<= noOfPlayers; i++){
            Player player = new Player(i , -1);
            players.add(player);
        }
        winner = null;
    }

    public void  startGame(){
        while (winner == null){
            Player player = getPlayer();
            System.out.println("player : " + player.getId() + " is playing now and is at : "+ player.getCurrentPosition() );
            int newPosition = player.getCurrentPosition() + dice.rollDice();
            newPosition = checkIfNewPositionHasJump(newPosition);
            player.setCurrentPosition(newPosition);
            if(newPosition == board.getBoardSize() * board.getBoardSize()){
                winner = player;
                System.out.println("player : " + winner.getId() + " has won the game ");
            }
        }
    }

    private  int checkIfNewPositionHasJump(int position){
        if(position > board.getBoardSize() * board.getBoardSize()){
            return board.getBoardSize() * board.getBoardSize();
        }
        Cell cell = board.getCell(position);
        if(cell.getJump() != null){
            return cell.getJump().getEnd();
        }
        return position;
    }
    private Player getPlayer(){
        Player currentPlayer = players.getFirst();
        players.removeFirst();
        players.addLast(currentPlayer);
        return currentPlayer;
    }
}
