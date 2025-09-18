class Student {
  String? name;
  int? age;
  String? city;
  // Student(String name, int age, String city) {
  //   this.name = name;   - used to distinguish between formal arguments and instance variables
  //   this.age = age;    
  //   this.city = city;
  //   this.showStudent();
  // }
  Student(this.name, this.age, this.city) {
    this.showStudent();  //used to call a method in the class
  }
  showStudent() {
    print("Name: ${this.name}");
    print("Age: ${this.age}");
    print("City: ${this.city}");
  }

  Student printName() {
    print("Name: ${this.name}");
    return this; //returns to the current object again, Used for method chaining
  }

  Student printAge() {
    print("Age: ${this.age}");
    return this;
  }

  Student printCity() {
    print("City: ${this.city}");
    return this;
  }

  Student.redirection():this("Kavya",21,"Slm"); // "this" is used as method in redirecting constructor
}

void main() {
  Student s = Student("KAVYA", 21, "Salem");
  s.printName().printAge().printCity();
}
