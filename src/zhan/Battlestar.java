package zhan;

import java.util.Random;

public class Battlestar {
	static String str = "";// 存放戰鬥過程文字
	
	// 建立五個角色物件
	static Han han = new Han();
	static Cai cai = new Cai();
	static Kep kep = new Kep();
	static Huang huang = new Huang();
	static Xi xi =new Xi();

	// 有幾種對戰組合就寫幾個函式
	static String hancai() {
		int number=0;	//記錄回合數
		str = "";	//初始化戰鬥內容
		while (han.die() && cai.die()) {  
			number++;	//回合數+1
			str = str + "\n第" + number + "回合";
			if (mingZhong(han.getHr()) == 1) {
				cai.fangyu(han.getAttack());	//韓國瑜攻擊 調用蔡英文的防禦函式
				str = str + cai.battlestr;	//把戰鬥過程加入字串內
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}
			if (mingZhong(cai.getHr()) == 1) {
				han.fangyu(cai.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}

		}
		han.reborn();
		cai.reborn();
		return str;
	}

	static String hankep() {
		int number=0;
		str = "";
		while (han.die() && kep.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(han.getHr()) == 1) {
				kep.fangyu(han.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}
			if (mingZhong(kep.getHr()) == 1) {
				han.fangyu(kep.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}

		}
		han.reborn();
		kep.reborn();
		return str;
	}

	static String hanhuang() {
		int number=0;
		str = "";
		while (han.die() && huang.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(han.getHr()) == 1) {
				huang.fangyu(han.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}
			if (mingZhong(huang.getHr()) == 1) {
				han.fangyu(huang.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}

		}
		han.reborn();
		huang.reborn();
		return str;
	}
	
	//蔡英文boss
	static String caihan() {
		int number=0;
		str = "";
		while (cai.die() && han.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(cai.getHr()) == 1) {
				han.fangyu(cai.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}
			if (mingZhong(han.getHr()) == 1) {
				cai.fangyu(han.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}

		}
		han.reborn();
		cai.reborn();
		return str;
	}
	static String caikep() {
		int number=0;
		str = "";
		while (cai.die() && kep.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(cai.getHr()) == 1) {
				kep.fangyu(cai.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}
			if (mingZhong(kep.getHr()) == 1) {
				cai.fangyu(kep.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}

		}
		cai.reborn();
		kep.reborn();
		return str;
	}
	static String caihuang() {
		int number=0;
		str = "";
		while (cai.die() && huang.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(cai.getHr()) == 1) {
				huang.fangyu(cai.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}
			if (mingZhong(huang.getHr()) == 1) {
				cai.fangyu(huang.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}

		}
		cai.reborn();
		huang.reborn();
		return str;
	}
	
	//柯文哲boss
	static String kephan() {
		int number=0;
		str = "";
		while (kep.die() && han.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(kep.getHr()) == 1) {
				han.fangyu(kep.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}
			if (mingZhong(han.getHr()) == 1) {
				kep.fangyu(han.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}

		}
		han.reborn();
		kep.reborn();
		return str;
	}
	static String kepcai() {
		int number=0;
		str = "";
		while (kep.die() && cai.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(kep.getHr()) == 1) {
				cai.fangyu(kep.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}
			if (mingZhong(cai.getHr()) == 1) {
				kep.fangyu(cai.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}

		}
		cai.reborn();
		kep.reborn();
		return str;
	}
	static String kephuang() {
		int number=0;
		str = "";
		while (kep.die() && huang.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(kep.getHr()) == 1) {
				huang.fangyu(kep.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}
			if (mingZhong(huang.getHr()) == 1) {
				kep.fangyu(huang.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}

		}
		kep.reborn();
		huang.reborn();
		return str;
	}
	//黃國唱boss
	static String huanghan() {
		int number=0;
		str = "";
		while (huang.die() && han.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(huang.getHr()) == 1) {
				han.fangyu(huang.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}
			if (mingZhong(han.getHr()) == 1) {
				huang.fangyu(han.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}

		}
		han.reborn();
		huang.reborn();
		return str;
	}
	static String huangcai() {
		int number=0;
		str = "";
		while (huang.die() && cai.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(huang.getHr()) == 1) {
				cai.fangyu(huang.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}
			if (mingZhong(cai.getHr()) == 1) {
				huang.fangyu(cai.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}

		}
		cai.reborn();
		huang.reborn();
		return str;
	}
	static String huangkep() {
		int number=0;
		str = "";
		while (huang.die() && kep.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(huang.getHr()) == 1) {
				kep.fangyu(huang.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}
			if (mingZhong(kep.getHr()) == 1) {
				huang.fangyu(kep.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}

		}
		kep.reborn();
		huang.reborn();
		return str;
	}
	
	//習近平boss
	static String xicai() {
		int number=0;
		str = "";
		while (xi.die() && cai.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(xi.getHr()) == 1) {
				cai.fangyu(xi.getAttack());
				str = str + cai.battlestr;
			} else {
				cai.dodge();
				str = str + cai.battlestr;
			}
			if (mingZhong(cai.getHr()) == 1) {
				xi.fangyu(cai.getAttack());
				str = str + xi.battlestr;
			} else {
				xi.dodge();
				str = str + xi.battlestr;
			}

		}
		cai.reborn();
		xi.reborn();
		return str;
	}
	static String xikep() {
		int number=0;
		str = "";
		while (xi.die() && kep.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(xi.getHr()) == 1) {
				kep.fangyu(xi.getAttack());
				str = str + kep.battlestr;
			} else {
				kep.dodge();
				str = str + kep.battlestr;
			}
			if (mingZhong(kep.getHr()) == 1) {
				xi.fangyu(kep.getAttack());
				str = str + xi.battlestr;
			} else {
				xi.dodge();
				str = str + xi.battlestr;
			}

		}
		kep.reborn();
		xi.reborn();
		return str;
	}
	static String xihan() {
		int number=0;
		str = "";
		while (xi.die() && han.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(xi.getHr()) == 1) {
				han.fangyu(xi.getAttack());
				str = str + han.battlestr;
			} else {
				han.dodge();
				str = str + han.battlestr;
			}
			if (mingZhong(han.getHr()) == 1) {
				xi.fangyu(han.getAttack());
				str = str + xi.battlestr;
			} else {
				xi.dodge();
				str = str + xi.battlestr;
			}

		}
		han.reborn();
		xi.reborn();
		return str;
	}
	static String xihuang() {
		int number=0;
		str = "";
		while (xi.die() && huang.die()) {
			number++;
			str = str + "\n第" + number + "回合";
			if (mingZhong(xi.getHr()) == 1) {
				huang.fangyu(xi.getAttack());
				str = str + huang.battlestr;
			} else {
				huang.dodge();
				str = str + huang.battlestr;
			}
			if (mingZhong(huang.getHr()) == 1) {
				xi.fangyu(huang.getAttack());
				str = str + xi.battlestr;
			} else {
				xi.dodge();
				str = str + xi.battlestr;
			}

		}
		xi.reborn();
		huang.reborn();
		return str;
	}
	
	
	
	
	// 實現命中率的函式
	public static int mingZhong(double hr) {
		Random r = new Random();
		int flag = 0;// 初始化為miss未命中
		int a = r.nextInt(100);// 隨機產生(0,100)的整數
		if (a < (int) (hr * 100)) {     // hr是角色的命中率   如果a在0~hr*100 的區間內則代表命中
			flag = 1;// 代表命中，攻擊
		} else {
			flag = 0;// miss
		}
		return flag;
	}

}
