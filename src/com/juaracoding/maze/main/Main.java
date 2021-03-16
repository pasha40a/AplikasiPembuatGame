package com.juaracoding.maze.main;

import com.juaracoding.maze.animation.Labirin;
import com.juaracoding.maze.animation.Player;

public class Main {
	public static void main(String[]args) {
		Player player = new Player ("o",5,10);
		Labirin labirin = new Labirin(15,player);
		labirin.draw();
	}

}
