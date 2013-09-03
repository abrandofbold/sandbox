

public class LevelUp {

	public static void main(String[] args) {
		Player mike = new Player("Mike",11,4,11,27);
		Player tony = new Player("Tony",8,9,7,14);
		
		Printing.p(battle(mike,tony).name+" Wins!");

	}
	
	public static Player battle(Player a,Player b){
		Player a2 = new Player(a.name,a.atk,a.def,a.spd,a.hp);
		Player b2 = new Player(b.name,b.atk,b.def,b.spd,b.hp);
		
		Player winner = null;
		int time = 1;
		
		while(a2.hp > 0 && b2.hp > 0){
			Printing.pnb(time+": ");
			
			if(time % a2.spd == 0){
				b2.uHP(b2.hp - (a2.atk - b2.def));
				Printing.pnb(a2.name+" Attacks! "+b2.name+"'s health is now "+b2.hp);
			}
			if(time % b2.spd == 0){
				a2.uHP(a2.hp - (b2.atk - a2.def));
				Printing.pnb(b2.name+" Attacks! "+a2.name+"'s health is now "+a2.hp);
			}
			
			time++;
			Printing.p();
		}
		
		if(a2.hp > b2.hp){
			winner = a2;
		}else{
			winner = b2;
		}
		
		return winner;
	}

}
