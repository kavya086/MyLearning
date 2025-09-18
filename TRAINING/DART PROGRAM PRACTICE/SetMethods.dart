void main()
{
  var list=[11,12,13,14];
  var set={1,2,3,4,5,6,7,8,9};
  print("The SET : $set");
  set.add(10);
  print("ADDED 10 : $set");
  set.addAll(list);
  print("ADDED 11,12,13,14 : $set");
  print("ELEMENT at 5: ${set.elementAt(5)}");
  set.remove(14);
  print("REMOVED 14: $set");
  set.removeAll(list);
  print("REMOVED 11,12,13: $set");
  set.removeWhere((i)=>i%2!=0);
  print("REMOVED WEHERE the element is odd $set");
  set.retainWhere((i)=>i%2==0);
  print("RETAINED WEHERE the element is EVEN $set");
  set.clear();
  print("SET IS EMPTIED: $set");

  var vibgyor={"voilet","indigo","blue","green","yellow","orange","red"};
  print(vibgyor);
  print(vibgyor.contains("black"));
  print(vibgyor.containsAll(["red","green","blue"]));
  print(vibgyor.isEmpty);
  print(vibgyor.isNotEmpty);
  print(vibgyor.length);
  print(vibgyor.runtimeType);
  print(vibgyor.first);
  print(vibgyor.last);
  print(vibgyor.any((i)=>i=="yellow"));
  print(vibgyor.every((p)=>p=="yellow"));

  var set2={5,10,15,20};
  print(set2);
  var set3=(set2.map((i)=>square(i))).toSet();
  print("MAPPED TO SQUARE() : $set3");

  var set4=(set2.where((i)=>i>10)).toSet();
  print("Elements greater than 10: $set4");

  var set5=vibgyor.expand((word)=>word.split(''));
  print(set5);
  


}
int square(i)
{
  return i*i;
}