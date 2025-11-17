# Problem Set: Arrays

## Spec

For this problem set, you'll write 3 programs. The goal is to practice using
arrays to solve problems.

**Constraints**

- No imports allowed.

### LoadedDieSimulation with Arrays

In problem set 3, you wrote a
[program called `LoadedDieSimulation.java`](https://github.com/northridge-dev/csf-ps-conditionals-loops/blob/main/README.md#loadeddiesimulation)
and were told **not** to use arrays. For this problem, refactor your solution
but _use arrays to keep track of the counts_. The output should be the same.

### Card Collector

Together we created a program that builds a deck of cards and chooses cards
randomly. With that program as a starting point, write a program
`CardCollector.java` to answer the following questions:

- On average, how many cards must you draw from a standard 52-card deck before
  you have drawn at least one card of each suit...
- On average, how many cards must you draw from a standard 52-card deck before
  you have drawn at least one of each rank (2, 3, 4, ..., 10, Jack, Queen, King,
  Ace)?

Your program should take a single integer input `trials` and print:

- on the first line, the average number of cards drawn to collect all four suits
- on the second line, the average number of cards drawn to collect all thirteen
  ranks

HINT: As we originally implemented the deck-building code, each card is a single
string with both the suit and rank. That string includes some hard-to-processes
characters. Maybe you can change the representation of each card to make it
easier to use arrays to track what cards you've seen.

BONUS: write a program `CardCollectorBonus.java` that "proves" that the average
number of cards needed to get all the suits or all the ranks is greater with
replacement than without replacement.

### Birthday Problem

Suppose that people enter a room one at a time. How many people must enter until
two share a birthday? Write a program `Birthday.java` that takes one integer
command-line argument `trials` and performs the following experiment, `trials`
times:

Choose a birthday for the next person, uniformly at random between 0 and 365
(each day of the year -- including leap day -- can be represented as an integer
between 0 and 365). Have that person enter the room. If that person shares a
birthday with someone else in the room, stop; otherwise repeat. In each
experiment, count the number of people that enter the room.

Print two numbers, one per line:

- The average number of people that entered the room across all trials.
- The number of people that must enter the room before there is at least a 50%
  chance that two people share a birthday. (If the second person had a 1% chance
  of sharing a birthday and the third person a 2% chance, you would say that the
  there was a 3% chance of a shared birthday after the third person enters the
  room.)

## How To...

### Compile

For example, `javac <ClassName>.java`. If the compiler succeeds, it will produce
a new file, `<ClassName>.class`.

### Execute Compiled Programs

For example, `java <ClassName> [args...]`.

### Run Test Suites

From the root of the problem set, run the `run-tests` shell script:
`./run-tests.sh`.

### Submit the Problem Set

1. **Stage** your changes: `git add .` from the root directory. (You can instead
   use the VS Code source control tool.)
2. **Commit** your changes with a commit message:
   `git commit -m "completed problem set"`
3. **Push** your changes to your repository: `git push`.
4. Navigate to your assignment repository and verify that your commits have been
   added.
   - When your repository is created, GitHub will create a _pull request_. This
     is where I will leave feedback.
