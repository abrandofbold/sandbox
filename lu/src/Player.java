
public class Player {
	String name;
	int atk;
	int def;
	int spd;
	int hp;
	
	public Player(String name,int a,int d,int s,int h){
		this.name = name;
		this.atk = (a > 0 ? a : 0);
		this.def = (d > 0 ? d : 0);
		this.spd = (s > 0 ? s : 0);
		this.hp = (h > 0 ? h : 0);
	}
	
	public Player(Player p){
		this.name = p.name;
		this.atk = p.atk;
		this.def = p.def;
		this.spd = p.spd;
		this.hp = p.hp;
	}
	
	public void uHP(int h){
		this.hp = (h > 0 ? h : 0);
	}
	
	public String toString(){
		return name+" [ATK:"+atk+" DEF:"+def+" SPD:"+spd+" HP:"+hp+"]";
	}

}
