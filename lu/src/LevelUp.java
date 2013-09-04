import static util.Printing.*;
import static util.Calculating.*;
import static java.lang.Math.*;



public class LevelUp {

	public static void main(String[] args) {
		Player mike = new Player("Mike",35,4,49,27);
		Player tony = new Player("Tony",14,9,37,40);
		
		p(compare(mike,tony).name+" estimated to win.");
		
		p(battle(mike,tony).name+" Wins!");

	}
	
	public static Player battle(Player a,Player b){
		Player a2 = new Player(a.name,a.atk,a.def,a.spd,a.hp);
		Player b2 = new Player(b.name,b.atk,b.def,b.spd,b.hp);
		
		Player winner = null;
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
		
		if(a2.hp > b2.hp){
			winner = a2;
		}else{
			winner = b2;
		}
		
		return winner;
	}

	public static Player compare(Player a,Player b){
		Player winner = null;
		double scale;	
		
		scale = (((a.atk - b.def) / (double)b.hp) * a.spd) / (((b.atk - a.def) / (double)a.hp) * b.spd);
		
		p(scale);
		
		if(scale < 0){
			winner = a;
		}else if(scale > 0){
			winner = b;
		}else{
			
		}
		
		return winner;
	}

}
