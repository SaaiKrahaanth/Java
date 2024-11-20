# Static Methods in Java

This project demonstrates the concept of **static methods** in Java, their usage, and the restrictions they come with.

## Key Concepts Covered
1. **Static Methods**:
   - Defined at the class level using the `static` keyword.
   - Can only interact with static variables and other static methods.
   - Cannot reference instance-specific (`non-static`) variables or methods directly.

2. **Static Variables**:
   - Belong to the class and are shared across all instances.
   - Useful for maintaining shared data.

3. **Restrictions**:
   - Static methods cannot use the `this` keyword.
   - They cannot directly interact with instance-specific (`non-static`) variables or methods.

---

## Code Example

```java
public class VendingMachine {
    // Static variables
    static int totalMoney = 1000; // Example value
    static int numATMs = 5;       // Example value

    // Non-static instance variable
    int money;

    // Static method to calculate and print average money
    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
        // Uncommenting the below line will cause an error:
        // System.out.println(this.money);
    }

    public static void main(String[] args) {
        // Call the static method using the class name
        VendingMachine.averageMoney();

        // Uncommenting below will cause an error:
        // System.out.println(this.money);
    }
}
