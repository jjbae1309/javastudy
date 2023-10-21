package homework.jjbae.gun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameMain {
	private static Logger LOGGER = LoggerFactory.getLogger(GameMain.class);
	
	public static void main(String[] args) {
		TargetInterface enemy = new Robot();
		
		GunInterface pistol = new Pistol();
		
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());
		// 1방
		enemy.damage(pistol.damage());
		LOGGER.debug(enemy.getStatus());		
	}
}
