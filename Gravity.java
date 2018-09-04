
public class Gravity {
	public double falling(double time, double velo) {
		double a = 9.8;
		double d = velo*time + 0.5*a*time*time;
		return d;
	}

}
