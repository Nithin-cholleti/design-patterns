package snakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell [][] cells;
    private int boardSize;

    public Board (int boardSize, int numberOfSnakes, int numberOfLadders){
        initialiseBoard(boardSize);
        addSnakesToBoard(boardSize, numberOfSnakes);
        addLaddersToBoard(boardSize, numberOfLadders);
    }

    private void addLaddersToBoard(int boardSize, int numberOfLadders) {
        while(numberOfLadders >0){
            int start = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
            int end = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
            if(start>=end){
                continue;
            }
            Jump jump = new Jump(start, end);
            Cell cell = getCell(start);
            if(cell.getJump() != null){
                continue;
            }
            cell.setJump(jump);
            numberOfLadders--;
        }
    }

    private void addSnakesToBoard(int boardSize, int numberOfSnakes) {
        while(numberOfSnakes >0){
            int start = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
            int end = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize -1);
            if(start<=end){
                continue;
            }
            Jump jump = new Jump(start, end);
            Cell cell = getCell(start);
            cell.setJump(jump);
            numberOfSnakes--;
        }
    }

    private void initialiseBoard(int boardSize) {
        this.boardSize = boardSize;
        this.cells = new Cell[boardSize][boardSize];
        for(int i = 0; i< boardSize; i++ ){
            for(int j = 0; j< boardSize; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int key){
        int row = Math.min(key / cells.length, boardSize -1);
        int col = Math.min(key % cells.length, boardSize -1);
        return cells[row][col];
    }

    public int getBoardSize(){
        return boardSize;
    }
}
