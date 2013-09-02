package ch01.Objects;

public class Ex11 {

	public static void main(String[] args) {
		
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		
		atc.anIntRepresentingColor = 4;
		System.out.println(atc.anIntRepresentingColor);
		atc.changeTheHueOfTheColors(5);
		System.out.println(atc.anIntRepresentingColor);

	}

}

class AllTheColorsOfTheRainbow{
	int anIntRepresentingColor;
	void changeTheHueOfTheColors(int newHue) {
		this.anIntRepresentingColor = newHue;
	}
}
