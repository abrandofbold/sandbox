import static util.Printing.*;
import static util.Calculating.*;
import static java.lang.Math.*;



public class LevelUp {

	public static void main(String[] args) {
		Player mike = new Player("Mike",14,10,37,14);
		Player tony = new Player("Tony",17,11,20,40);
		
		p(mike);
		p(tony);
		
		p(compare(mike,tony).name+" estimated to win.");
		
		p(battle(mike,tony).name+" Wins!");

	}
	
	public static Player battle(Player a,Player b){
		Player a_tmp = new Player(a);
		Player b_tmp = new Player(b);
		
		int time = 1;
		
		while(a_tmp.hp > 0 && b_tmp.hp > 0){
			pnb(time+":");
			
			if(time % (99-a_tmp.spd) == 0){
				b_tmp.uHP(b_tmp.hp - (max(r(a_tmp.atk) - r(b_tmp.def),0)));
				pnb(" "+a_tmp.name+" Attacks! "+b_tmp.name+"'s health is now "+b_tmp.hp);
			}
			if(time % (99-b_tmp.spd) == 0){
				a_tmp.uHP(a_tmp.hp - (max(r(b_tmp.atk) - r(a_tmp.def),0)));
				pnb(" "+b_tmp.name+" Attacks! "+a_tmp.name+"'s health is now "+a_tmp.hp);
			}
			
			time++;
			p();
		}
		
		return (a_tmp.hp > b_tmp.hp || (a_tmp.hp == b_tmp.hp && a_tmp.spd > b_tmp.spd)) ? a_tmp : b_tmp;
	}

	public static Player compare(Player a,Player b){
		double scale;	
		
		scale = ((max(a.atk - b.def,0) / (double)b.hp) * a.spd) / ((max(b.atk - a.def,0) / (double)a.hp) * b.spd);
		
		p(scale);
		
		return (scale > 1 || (scale == 1 && a.spd > b.spd)) ? a : b;
	}

}
