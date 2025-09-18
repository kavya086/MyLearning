import 'dart:convert';

void main()
{
  var jsonString='''{"Myself":{"Name":"Kavya","age":21,"city":"Salem"},
            "Father":{"Name":"Radha","age":48,"city":"Salem"},
             "Mother":{"Name":"Suresh","age":53,"city":"Salem"},
             "Brother":{"Name":"Sriram","age":26,"city":"Salem"}}''';
  var jsonmap=jsonDecode(jsonString);
  
  //Map myself=jsonmap['Myself'];

  for (var i in jsonmap.entries) {
    print(i.value['Name']);
  }
}