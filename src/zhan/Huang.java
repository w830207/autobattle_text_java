package zhan;

public class Huang extends Han{
	public Huang() {
		name = "�����";
		life = 100;
		attack = 13;
		defend = 3;
		hr = 0.6;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"��ԩҦ��x���A�H�@�ĦʡA�����Ӱh�I";
		System.out.println(this.name+"��ԩҦ��x���A�H�@�ĦʡA�����Ӱh�I");
	}
}
