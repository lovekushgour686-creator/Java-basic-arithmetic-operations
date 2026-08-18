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
| `program27.java` | Range Prime Numbers Generator | Finds all prime numbers within an inclusive range $[l, r]$ by filtering bounds (`Math.max(2, l)`) and testing trial division up to $\sqrt{i}$ (`j * j <= i`), storing matches in a dynamic `ArrayList`. |
| `program28.java` | Sum of Squares of First $N$ Natural Numbers | Computes $1^2 + 2^2 + \dots + n^2$ through an iterative loop using `Math.powExact(i, 2)` to safely prevent arithmetic overflow during exponentiation. |
| `program29.java` | Sum of Cubes of First $N$ Natural Numbers | Computes $1^3 + 2^3 + \dots + n^3$ through a `while` loop using `Math.powExact(i, 3)` to evaluate cubic power sums[cite: 22]. |
| `program30.java` | Digital Root Calculator | Computes the recursive sum of digits until reaching a single digit using an initial digit summation followed by digital root modulo arithmetic (`sum % 9`)[cite: 21]. |
| `program31.java` | Perfect Square Verifier | Determines if an integer $N$ is a perfect square by testing trial roots bounded by $i \cdot i \le N$ using `Math.powExact(i, 2)` comparison[cite: 20]. |
| `program32.java` | Range Perfect Cubes Generator | Scans an inclusive integer range $[a, b]$[cite: 21], computes integer cube roots via `Math.cbrt(i)`[cite: 21], and verifies perfect cubes using `Math.powExact(cubeRoot, 3) == i`[cite: 21] to populate an `ArrayList`[cite: 21]. |
| `program33.java` | $N$-th Tribonacci Number Calculator | Calculates $T_n$ using dynamic three-variable tracking (`d = a + b + c`) inside an iterative loop[cite: 22], where each term is defined as $T_n = T_{n-1} + T_{n-2} + T_{n-3}$ with initial seeds $T_0=0, T_1=1, T_2=1$[cite: 22]. |
| `program34.java` | Disarium Number Verifier | Determines if a number is Disarium by counting total digits[cite: 23], then processing digits right-to-left while calculating `Math.powExact(r, count)`[cite: 23] with a decrementing positional power[cite: 23] to compare against the initial input[cite: 23]. |
| `program35.java` | Rightmost Non-Zero Digit in Array Product | Computes the product of array elements while stripping trailing zeroes (`p /= 10`)[cite: 24] and applying modulo bounds (`p %= 1000000`)[cite: 24] to isolate the rightmost non-zero digit[cite: 24]. |
| `program36.java` | Convert Zeroes to Fives | Replaces all zeroes in an integer $N$ with 5s by extracting digits right-to-left[cite: 17], substituting zeroes (`rev == 0 ? 5 : rev`)[cite: 17], and reversing the extracted digits back to their original sequence[cite: 17]. |
| `program37.java` | Spy Number Verifier | Extracts individual digits using modulo operations (`num % 10`)[cite: 18] inside a `while` loop[cite: 18] to simultaneously compute digit sum (`s`)[cite: 18] and digit product (`p`)[cite: 18], verifying whether `s == p`[cite: 18]. |
| `program38.java` | Numbers Containing Specific Digit Generator | Scans values from $0$ to $N$[cite: 19], extracting digits via modulo division (`j % 10 == d`)[cite: 19] inside a nested loop to identify numbers containing digit $d$[cite: 19] and storing matches in an `ArrayList`[cite: 19]. |
| `program39.java` | Prime Factorization Generator | Extracts all prime factors of integer $N$ by first stripping factor 2 (`num % 2 == 0`)[cite: 20], trial dividing odd numbers up to $\sqrt{N}$ (`i * i <= num`)[cite: 20], and appending any remaining prime tail[cite: 20] to an `ArrayList`[cite: 20]. |
| `program40.java` | Prime Numbers Counter Up To $N$ | Counts total prime numbers from 2 up to $N$[cite: 21] using nested loops with trial division up to $\sqrt{i}$ (`j * j <= i`)[cite: 21], incrementing a counter whenever a prime number is confirmed[cite: 21]. |
| `program40.java` | Prime Numbers Counter Up To $N$ | Counts total prime numbers from 2 up to $N$[cite: 21] using nested loops with trial division up to $\sqrt{i}$ (`j * j <= i`)[cite: 21], incrementing a counter whenever a prime number is confirmed[cite: 21]. |
-
---

## 🛠️ How to Compile and Run

To run any of these programs locally on your system:

1. **Compile the Java File:**
   ```bash
   javac program03.java
