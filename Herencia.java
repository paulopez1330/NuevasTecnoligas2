  

class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Professional profesional = new Professional("Paulo", "Lopez", 222, true,"Sistemas", "Licenciado");
        System.out.println(profesional.getName());
        System.out.println(profesional.getSurName());
        System.out.println(profesional.getDni());
        System.out.println(profesional.getSex());
        System.out.println(profesional.getTitle());
        System.out.println(profesional.getDegree());
    }
}

class Professional extends Person {
  private String title;
  private String degree;

  public String getTitle(){
    return this.title;
  }

  public void setTitle(String Value){
    this.title = Value;
  }
  
  public String getDegree(){
    return this.degree;
  }

  public void setDegree(String Value){
    this.degree = Value;
  }

  public Professional (String name, String surName, Integer dni, Boolean sex, String title, String degree) {
    super(name, surName, dni, sex);
    this.title = title;
    this.degree = degree;
  }

}

abstract class Person {
  private String name;
  private String surName;
  private Integer dni;
  private Boolean sex;

  public String getName(){
    return this.name;
  }

  public void setName(String Value){
    this.name = Value;
  }

public String getSurName(){
    return this.surName;
  }

  public void setSurName(String Value){
    this.surName = Value;
  }

  public Integer getDni(){
    return this.dni;
  }

  public void setDni(Integer Value){
    this.dni = Value;
  }

  public Boolean getSex(){
    return this.sex;
  }

  public void setSex(Boolean Value){
    this.sex = Value;
  }

  public Person (String name, String surName, Integer dni, Boolean sex) {
    this.name = name;
    this.surName = surName;
    this.dni = dni;
    this.sex = sex;
  }
}
