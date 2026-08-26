# Java Foundations Notes

## Class
- A class is a blueprint. It lists all the values an object must have, but does not define those values.

## Overloading
- A constructor initializes a new object.
- If the request does not match the exact list of parameters, there will be an error.
- You can add multiple constructors, which allows Java to automatically choose the one that matches the parameter list of your object.
- This is called **overloading constructors**.

## Modifiers and Return Type
- **Private / Public:**
  - `private` means cannot be changed from other files.
  - `public` means can be accessed from other files.
- **Static:**
  - Refers to the class, not the object.

## Object Counter
- Set a `private static int` variable.
- At the end of the constructor, use `variable_name++` to add one.
- Have a getter method for the counter.
- Can print the count in `Main`.

## String.format
- Used to splice strings.
- Has placeholders for variables: e.g., `%s` for string, `%d` for int.
- `\n` adds a new line. Use `\n` for one new line, `\n\n` for a blank line.

## Ternary Operations
- More efficient way to use `if-else` statements.
- Useful for simple things like strings.
- Format: `condition ? value_if_true : value_if_false`
