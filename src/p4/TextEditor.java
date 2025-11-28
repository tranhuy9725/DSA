package p4;

import p4.LinkedStack;

public class TextEditor {
    private String text;
    private LinkedStack undoStack;
    private LinkedStack redoStack;

    public TextEditor() {
        this.text = "";
        this.undoStack = new LinkedStack();
        this.redoStack = new LinkedStack();
    }

    public void show() {
        System.out.println("Current content: \"" + text + "\"");
    }

    public void insert(String str) {
        undoStack.push(text);
        redoStack.clear();
        text += str;
    }

    public void deleteLast() {
        if (text.isEmpty()) {
            System.out.println("Nothing to delete!");
            return;
        }
        undoStack.push(text);
        redoStack.clear();
        text = text.substring(0, text.length() - 1);
    }

    public void replace(String str) {
        undoStack.push(text);
        redoStack.clear();
        text = str;
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("No undo!");
            return;
        }
        redoStack.push(text);
        text = undoStack.pop();
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("No redo!");
            return;
        }
        undoStack.push(text);
        text = redoStack.pop();
    }
}
