package Week_1.Design_Patterns.Behavioral.CommandPatternExample;

public interface Command {
    void execute();
}









// Command Pattern encapsulates a request as an object, allowing you to parameterize clients with different requests.

// Advantages
// Decouples sender and receiver.
// Supports undo/redo operations.
// Easy to add new commands.
// Follows Open/Closed Principle.
// Real-World Examples
// TV Remote Control
// Home Automation Systems
// Menu Buttons in GUI Applications
// Task Scheduling Systems