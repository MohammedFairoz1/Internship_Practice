// Create a program that simulates an organization with different types of employees and departments. The program should have the following classes/interfaces:
// Employee - This is an abstract class that has the properties of an employee such as name, age, salary, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Department - This is an abstract class that has the properties of a department such as name, budget, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also have an interface named "Operation" that has a method named "performOperation" which will be implemented by different department operations such as hiring, firing, budget allocation, etc.
// Manager - This is a derived class of the Employee class. It should have additional properties such as team, department, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Developer - This is a derived class of the Employee class. It should have additional properties such as technology, experience, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Marketing - This is a derived class of the Department class. It should have additional properties such as campaigns, events, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate marketing campaigns and events.
// IT - This is a derived class of the Department class. It should have additional properties such as technology, infrastructure, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate IT operations such as hiring, firing, and budget allocation.
// In the main method, create objects of different types of employees and departments, and simulate employee management and department operations by calling the "performOperation" method of the respective department.

//abstract
//The given code consists of classes that represent an organization's employees and departments. The Employee class contains fields such as name, age, and salary, and its child classes Manager and Developer contain additional fields. The Department class contains name and budget fields, and its child classes Marketing and IT contain additional fields and implement the Operation interface. The main method creates instances of these classes and prints their details, as well as calls the performOperation method on the Marketing and IT classes.

//The code uses object-oriented programming concepts such as inheritance, abstraction, and encapsulation to represent an organization's structure and operations. The main method demonstrates how these classes can be used to create and manage employees and departments, and how the Operation interface can be used to define and perform operations specific to each department.
abstract class Employee{
  private String name;
  private int age;
  private int salary;
  Employee(String name, int age, int salary){
    this.name= name;
    this.age = age;
    this.salary = salary;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
}

abstract class Department{
  private String name;  
  private String budget;
  Department(String name, String budget){
    this.name=name;
    this.budget=budget;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBudget() {
	return budget;
}
public void setBudget(String budget) {
	this.budget = budget;
}
}

class Manager extends Employee{
  private String team;
  private String department;
  Manager(String name, int age, int salary, String team, String department){
    super(name, age, salary);
    this.team=team;
    this.department=department;
  }
  public String getTeam() {
    return team;
  }
  public void setTeam(String team) {
    this.team = team;
  }
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
}

class Developer extends Employee{
  private String technology; 
  private int experience;
  Developer(String name, int age, int salary, String technology, int experience){
    super(name, age, salary);
    this.technology=technology;
    this.experience=experience;
  }
  public String getTechnology() {
    return technology;
  }
  public void setTechnology(String technology) {
    this.technology = technology;
  }
  public int getExperience() {
    return experience;
  }
  public void setExperience(int experience) {
    this.experience = experience;
  }
}

class Marketing extends Department implements Operation{
  private int campaigns; 
  private String events;
  Marketing(String name, String budget, int campaigns, String events){
    super(name, budget);
    this.campaigns = campaigns;
    this.events = events;
  }
  // public String getName(){
  //   return name;
  // }
  // public void setName(String name){
  //   this.name = name;
  // }
  public int getCampaigns() {
	return campaigns;
}

public void setCampaigns(int campaigns) {
	this.campaigns = campaigns;
}

public String getEvents() {
	return events;
}

public void setEvents(String events) {
	this.events = events;
}

public void performOperation(int hiring, int firing, int budgetAllocation) {
    System.out.println("Performing marketing operation: " + "Hiring: " + hiring + " Firing: " + firing + " Budget Allocation: " + budgetAllocation);
  }
}

class IT extends Department implements Operation{
  private String technology; 
  private int infrastructure;
  IT(String name, String budget, String technology, int infrastructure){
    super(name, budget);
    this.technology=technology;
    this.infrastructure=infrastructure;
  }
  public String getTechnology() {
    return technology;
  }
  public void setTechnology(String technology) {
    this.technology = technology;
  }
  public int getInfrastructure() {
    return infrastructure;
  }
  public void setInfrastructure(int infrastructure) {
    this.infrastructure = infrastructure;
  }
  public void performOperation(int hiring, int firing, int budgetAllocation) {
    System.out.println("Performing IT operation: " +"Hiring "+ hiring + " Firing: " + firing + " Budget Allocation: " + budgetAllocation);
}
}

interface Operation{
public void performOperation(int hiring, int firing, int budgetAllocation);
}

public class OrganisationManagement{
public static void main(String[] args){
Manager manager = new Manager("Fairoz", 21, 100000, "Development", "IT");
Developer developer = new Developer("Fairoz", 21, 80000, "Java", 3);
Marketing marketing = new Marketing("Marketing", "50000", 10, "Conferences");
IT it = new IT("IT", "100000", "Java", 50);
  System.out.println("Manager details: ");
System.out.println("Name: " + manager.getName());
System.out.println("Age: " + manager.getAge());
System.out.println("Salary: " + manager.getSalary());
System.out.println("Team: " + manager.getTeam());
System.out.println("Department: " + manager.getDepartment());
System.out.println();

System.out.println("Developer details: ");
System.out.println("Name: " + developer.getName());
System.out.println("Age: " + developer.getAge());
System.out.println("Salary: " + developer.getSalary());
System.out.println("Technology: " + developer.getTechnology());
System.out.println("Experience: " + developer.getExperience());
System.out.println();

System.out.println("Marketing details: ");
System.out.println("Name: " + marketing.getName());
System.out.println("Budget: " + marketing.getBudget());
System.out.println("Campaigns: " + marketing.getCampaigns());
System.out.println("Events: " + marketing.getEvents());
marketing.performOperation(5, 2, 10000);
System.out.println();

System.out.println("IT details: ");
System.out.println("Name: " + it.getName());
System.out.println("Budget: " + it.getBudget());
System.out.println("Technology: " + it.getTechnology());
System.out.println("Infrastructure: " + it.getInfrastructure());
it.performOperation(10, 3, 50000);
}
}
