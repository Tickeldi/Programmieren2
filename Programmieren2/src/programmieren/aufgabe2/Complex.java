package programmieren.aufgabe2;

public final class Complex {

	private final double re;
	private final double im;
	
	public Complex ( double re , double im) {
		this.re = re;
		this.im = im;
	}
	
	
	public Complex add( Complex b) {
		return new Complex(
				re + b.getRealPart(),
				im + b.getImaginaryPart());
	}
	
	public Complex subtract ( Complex b) {
		return new Complex(
				re - b.getRealPart(),
				im - b.getImaginaryPart());
	}
	
	public Complex multiply ( Complex b) {
		return new Complex(
				re * b.getRealPart() - im * b.getImaginaryPart(),
				re * b.getImaginaryPart() + im * b.getRealPart());
	}
	
	public Complex divide ( Complex b) {
		return  new Complex(
				(re * b.getRealPart() + im * b.getImaginaryPart()) / 
				(b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart()), 
				(im * b.getRealPart() - re * b.getImaginaryPart()) / 
				(b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart())
				);
	}
	
	public double getRealPart () {
		return re;
	}
	
	public double getImaginaryPart () {
		return im;
	}
}
