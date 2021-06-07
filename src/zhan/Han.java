package zhan;

public class Han {
	String battlestr = new String();
	String name = "韓國瑜"; // 名稱
	int life = 100; // 生命值
	int attack = 7; // 攻擊力
	int defend = 5; // 防禦力
	double hr = 0.55; // 命中率
	boolean flag = true; // 生存狀態

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		this.defend = defend;
	}

	public double getHr() {
		return hr;
	}

	public void setHr(double hr) {
		this.hr = hr;
	}

	// 防禦遭到攻擊時的處理函式
	public void fangyu(int attack) {
		int hurt = 0; // 受到的傷害
		int residue_life; // 剩餘生命值
		if (die()) {
			if (attack > defend) {
				hurt = attack - defend;
			} else {
				hurt = 0;
			}
			residue_life = life - hurt; // 每回合計算剩餘生命值
			System.out.println(this.name + "做出了防禦，受到" + hurt + "點傷害！");
			if (residue_life < 0)
				residue_life = 0;
			System.out.println("還剩" + residue_life + "點生命值"); // 列印剩餘生命值
			battlestr = "\n" + this.name + "做出了防禦，受到" + hurt + "點傷害！\n" + "還剩" + residue_life + "點生命值";
			life = residue_life; // 當前生命值
			if (life <= 0) {
				battlestr = battlestr + "\n" + this.name + "陣亡,遊戲結束！";
			}
		}
	}

	// 陣亡時的處理函式，返回一個布林值，代表是否死亡
	public boolean die() {
		flag = true;
		if (life <= 0) { // 生命值小於等於0則陣亡
			System.out.println(this.name + "陣亡");
			flag = false;
		}
		return flag;
	}

	// 沒有打中，躲開的處理函式
	public void dodge() {
		battlestr = "\n沒有擊中，" + this.name + "離開高雄去選總統，躲過一劫！";
		System.out.println("沒有擊中，" + this.name + "離開高雄去選總統，躲過一劫！");
	}

	// 復活用函式
	public void reborn() {
		this.life = 100;
		flag = true;
	}

}