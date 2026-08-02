# LJAAS10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Learn Coding on CodeChef

Print  **"Learn Coding on CodeChef"**  to the console.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T16:11:44.157Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/LJAAS10)