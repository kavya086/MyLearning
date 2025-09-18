// void main()
// {
//   List list=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15];
//   var map=[MapEntry("Five", 5), MapEntry("six",6), MapEntry("eight",8)];
//   print(map.runtimeType);
//   var map2={MapEntry("Five", 5), MapEntry("six",6), MapEntry("eight",8)};
//   print(map2.runtimeType);
//   var map3=Map.fromEntries(map);
//   print(map3.runtimeType);
//   print(map3);
//   var map4=Map.fromIterable(list,key: (element) => element, value:(element) => element*element);
//   print(map4);
// }

// void main()
// {
//   List names=["Bobby","Sabita","Kanchana","Elizabeth","Jayalakshmi"];
//   var map=Map.fromIterable(names,key:(element) => element, value: (element) => element.length);
//   print(map);
// }

// void main()
// {
//   List numbers=[1,2,3,4,5,6,7,8,9,10];
//   Map map=Map.fromIterable(numbers,key:(i)=>i,value: (i) => i%2==0?"$i is Even \n":i%3==0?"$i is Divisible by 3 \n":"$i is Odd and not divisible by 3 \n");
//   print(map);
// }

void main()
{
  List list1=[1,2,3,4,5];
  var list2={"one","two","three","four","five"};
  Map map=Map.fromIterables(list1, list2);
  print(map);
}