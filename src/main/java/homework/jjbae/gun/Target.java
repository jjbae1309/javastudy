package homework.jjbae.gun;

public abstract class Target implements TargetInterface{
	protected int hp;
	
	public Target(int hp) {
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
		hp = hp - damage;
	}
}
