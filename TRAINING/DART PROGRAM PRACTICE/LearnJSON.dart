import 'dart:convert';

void main() {

  var JSONstring = '{"Name":"Kavya","age":21,"city":"Salem"}'; //A String

  var JSONmap = jsonDecode(JSONstring); //jsonDecode converts String to Map(Dart Objects)
  print(JSONmap);
  print(JSONmap.runtimeType); //Map

  var Stringjson = jsonEncode(JSONmap);  //jsonEncode converts Map(Dart Objects) to String
  print(Stringjson);
  print(Stringjson.runtimeType); //String
  
}
