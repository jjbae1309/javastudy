package homework.jjbae.gun;

public class Pistol implements GunInterface {
	
	
	@Override
	public String bang() {
		return "빵";
	}
	
	@Override
	public int damage() {
		return 30;
	}
}
