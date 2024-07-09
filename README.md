# Towers of Hanoi Solver

This Java program solves the Towers of Hanoi puzzle recursively and displays each move.

## Description

The Towers of Hanoi is a classic problem where you have three rods and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks stacked in ascending order of size on one rod, the smallest at the top, making a conical shape. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
- Only one disk can be moved at a time.
- Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
- No larger disk may be placed on top of a smaller disk.

## How It Works

The program uses a recursive approach to solve the Towers of Hanoi problem:
- The `hanoiCoz` method is a recursive function that takes four parameters: the number of disks (`diskSayisi`), and the labels for the source (`kaynak`), auxiliary (`yardımcı`), and target (`hedef`) rods.
- It recursively moves disks from the source rod to the target rod using the auxiliary rod when necessary.
- Each move is counted and printed out, showing the disk number and the rods involved.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/towers-of-hanoi.git
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Run the MainClass.java file to execute the Towers of Hanoi solver.

4. Adjust the diskSayisi, kaynakCubugu, yardımcıCubugu, and hedefCubugu variables in the main method to change the number of disks and rod labels as desired.

# Example Output
Running the program with diskSayisi=3 will output the following sequence of moves:

    1: Disk 1 A cubugundan C cubuguna tasindi
    2: Disk 2 A cubugundan B cubuguna tasindi
    3: Disk 1 C cubugundan B cubuguna tasindi
    4: Disk 3 A cubugundan C cubuguna tasindi
    5: Disk 1 B cubugundan A cubuguna tasindi
    6: Disk 2 B cubugundan C cubuguna tasindi
    7: Disk 1 A cubugundan C cubuguna tasindi

   
# Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your improvements.
