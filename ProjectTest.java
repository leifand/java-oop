public class ProjectTest {

  public static void main(String[] args) {

    Project p1 = new Project();
    Project p2 = new Project("Project X");
    Project p3 = new Project("Project Y", "A super secret web site that counts pokes");

    p1.setCost(1024.00);
    p2.setCost(2054.01);
    p3.setCost(64.32);

    System.out.println(p1.elevatorPitch());
    System.out.println(p2.elevatorPitch());
    System.out.println(p3.elevatorPitch());

    Portfolio port1 = new Portfolio();

    port1.addProject(p1);
    port1.addProject(p2);
    port1.addProject(p3);

    System.out.println(port1.getPortfolioCost());

    port1.showPortfolio();

  }
}
