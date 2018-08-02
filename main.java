package packagename;

public class Main {

  public static void main(String[] args) {
   int x = 1;
   int y = 1;
   int z = 1;
   triangle(x,y,z);
  }
  public static int triangle(int x, int y, int z){
  int summXY = x + y;
  int summYZ = y + z;
  int summXZ = x + z;
    if(summXY>z&&summYZ>x&&summXZ>y){
      
      System.out.println("1");
      return 1;
      
    }
    else{
      
      System.out.println("0");
      return 0;
    }
  }

}