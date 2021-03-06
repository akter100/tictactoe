package edu.citytech.cst.tictactoe.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class WinnerStatus {
    private boolean isWinner;
    private int[] position;
    private String whoWon;

    public int[] getPosition() {
        return position;
    }

    public WinnerStatus(boolean isWinner, int[] position, String whoWon) {
        this.isWinner = isWinner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    @JsonProperty("isWinner")
    public boolean isWinner() {
        return isWinner;
    }

    @JsonProperty("isWinner")
    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return "TicTacToeModel{" +
                "position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                ", isWinner=" + isWinner +
                '}';
    }
}

