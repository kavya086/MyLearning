void main()
{
  Map map={1:"one",2:"two",3:"three"};
  for(var i in map.entries)
  {
    print(i.key);
    print(i.value);
  }

  map.forEach((key,value)=>print("$key $value"));

  for(var i=0;i<map.length;i++)
  {
    print(map.entries.toList()[i].key);
  }
}