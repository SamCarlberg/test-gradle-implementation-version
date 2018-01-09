package testpackage;

public class TestClass {

  public static void main(String[] args) {
    System.out.println(TestClass.class);
    Package pkg = TestClass.class.getPackage();
    System.out.println("Package: " + pkg);
    System.out.println("  Implementation version: " + pkg.getImplementationVersion());
  }

}
