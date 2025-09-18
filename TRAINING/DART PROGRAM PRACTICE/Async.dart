void main()
{
  print(asynchronized());
}
asynchronized() async 
{
  await print("Hi");
}