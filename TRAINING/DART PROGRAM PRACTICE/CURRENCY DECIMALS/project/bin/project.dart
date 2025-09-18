
import 'package:decimal/decimal.dart';

void main() {
  Decimal balance = Decimal.parse('213.55');
  Decimal withdrawAmount = Decimal.parse('113.0');
  Decimal depositAmount = Decimal.parse('0.45');
  balance = withdraw(balance,withdrawAmount);
  balance = deposit(balance,depositAmount);
  showBalance(balance);
}

withdraw(balance, amount) {
  balance = balance - amount;
  print("WITHDRAWN : $amount");
  return balance;
}

deposit(balance, amount) {
  balance = balance + amount;
  print("DEPOSITED : $amount");
  return balance;
}

showBalance(balance) {
  print(balance);
}
