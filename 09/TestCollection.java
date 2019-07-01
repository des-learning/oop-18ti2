import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class TestCollection {
	public static void main(String []args) {
		List<String> nama = new ArrayList<String>();
		List<Integer> nilai = new LinkedList<Integer>();

		// tambahkan ke akhir list
		nama.add("budi");
		nama.add("agus");
		nilai.add(100);
		nilai.add(70);

		// tambahkan ke item 2 (insert)
		nama.add(1, "susi");
		nilai.add(1, 80);

		System.out.printf("Size:\nnama -> %d\nnilai -> %d\n", nama.size(), nilai.size());

		// iterator pattern
		for (String n: nama) {
			System.out.println(n);
		}
		List<String>nama1 = Arrays.asList(new String[]{"iwan", "andi"});
		nama.addAll(nama1);

		nilai.addAll(Arrays.asList(new Integer[]{55, 35}));

		System.out.println(nama);
		Collections.sort(nama);
		System.out.println(nama);
		
		List<Nilai> ns = Arrays.asList(new Nilai[]{
					new Nilai("budi", 70.0, 80.0, 90.0),
					new Nilai("susi", 30.0, 90.0, 70.0),
					new Nilai("agus", 60.0, 30.0, 20.0),
					new Nilai("rudi", 90.0, 40.0, 30.0)
		});
		List<NilaiOrderByTugas> nt = new ArrayList<NilaiOrderByTugas>();
		for(Nilai n: ns) {
			nt.add(new NilaiOrderByTugas(n));
		}

		System.out.println(nt);
		Collections.sort(nt, Collections.reverseOrder());
		System.out.println(nt);

		/*List<NilaiByUTS> nu = new ArrayList<NilaiByUTS>();
		for (Nilai n: ns) {
			nu.add(new NilaiByUTS(n));
		}
		System.out.println(nu);
		Collections.sort(nu);
		System.out.println(nu);*/
	}
}
