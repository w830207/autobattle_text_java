package zhan;

public class Cai extends Han{

	public Cai() {
		name = "蔡英文";
		life = 100;
		attack = 8;
		defend = 5;
		hr = 0.7;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"用愛發電，電光石火避開攻擊！";
		System.out.println(this.name+"用愛發電，電光石火避開攻擊！");
	}

}
