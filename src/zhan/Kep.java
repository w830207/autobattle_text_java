package zhan;

public class Kep extends Han{
	public Kep() {
		name = "�_���";
		life = 100;
		attack = 7;
		defend = 5;
		hr = 0.8;
		flag = true;
	}
	public void dodge() {
		battlestr ="\n"+this.name+"���Y�̯��A�ǩǪ��ǩǱo�{�L�h�F�I";
		System.out.println(this.name+"���Y�̯��A�ǩǪ��ǩǱo�{�L�h�F�I");
	}
}
