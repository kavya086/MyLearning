
void main() {
  double balance = 213.55;
  balance = withdraw(balance, 113);
  balance = deposit(balance, 0.45);
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
