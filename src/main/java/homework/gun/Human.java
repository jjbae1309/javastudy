package homework.gun;

public class Human implements TargetInterface {
	protected int hp;
	
	public Human(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String getStatus() {
		if (hp <= 0) {
			return "사망";
		}
		else {
			return "생존";
		}
	}

	@Override
	public void damage(int damage) {
		// TODO Auto-generated method stub
		hp = hp - damage;
	}
}
