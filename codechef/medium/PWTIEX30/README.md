# PWTIEX30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Salary Calculation

You need to calculate an employee's gross salary based on their basic salary.

- Basic Salary: The basic salary of the employee.
- HRA (House Rent Allowance): 10% of the basic salary.
- DA (Dearness Allowance): 5% of the basic salary.
- Gross Salary: The sum of basic salary, HRA, and DA.

 **Tasks:** 

- Define a function calculateSalary(double basicSalary) that: Takes the basic salary as a parameter. Returns the gross salary.
- In the main() method: Take the basic salary as input from the user. Call the function calculateSalary() and display the details.
### Sample 1:
Input
Output

```
30000
```

```
Employee Salary Details:
Basic Salary: 30000.0
HRA: 3000.0
DA: 1500.0
Gross Salary: 34500.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T16:11:14.250Z  

```java
import java.util.Scanner;

class EmployeeSalary {
    // Method to calculate the gross salary with return type
    public static double calculateSalary(double basicSalary , double HRA, double DA) {
        return basicSalary + HRA + DA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user for basic salary
        double basicSalary = scanner.nextDouble();
        
        // Calculate HRA and DA
        double HRA = 0.10 * basicSalary;
        double DA = 0.05 * basicSalary;
        
        double grossSalary = EmployeeSalary.calculateSalary(basicSalary, HRA , DA);
        // Displaying the details
        System.out.println("Employee Salary Details:");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + grossSalary);
        
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX30)