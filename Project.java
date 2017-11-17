public class Project {

  private String name = new String();
  private String description = new String();
  private double cost = 0.0;

  public Project() {;}

  public Project(String name) {
    this.name = name;
  }

  public Project(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; };

  public double getCost() { return cost; }
  public void setCost(double cost) { this.cost = cost; }

  public String elevatorPitch() {
    return new String(name + "(" + cost + ") : " + description);
  }

}
