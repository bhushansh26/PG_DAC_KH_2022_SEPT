class Complex
{
	int real;
	int imag;
	
	Complex()
	{
		this.real=0;
		this.imag=0;
	}
	
	Complex(int real)
	{
		this.real=real;
		this.imag=0;
	}
	
	Complex(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	void complexSum( Complex obj)
	{
		int totReal = this.real + obj.real;
		int totImag = this.imag + obj.imag;
		System.out.println("Sum of complex numbers is : "+totReal+"+"+totImag+"i");
	}
	
	void complexMul( Complex obj )
	{
		int totReal = (this.real*obj.real)+((this.imag*obj.imag)*(-1));
		int totImag = (this.real*obj.imag)+(this.imag*obj.real);
		System.out.println("Multiplication of complex numbers is : "+totReal+"+"+totImag+"i");
	}
}
	
class ComplexDemo
{
	public static void main(String [] args)
	{
		Complex c1 = new Complex(3,2);
		Complex c2 = new Complex(4,-2);
		c1.complexSum(c2);
		c1.complexMul(c2);
	}
}	
