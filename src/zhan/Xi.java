package zhan;

public class Xi extends Han{
	public Xi() {
		name = "²ßªñ¥­";
		life = 100;
		attack = 11;
		defend = 4;
		hr = 0.2;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"ºû¥§¬õùÙ«Ì½ª§ğÀ»¡I";
		System.out.println(this.name+"ºû¥§¬õùÙ«Ì½ª§ğÀ»¡I");
	}
}