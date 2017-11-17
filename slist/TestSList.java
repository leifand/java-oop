public class TestSList {

  public static void main(String[] args) {

    SList list1 = new SList();

    for(int i = 0; i < 20; i++) list1.add(i);
    list1.printValues();
    System.out.println(list1.remove());
    list1.printValues();
  }
}
