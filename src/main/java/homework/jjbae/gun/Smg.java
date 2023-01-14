package homework.jjbae.gun;

public class Smg implements GunInterface {
	
	@Override
	public String bang() {
		return "두두두두";
	}
	
	@Override
	public int damage() {
		return 15;
	}
}
