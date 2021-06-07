package zhan;

public class Kep extends Han{
	public Kep() {
		name = "柯文哲";
		life = 100;
		attack = 7;
		defend = 5;
		hr = 0.8;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"抓頭傻笑，怪怪的怪怪得閃過去了！";
		System.out.println(this.name+"抓頭傻笑，怪怪的怪怪得閃過去了！");
	}
}
