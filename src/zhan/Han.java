package zhan;

public class Han {
	String battlestr = new String();
	String name = "�����"; // �W��
	int life = 100; // �ͩR��
	int attack = 7; // �����O
	int defend = 5; // ���m�O
	double hr = 0.55; // �R���v
	boolean flag = true; // �ͦs���A

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

	// ���m�D������ɪ��B�z�禡
	public void fangyu(int attack) {
		int hurt = 0; // ���쪺�ˮ`
		int residue_life; // �Ѿl�ͩR��
		if (die()) {
			if (attack > defend) {
				hurt = attack - defend;
			} else {
				hurt = 0;
			}
			residue_life = life - hurt; // �C�^�X�p��Ѿl�ͩR��
			System.out.println(this.name + "���X�F���m�A����" + hurt + "�I�ˮ`�I");
			if (residue_life < 0)
				residue_life = 0;
			System.out.println("�ٳ�" + residue_life + "�I�ͩR��"); // �C�L�Ѿl�ͩR��
			battlestr = "\n" + this.name + "���X�F���m�A����" + hurt + "�I�ˮ`�I\n" + "�ٳ�" + residue_life + "�I�ͩR��";
			life = residue_life; // ��e�ͩR��
			if (life <= 0) {
				battlestr = battlestr + "\n" + this.name + "�}�`,�C�������I";
			}
		}
	}

	// �}�`�ɪ��B�z�禡�A��^�@�ӥ��L�ȡA�N��O�_���`
	public boolean die() {
		flag = true;
		if (life <= 0) { // �ͩR�Ȥp�󵥩�0�h�}�`
			System.out.println(this.name + "�}�`");
			flag = false;
		}
		return flag;
	}

	// �S�������A���}���B�z�禡
	public void dodge() {
		battlestr = "\n�S�������A" + this.name + "���}�����h���`�ΡA���L�@�T�I";
		System.out.println("�S�������A" + this.name + "���}�����h���`�ΡA���L�@�T�I");
	}

	// �_���Ψ禡
	public void reborn() {
		this.life = 100;
		flag = true;
	}

}