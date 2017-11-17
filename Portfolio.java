import java.util.ArrayList;

public class Portfolio {

  private ArrayList<Project> projects = new ArrayList<Project>();

  public Portfolio() {;}

  public void addProject(Project project) {
    projects.add(project);
  }

  // getter / setters might go here ...

  public double getPortfolioCost() {
    double sum = 0.0;
    for (Project p : projects) {
      sum += p.getCost();
    }
    return sum;
  }

  public void showPortfolio() {
    for (Project p : projects) {
      System.out.println(p.elevatorPitch());
    }
  }
}
