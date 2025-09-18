import 'dart:collection'; // For LinkedHashSet and SplayTreeSet
import 'dart:math';       // For generating random numbers

void main() {
  // Using HashSet - unordered, fast insertion and lookup
  HashSet Hs = HashSet();
  var stopwatch = Stopwatch()..start(); // Start measuring time
  var random = List.generate(1000000, (_) => Random().nextInt(1000000)); // Generate 1M random integers
  for (var i = 0; i < 1000000; i++) {
    Hs.add(random[i]); // Insert into HashSet
  }
  stopwatch.stop(); //Stops measuring time
  var elapse = stopwatch.elapsed.inMilliseconds; //give the inbetween time
  print("$elapse ms");

  // Using default Set (actually LinkedHashSet in Dart)
  Set set = Set();
  var stopwatch2 = Stopwatch()..start(); // Start timing
  var random2 = List.generate(1000000, (_) => Random().nextInt(1000000)); // Generate 1M random numbers
  for (var i = 0; i < 1000000; i++) {
    set.add(random2[i]); // Insert into Set
  }
  stopwatch2.stop();
  var elapse2 = stopwatch2.elapsed.inMilliseconds;
  print("$elapse2 ms");

  // Using LinkedHashSet - insertion order is preserved
  LinkedHashSet LHS = LinkedHashSet();
  var stopwatch3 = Stopwatch()..start(); // Start timing
  var random3 = List.generate(1000000, (_) => Random().nextInt(1000000)); // Generate 1M random numbers
  for (var i = 0; i < 1000000; i++) {
    LHS.add(random3[i]); // Insert into LinkedHashSet
  }
  stopwatch3.stop();
  var elapse3 = stopwatch3.elapsed.inMilliseconds;
  print("$elapse3 ms");

  // Using SplayTreeSet - keeps elements sorted, so insertion is slower due to sorting overhead
  SplayTreeSet STS = SplayTreeSet();
  var stopwatch4 = Stopwatch()..start(); // Start timing
  var random4 = List.generate(1000000, (_) => Random().nextInt(1000000)); // Generate 1M random numbers
  for (var i = 0; i < 1000000; i++) {
    STS.add(random4[i]); // Insert into SplayTreeSet (sorted)
  }
  stopwatch4.stop();
  var elapse4 = stopwatch4.elapsed.inMilliseconds;
  print("$elapse4 ms");
}
