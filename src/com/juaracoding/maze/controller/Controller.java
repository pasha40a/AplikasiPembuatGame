package com.juaracoding.maze.controller;

import com.juaracoding.maze.animation.Labirin;
import com.juaracoding.maze.animation.Player;

public class Controller {
	Player player;
	Labirin labirin;
	private Controller () {
		player = new Player ("o",5,10);
		labirin = new Labirin(15,player);
	}
	
//	public Controller(Player player, Labirin labirin) {
//		this.player = player;
//		this labirin = labirin;
//	}
//	private void moveUp() {
//		this.player.getCorX(this.player.getCorY()-1);
//		
//	}
//	private void moveDown() {
//		this.player.getCorX(this.player.getCorY()+1);
//	}
//	private void moveRight() {
//		
//	}
//	private void moveLeft() {
//		
//	}
}
