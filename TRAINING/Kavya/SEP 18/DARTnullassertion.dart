void main() {
  
  String? name = "THIS IS A STRING";
  //var a = name.length;
  //The property 'length' can't be unconditionally accessed because the receiver can be 'null'.
  var a = name!.length; // ! gaurantees that, name will not be null. If it is null, it throws an Exception
  print(a);
  var b = name?.length; // ? cehcks if it is null, if it is null, it assigns null itself
  print(b);
}
