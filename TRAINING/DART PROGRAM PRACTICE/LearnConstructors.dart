/*Default constructor
Private constructor
Named constructor
Factory constructor
Parameterized constructor
Redirecting constructor
Const constructor*/

class Student {
  String? name;
  int? age;
  Student._() //private constructor - Only accessible within this file
  {
    print("Private Constructor");
  }

  Student getStudent() //getters - to get the private constructor
  {
    return Student._();
  }

  Student() //default constructor
  {
    print("Default constructor");
    //return "Hi"; - Constructors cannot return any values
  }

  factory Student.return_default() {
    return Student(); //factory constructor can return any constructor
  }
  // Student(String name) - Constructor overloading is not supported in Dart instead use "NAMED CONSTRUCTORS"
  // {

  // }
  Student.named(String str) {
    print("$str I am Named Parameterized Constructor");
  }

  Student.initialize(this.name, this.age) {
    print("$name-$age");
  }
  Student.redirection(String name)
    : this.initialize(
        name,
        21,
      ); //Redirecting constructor: It can use this.any constructor , it will call that constructor.
}

void main() {
  Student s = Student(); //calls the default constructor
  Student.return_default();

  s.getStudent(); //calls the private constructor through getter method
  Student._(); //calls the private constructor directly
  
  Student.named("Hi");
  Student.redirection("Kavya");
  
  Student2 s2 = const Student2(1, 2); //const constructor
  Student2 s3 = const Student2(1, 2);
  print("${s2.hashCode} ${s3.hashCode}"); //Same reference for same values
}

class Student2 {
  final x; //all the fields of this class must be final
  final y;
  const Student2(
    this.x,
    this.y,
  ); //No body, can only be used to initialize the final variables
}
