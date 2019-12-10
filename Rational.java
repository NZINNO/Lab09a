public class Rational
  {

  int Numerator;
  int Denominator;
  public Rational(){
    numerator = ?;
    denominator = ?;
    }
    public Rational(int numNumerator, int numDenominator){
      Numerator = numNumerator
      
    }
  }

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
