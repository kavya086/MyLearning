class Class1 {
  void display() {}
  void dis() {}
}

class Class2 implements Class1 {
  void display() {}
  dis() {}
}

void main() {
  Class2 c = Class2();
  c.display();
}
