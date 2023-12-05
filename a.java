public class Person {
  private String personname;
  private String aadharno;
  private String panno;

  public Person(String personname, String aadharno, String panno) {
    this.personname = personname;
    this.aadharno = aadharno;
    this.panno = panno;
  }

  public String getPersonname() {
    return personname;
  }

  public String getAadharno() {
    return aadharno;
  }

  public String getPanno() {
    return panno;
  }

  public void display() {
    System.out.println("Personname: " + personname);
    System.out.println("Aadharno: " + aadharno);
    System.out.println("Panno: " + panno);
  }

  public static void main(String[] args) {
    Person[] persons = new Person[5];
    for (int i = 0; i < persons.length; i++) {
      System.out.println("Enter the personname of person " + (i + 1) + ": ");
      String personname = System.console().readLine();
      System.out.println("Enter the aadharno of person " + (i + 1) + ": ");
      String aadharno = System.console().readLine();
      System.out.println("Enter the panno of person " + (i + 1) + ": ");
      String panno = System.console().readLine();
      persons[i] = new Person(personname, aadharno, panno);
    }
    for (Person person : persons) {
      person.display();
    }
  }
}