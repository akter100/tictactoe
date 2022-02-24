package edu.citytech.cst.tictactoe.object;

import edu.citytech.cst.tictactoe.service.WinnerStatus;

public class Winner {
    public WinnerStatus getWinnerStatus(String moves) {//"xxxoonnn"
        int pos[];
        boolean win;
        String letterWinner = "";

        String data[] = moves.split("");//"X", "X",

        if (data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")) {
            win = true;
            pos = new int[]{0, 1, 2};
            letterWinner = data[0];
        } else if (data[3].equals(data[4]) && data[3].equals(data[5]) && !data[3].equals("N")) {
            win = true;
            pos = new int[]{3, 4, 5};
            letterWinner = data[3];

        } else if (data[6].equals(data[7]) && data[6].equals(data[8]) && !data[6].equals("N")) {
            win = true;
            pos = new int[]{6, 7, 8};
            letterWinner = data[6];

        } else if (data[0].equals(data[3]) && data[0].equals(data[6]) && !data[0].equals("N")) {
            win = true;
            pos = new int[]{0, 3, 6};
            letterWinner = data[0];

        } else if (data[1].equals(data[4]) && data[1].equals(data[7]) && !data[1].equals("N")) {
            win = true;
            pos = new int[]{1, 4, 7};
            letterWinner = data[1];

        } else if (data[2].equals(data[5]) && data[2].equals(data[8]) && !data[2].equals("N")) {
            win = true;
            pos = new int[]{2, 5, 8};
            letterWinner = data[2];

        } else if (data[0].equals(data[4]) && data[0].equals(data[8]) && !data[0].equals("N")) {
            win = true;
            pos = new int[]{0, 4, 8};
            letterWinner = data[0];

        } else if (data[2].equals(data[4]) && data[2].equals(data[6]) && !data[2].equals("N")) {
            win = true;
            pos = new int[]{2, 4, 6};
            letterWinner = data[2];
        } else {
            win = false;
            pos = new int[]{
            };
            letterWinner = null;

        }
        return new WinnerStatus(win, pos, letterWinner);


    }
}
