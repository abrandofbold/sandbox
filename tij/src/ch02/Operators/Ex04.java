package ch02.Operators;

import static util.Printing.*;

public class Ex04 {

	public static void main(String[] args) {
		Distance d = new Distance(3478,"meter");
		Time t = new Time(120,"second");
		
		Velocity v = new Velocity(d,t);
		
		p("Moving " + d + " in " + t);
		p(v);

	}

}

class Distance{
	String unit;
	double d;
	
	Distance(double d,String unit){
		this.d = d;
		this.unit = unit;
	}
	
	public String toString(){
		return this.d + " " + this.unit + "s";
	}
}

class Time{
	String unit;
	double t;
	
	Time(double t,String unit){
		this.t = t;
		this.unit = unit;
	}
	
	public String toString(){
		return this.t + " " + this.unit + "s";
	}
}

class Velocity{
	String unit;
	double d;
	
	Velocity(Distance d,Time t){
		this.d = d.d / t.t;
		this.unit = d.unit + "s per " + t.unit;
	}
	
	public String toString(){
		return this.d + " " + this.unit;
	}
}
