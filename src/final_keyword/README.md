# Complete Guide to Java Final Keyword

## Usage

The `final` keyword in Java is used to restrict the user. The `final` keyword can be used with variables, methods, and classes.

### Final Class
A class declared as `final` cannot be extended. This means that you cannot create a subclass of a final class.
```java
public final class Animal {
    // Class code here
}

// This will cause an error
public class Dog extends Animal {
    // Class code here
}
```
**When**: Use this final keyword whenever you want your class to not be extended.  
**Use Case**: If I have a class that just has a bunch of values and constants that are used by other classes.

### Final Method
A method declared as `final` cannot be overridden. This means that you cannot create a subclass of a final class.
```java

public class Animal {
    public final void eat() {
        // Method code here
    }
}

public class Dog extends Animal {
    // This will cause an error
    public void eat() {
        // Method code here
    }
}
```
**When**: Use this final keyword whenever you want your method to not be overridden.
**Use Case**: If I have a method that is used by other classes and I don't want it to be changed.

### Final Variable
A variable declared as `final` cannot be changed. This means that you cannot reassign a value to a final variable.
```java
public class Animal {
    public final int legs = 4;
}

public class Dog extends Animal {
    // This will cause an error
    public void setLegs() {
        legs = 3;
    }
}
```

**When**: Use this final keyword whenever you want your variable to not be changed.
**Use Case**:
- If I have a variable used by other classes and I don't want it to be changed.
- Constants are often declared as `final` variables. 
- Static variables are often declared as `final` variables.
