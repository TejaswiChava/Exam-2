package info.exam;

public class Triangle {
	int len1, len2, len3;

	public Triangle(int a, int b, int c) {
		len1 = a;
		len2 = b;
		len3 = c;
	}

	public boolean isTriangle() {
		if ((len1 > 0 && len2 > 0 && len3 > 0 && ((len1 + len2) > len3) && ((len2 + len3) > len1)
				&& ((len1 + len3) > len2)))

			return true;

		else
			return false;
	}

	public double getAngle(int edge) {
		double angle;
		if (!isTriangle())
			return 0;
		if (edge == len1)
			angle = Math.acos((len2 * len2 + len3 * len3 - len1 * len1) / (2.0 * len2 * len3));
		else if (edge == len2)
			angle = Math.acos((len1 * len1 + len3 * len3 - len2 * len2) / (2.0 * len1 * len3));
		else if (edge == len3)
			angle = Math.acos((len2 * len2 + len1 * len1 - len3 * len3) / (2.0 * len2 * len1));
		else
			angle = 0;
		angle = angle * 180.0 / Math.PI;
		return angle;

	}

}
