package zhan;

public class Xi extends Han{
	public Xi() {
		name = "�ߪ�";
		life = 100;
		attack = 11;
		defend = 4;
		hr = 0.2;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"�������٫̽������I";
		System.out.println(this.name+"�������٫̽������I");
	}
}