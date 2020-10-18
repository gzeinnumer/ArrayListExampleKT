# ArrayListExampleKT

[Looping](https://kotlinlang.org/docs/tutorials/kotlin-for-py/loops.html)

#### ArrayList
- Available `add`
```kotlin
val list: MutableList<String> = mutableListOf()
list.add("Add1")
```
```kotlin
var listNumbers: MutableList<Int> = mutableListOf(10, 15, 20)
// Result: 10, 15, 20

listNumbers.add(1000)
// Result: 10, 15, 20, 1000

listNumbers.add(1, 250)
// Result: 10, 250, 15, 20, 1000

listNumbers.removeAt(0)
// Result: 250, 15, 20, 1000

listNumbers.remove(20)
// Result: 250, 15, 1000
```
```kotlin
var list1 = ArrayList<Int>()
var list2  = list1.toMutableList()
list2.add(1)
```
```kotlin
val list = arrayListOf("list items here")
list.add("what you want to add")
```
```kotlin
val list = arrayListOf<String>()
list.add("Item 1")
list.add("Item 2")
```

- Not Available `add`
```kotlin
val list = listOf("orange", "apple")
list.toMutableList().add("grape")

val list_1 = listOf("orange", "apple")
val list_2 = listOf("banana", "strawberry")
val newList = list_1 + list_2 // [orange, apple, banana, strawberry]
```

####

#### Looping
- Kotlin
```kotlin
val list = listOf("orange", "apple")

for(i in list){
    Log.d(TAG, "looping: $i")
}

for ((index, value) in list.withIndex()) {
    println("$index: $value")
}

outer@ for (n in 2..100) {
    for (d in 2 until n) {
        if (n % d == 0) continue@outer
    }
    println("$n is prime")
}
```
```kotlin
for (x in 0..10) println(x) // Prints 0 through 10 (inclusive)

for (x in 0 until 10) println(x) // Prints 0 through 9

for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8

val numbers = (0..9).toList()
```
- Java
```java
ArrayList<String> list = new ArrayList<>();

list.add("Data 1");
list.add("Data 2");

for (String d: list){
    Log.d(TAG, "looping: "+d);
}
```

---

```
Copyright 2020 M. Fadli Zein
```