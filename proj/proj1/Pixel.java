/*
Pixel.java
*/

public class Pixel {

	private short red;
	private short green;
	private short blue;

	public Pixel() {
		this.red = 0;
		this.green = 0;
		this.blue = 0;
	}

	public Pixel(int red, int green, int blue) {
		this.red = (short)red;
		this.green = (short)green;
		this.blue = (short)blue;
	}

	public short getRed() {
		return red;
	}

	public short getGreen() {
		return green;
	}

	public short getBlue() {
		return blue;
	}

	public void setRed(short red) {
		this.red = red;
	}

	public void setGreen(short green) {
		this.green = green;
	}

	public void setBlue(short blue) {
		this.blue = blue;
	}
}
