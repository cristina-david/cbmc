public class SubString01
{
   public static void main(String[] args)
   {
      String letters = "automatictestcasegenerationatdiffblue";

      String tmp=letters.substring(20);
      assert tmp.equals("erationatdiffblue");

      tmp=letters.substring(9, 13);
      assert tmp.equals("test");
   }
}
