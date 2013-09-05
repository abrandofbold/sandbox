import static util.Printing.*;
import static util.Calculating.*;
import static java.lang.Math.*;



public class LevelUp {

	public static void main(String[] args) {
		Player mike = new Player("Mike",14,10,23,14);
		Player tony = new Player("Tony",17,11,20,40);
		
		p(compare(mike,tony).name+" estimated to win.");
		
		p(battle(mike,tony).name+" Wins!");

	}
	
	public static Player battle(Player a,Player b){
		Player a2 = new Player(a.name,a.atk,a.def,a.spd,a.hp);
		Player b2 = new Player(b.name,b.atk,b.def,b.spd,b.hp);
		
		int time = 1;
		
		while(a2.hp > 0 && b2.hp > 0){
			pnb(time+":");
			
			if(time % (99-a2.spd) == 0){
				b2.uHP(b2.hp - (max(r(a2.atk) - r(b2.def),0)));
				pnb(" "+a2.name+" Attacks! "+b2.name+"'s health is now "+b2.hp);
			}
			if(time % (99-b2.spd) == 0){
				a2.uHP(a2.hp - (max(r(b2.atk) - r(a2.def),0)));
				pnb(" "+b2.name+" Attacks! "+a2.name+"'s health is now "+a2.hp);
			}
			
			time++;
			p();
		}
		
		return (a2.hp > b2.hp || (a2.hp == b2.hp && a2.spd > b2.spd)) ? a2 : b2;
	}

	public static Player compare(Player a,Player b){
		double scale;	
		
		scale = ((max(a.atk - b.def,0) / (double)b.hp) * a.spd) / ((max(b.atk - a.def,0) / (double)a.hp) * b.spd);
		
		p(scale);
		
		return (scale > 1 || (scale == 1 && a.spd > b.spd)) ? a : b;
	}

}
