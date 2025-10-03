package day7.Stack.Bai4;

import day7.Stack.Bai3.LinkedStack;

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
        System.out.println("Nội dung hiện tại: \"" + text + "\"");
    }

    public void insert(String str) {
        undoStack.push(text);
        redoStack.clear();
        text += str;
    }

    public void deleteLast() {
        if (text.isEmpty()) {
            System.out.println("Không có gì để xóa!");
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
            System.out.println("Không thể undo!");
            return;
        }
        redoStack.push(text);
        text = undoStack.pop();
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Không thể redo!");
            return;
        }
        undoStack.push(text);
        text = redoStack.pop();
    }
}
