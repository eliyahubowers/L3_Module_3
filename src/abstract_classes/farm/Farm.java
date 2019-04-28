package abstract_classes.farm;

import java.util.ArrayList;

public class Farm{
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList();
		cow co = new cow();
		horse ho = new horse();
		duck du = new duck();
		chicken ch = new chicken();
		farm.add(ho);
		farm.add(ch);
		farm.add(du);
		farm.add(ch);
		farm.add(ho);
		farm.add(co);
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).MakeNoise();
			farm.get(i).Eat();
		}
	}
}