# 🗣️Simple Word Spammer

This is a simple word copy and paster and uses the Java robot function to Ctrl + C and Ctrl + V

**➰Delay**
To Adjust the Delay of the Words being entered just change the amount of Milliseconds the delay bewteen loops using this line

```Thread.sleep(300);```

This now would be 0.3 Seconds.

**➿While Loop/Controls**
The While Loop Contains using a robot.keypress function like so...

```
while(true) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(300);
        }
```

👋~Thanks for looking at my new project~👋
