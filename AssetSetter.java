package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Key;
import object.OBJ_Sword;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Key();
		gp.obj[0].worldX = 24 * gp.tileSize;
		gp.obj[0].worldY = 20 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key();
		gp.obj[1].worldX = 82 * gp.tileSize;
		gp.obj[1].worldY = 51 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Chest();
		gp.obj[2].worldX = 33 * gp.tileSize;
		gp.obj[2].worldY = 20 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Chest();
		gp.obj[3].worldX = 87 * gp.tileSize;
		gp.obj[3].worldY = 51 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Boots();
		gp.obj[4].worldX = 17 * gp.tileSize;
		gp.obj[4].worldY = 54 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Sword();
		gp.obj[5].worldX = 47 * gp.tileSize;
		gp.obj[5].worldY = 60 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Key();
		gp.obj[6].worldX = 25 * gp.tileSize;
		gp.obj[6].worldY = 81 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Chest();
		gp.obj[7].worldX = 76 * gp.tileSize;
		gp.obj[7].worldY = 120 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Key();
		gp.obj[8].worldX = 64 * gp.tileSize;
		gp.obj[8].worldY = 29 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Chest();
		gp.obj[9].worldX = 88 * gp.tileSize;
		gp.obj[9].worldY = 37 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Key();
		gp.obj[10].worldX = 33 * gp.tileSize;
		gp.obj[10].worldY = 10 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Chest();
		gp.obj[11].worldX = 11 * gp.tileSize;
		gp.obj[11].worldY = 12 * gp.tileSize;
		
		gp.obj[12] = new OBJ_Key();
		gp.obj[12].worldX = 18 * gp.tileSize;
		gp.obj[12].worldY = 57 * gp.tileSize;
		
		gp.obj[13] = new OBJ_Chest();
		gp.obj[13].worldX = 15 * gp.tileSize;
		gp.obj[13].worldY = 73 * gp.tileSize;
		
		gp.obj[14] = new OBJ_Key();
		gp.obj[14].worldX = 60 * gp.tileSize;
		gp.obj[14].worldY = 74 * gp.tileSize;
		
		gp.obj[15] = new OBJ_Chest();
		gp.obj[15].worldX = 83 * gp.tileSize;
		gp.obj[15].worldY = 96 * gp.tileSize;
	}
}
