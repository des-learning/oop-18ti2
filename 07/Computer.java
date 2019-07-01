public class Computer {
	public void replaceCPU(CPU cpu) {}
	public void replaceMemory(int a, Memory m) {}
	public void addStorage(SSD ssd) {}
	public void addStorage(HDD hdd) {}
	public void replacePSU(PSU psu) {}
	public String getSpec() { return 
		"CPU: " + this.cpu.getMerek() + " " + this.cpu.getClock().toString() + "Ghz " + this.cpu.getCore() + " core(s)\n" +
		"CPU: Intel 3.4Ghz 8 core(s)\n" +
		"===\n" +
		"Memory: 8GB\n" +
		"Slot 1: 4GB\n" +
		"Slot 3: 4GB\n" +
		"===\n" +
		"Storage: 640GB\n" +
		"SSD: 128GB\n" +
		"HDD: 512GB\n" +
		"===\n" + 
		"PSU: 600watt"; }
}
