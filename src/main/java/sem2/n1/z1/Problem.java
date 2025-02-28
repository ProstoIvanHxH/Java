package sem2.n1.z1;

  public class Problem {
  private int difficult;
  private String description;

      public Problem(int difficult, String description) {
          this.difficult = difficult;
          this.description = description;
      }

      public int getDifficult() {
          return difficult;
      }

      public String getDescription() {
          return description;
      }

      public void setDifficult(int difficult) {
          this.difficult = difficult;
      }

      public void setDescription(String description) {
          this.description = description;
      }
  }

