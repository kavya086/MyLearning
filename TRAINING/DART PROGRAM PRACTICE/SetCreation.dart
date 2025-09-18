void main()
{
  var s =<int>{};
  print(s.runtimeType);

  //By Empty Set
  Set set={};
  set.add({1,2,3,4});

  //By Literal:
  var set1={1,2,3,4};
  Set<int> set2={1,2,3,4};

  //By Set Constructor
  Set set3=Set();
  set3={1,2,3,4};

  //By unmodifiable
  Set set4=Set.unmodifiable([1,2,3,4]);

  //Using from
  var list=[1,2,3,4];
  var set5=Set.from(list);

  //Using of
  var set6=Set.of([1,2,3,4]);
  
  //By toSet()
  var set7=list.toSet();

  //By spread operator
  var set8={9,8,7,6,...list};

  print(set1);
  print(set2);
  print(set3);
  print(set4);
  print(set5);
  print(set6);
  print(set7);
  print(set8);
}


/*OUTPUT:

{1, 2, 3, 4}
{1, 2, 3, 4}
{1, 2, 3}
{1, 2, 3, 4}
{1, 2, 3, 4}
{1, 2, 3, 4}
{1, 2, 3, 4}
{9, 8, 7, 6, 1, 2, 3, 4}*/