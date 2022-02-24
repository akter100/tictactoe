package edu.citytech.cst.tictactoe.Controller;

import edu.citytech.cst.tictactoe.object.Winner;
import edu.citytech.cst.tictactoe.service.WinnerStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("game")
    public class WinnerController {
    @GetMapping("/tictactoe")
    public WinnerStatus getWinner(@RequestParam String moves){
        return new Winner().getWinnerStatus(moves);
    }
    }


