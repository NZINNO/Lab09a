public class Rational
  {
    // Attributes
    private int num;
    private int den;
    private int gcf;
    // Constructor
    public Rational(){
      num = 20;
      den = 30;
      decimal = 20/30
    }
    public Rational(int num, int den){
      this.num = num;
      this.den = den;
      this.decimal = decimal;
  }
    //Methods
    public int getNum(){ return num; }
    public int getDen(){ return den; }
    public int getDecimal(){ return decimal; }

	public void displayData()
	{
		System.out.println();
		System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
		System.out.println();
	}

	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);

	}
}
