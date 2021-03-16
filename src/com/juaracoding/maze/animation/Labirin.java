package com.juaracoding.maze.animation;

public class Labirin {
	private Player player;
	private int defaultSizeRuangan = 10;
	public Labirin (int ruangan, Player player) {
		
		if(ruangan < 10) {
			this.defaultSizeRuangan = 10;
			
		}else {
			this.defaultSizeRuangan= ruangan;
		}
		this.player = player;
	}
		
		public Labirin () {
	//		this.player = new Player();
			
		}
		public void draw() {
			String dummyWall = "_";
			for (int i = 0; i <this.defaultSizeRuangan; i++) {
				for (int j = 0; j < defaultSizeRuangan; j++) {
					if(i==0 || i == this.defaultSizeRuangan-1) {
						dummyWall = "";
					}else {
						if((j==0) || (i==this.defaultSizeRuangan-1)){
							dummyWall="";
						}else {
						dummyWall = " ";
						}
					}
					if(i==this.player.getCorY() && j == this.player.getCorX()) {
					dummyWall= player.getBentuk();
				}
				}
			}
		}
	}

