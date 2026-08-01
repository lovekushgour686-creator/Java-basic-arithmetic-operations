## Java Basic Arithmetic Operations 

Welcome to the **Java Basic Arithmetic Operations** repository! This repository contains a collection of foundational Java programs focused on 
basic mathematical calculations, formula evaluation, and operator usage.

---

## Program Catalog

| File Name | Program Description | Operational Logic |
| :--- | :--- | :--- |
| `program03.java` | Addition of Two Numbers | Uses the addition operator (`+`) to calculate the sum of two integer variables (`x + y`). |
| `program04.java` | Area of a Rectangle | Evaluates rectangle area geometry using the multiplication operator (`*`) via `length * width`. |
| `program05.java` | Swap Two Numbers (No 3rd Variable) | Swaps values in-place using addition and subtraction arithmetic (`a = a + b`, `b = a - b`, `a = a - b`). |
| `program06.java` | Even or Odd Number Checker | Uses the modulus operator (`%`) inside a decremental loop to test whether numbers are divisible by 2. |
| `program07.java` | Positive, Negative, or Zero Checker | Uses conditional `if-else if-else` branching to determine whether a user-entered integer is equal to zero, negative (`< 0`), or positive (`> 0`). |
| `program08.java` | Largest of Two Numbers | Evaluates relational comparison operators (`>`) on two user-input integers to identify and output the larger value. |
| `program09.java` | Simple Interest Calculator | Calculates simple interest using double-precision inputs via the standard formula `(principle * rate * time) / 100`. |
| `program10.java` | Celsius & Fahrenheit Temperature Converter | Performs bidirectional temperature scale conversions using arithmetic formula operations: `(C * 1.8) + 32` and `(5 * (F - 32)) / 9`. |
| `program11.java` | Average Marks Calculator | Stores user-defined subject marks in an array and computes the mean average dynamically by aggregating the total sum and dividing by the subject count (`s / d`). |
| `program12.java` | Prime Number Checker | Evaluates number primality through iterative divisibility checks using the modulo operator (`%`), terminating early if a non-trivial factor is encountered. |
| `program13.java` | Dynamic Array Input with Primality Verification | Accepts an array of numerical entries from user input[cite: 24] and evaluates the element count boundaries against prime divisibility criteria (`n % i == 0`)[cite: 24]. |
| `program14.java` | Linear Search in Array | Performs a linear scan over an integer array[cite: 25] to search for a target key `k`[cite: 25], updating a boolean flag `r` when the element is matched[cite: 25]. |
| `program15.java` | Array Index Search | Scans an array to find a key `k`[cite: 24] and tracks the target index `r`[cite: 24], defaulting to `-1` if the key is not present[cite: 24]. |
| `program16.java` | Element Occurrence Search | Iterates through an integer array to locate search key `k`[cite: 25] and assigns the last matched index to variable `r`[cite: 25]. |
| `program17.java` | Count Digits in an Integer | Counts total digits in an integer using continuous division by 10 (`n / 10`) inside a `while` loop[cite: 24], with zero-value safety checking[cite: 24]. |
| `program18.java` | Trailing Zeroes in Factorial ($N!$) | Calculates trailing zeroes in $N!$ efficiently by counting prime factors of 5 using integer division (`count += n / i`) across successive powers of 5[cite: 25]. |
| `program19.java` | Boolean Even or Odd Checker | Uses absolute value transformation (`Math.abs`) and standard modulo evaluation (`n % i == 0`) inside a boolean function returning `true` for even values and `false` for odd[cite: 23]. |
| `program20.java` | Perfect Number Verifier | Computes factor sums in $O(\sqrt{N})$ time using square root iteration bounds (`i * i <= n`), aggregating factor pairs (`i` and `n / i`) to check equality against $N$[cite: 24]. |
| `program21.java` | Armstrong Number Verifier | Dynamically counts digits via iterative division by 10 (`n /= 10`)[cite: 23] and checks if the sum of each digit raised to the total digit power (`Math.pow(r, digit)`) equals the original number[cite: 23]. |
| `program22.java` | Palindrome Number Verifier | Ignores sign using absolute values (`Math.abs(n)`)[cite: 24] and constructs the reversed integer via `(rev * 10) + (n % 10)`[cite: 24] to compare equality against the initial input[cite: 24]. |
| `program23.java` | GCD via Brute-Force Iteration | Iterates linearly from 2 up to $\min(a, b)$ checking simultaneous divisibility (`f % i == 0 && s % i == 0`)[cite: 23]. |
| `program24.java` | Optimized GCD via Euclidean Algorithm | Computes the Greatest Common Divisor in $O(\log(\min(a, b)))$ time complexity using continuous modulo swaps (`b = a % b`) until $b = 0$[cite: 24]. |
| `program25.java` | LCM via Euclidean Algorithm | Calculates the Least Common Multiple (LCM) by deriving the GCD through Euclidean modulo steps (`b = a % b`)[cite: 23] and using the relation $\text{LCM} = \frac{f \times s}{\text{GCD}}$[cite: 23]. |
| `program26.java` | Find Missing Element in Permutation | Sorts the input array using `Arrays.sort()`[cite: 24] and detects the missing integer from $1$ to $N$ by linearly comparing elements against an incremental expected value counter[cite: 24]. |
---

## 🛠️ How to Compile and Run

To run any of these programs locally on your system:

1. **Compile the Java File:**
   ```bash
   javac program03.java
