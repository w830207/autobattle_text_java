package zhan;

public class Huang extends Han{
	public Huang() {
		name = "黃國昌";
		life = 100;
		attack = 13;
		defend = 3;
		hr = 0.6;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"怒戰所有官員，以一敵百，全身而退！";
		System.out.println(this.name+"怒戰所有官員，以一敵百，全身而退！");
	}
}
