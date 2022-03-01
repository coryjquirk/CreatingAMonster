# CreatingAMonster
Java bootcamp exercise for classes, subclasses, constructors, and calling methods.

[Exercise instructions](https://docs.google.com/document/d/1Xnl0R38R8qeAYvZXix6Hv2vjm3ijdC28/edit)

## Explanation
- Super class `Monster` constructs a Monster with argument `String name` and a single method `attack()`.
- Child classes `FireMonster`, `WaterMonster`, and `StoneMonster` extend the class and add a more specialized message to the `attack()` method.
- `Runnable.java` declares new instances of objects with each Monster subclass, and runs attacks for each. 

## Usage
run `Runnable.java`

output:
```
Attack with fire!
Attack with stones!
Attack with stones!
Attack with stones!
!^_&amp;^$@+%$* I don't know how to attack
```
