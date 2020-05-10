public class Wilder {
  // Attributes
  private String firstname;
  private boolean present;

  // Constructor
  public Wilder(String firstname, boolean present) { 
    this.firstname = firstname;
    this.present = present;
}
  // Getters
  public String getFirstname() {
    return firstname;
  }
  public Boolean getPresent() {
    return present;
  }

  // Setters
  public void setFirstname(String newFirstname) {
    this.firstname = newFirstname;
  }
  public void setPresent(Boolean newPresent) {
    this.present = newPresent;
  }

  // whoAmI() method
  public String whoAmI() {
    if (this.present) 
		{ 
			return "My name is " + this.firstname + " and I am present";
		} else { 
			return "My name is " + this.firstname + " and I am not present";
		}
	}

}
