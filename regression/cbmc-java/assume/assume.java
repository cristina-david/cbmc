import org.cprover.CProver;

class assume
{
  static void foo(int x)
  {
    CProver.assume(x>3);
    assert x>0;
  }
  
  public static void main(String[] args)
  {
    foo(3);
    CProver.assume(false);
    assert false;
  }
}


