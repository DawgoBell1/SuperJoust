package com.superjoust.qxst.commands;


import com.superjoust.qxst.Vector2;

import static com.superjoust.qxst.Game.player1;

/**
 * Created by Chris Cavazos on 5/1/2017.
 */
public class FlapComm extends Command {
    public FlapComm(){

    }
    @Override
    public void execute() {
        player1.move(new Vector2(0,-50));
    }
}
