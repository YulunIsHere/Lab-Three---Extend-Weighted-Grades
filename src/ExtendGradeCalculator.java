
public class ExtendGradeCalculator {
  private int counter;
  private double[] weightedGrades;

  public ExtendGradeCalculator() {
    this.counter = 0;
    this.weightedGrades = new double[8];
  }
  // add a new grade and store that calculated grade into the array
  public void addAssignment(int grade, int totalPoint, double percent) {
    if (this.counter == 8) {
      System.out.println("The input amount cannot exceed "  + this.weightedGrades.length);
      return;
    }
    double weightedGrade = ((double) grade / totalPoint) * (percent / 100) * 100;
    this.weightedGrades[this.counter] = weightedGrade;
    // move to the next index 
    this.counter++;
  }
  // sum up all calculated grade as the final weighted grade
  public double getFinalWeightedGrade() {
    double ans = 0;
    for (int i = 0; i < this.weightedGrades.length; i++) {
      ans += this.weightedGrades[i];
    }

    return ans;
  }
}