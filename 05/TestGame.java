public class TestGame {
	public static void main(String []args) {
		Worker w = new Worker("budi");

		w.build(new CommandCenter(""));
		w.build(new Turret(""));
		w.build(new Barrack(""));
		
		Barrack b = new Barrack("barrack 1");
		b.produce(new Worker(""));
		b.produce(new Infantry(""));
		b.produce(new AirForce(""));

		Turret t = new Turret("xxx");
		//t.attack(w);
		//t.attack(b);

		Infantry i = new Infantry("yyy");
		//i.attack(w);
		//i.attack(b);

		Offensive[] o = new Offensive[]{t, i};
		for (Offensive attacker: o) {
			attacker.attack(w);
			attacker.attack(b);
		}
	}
}
