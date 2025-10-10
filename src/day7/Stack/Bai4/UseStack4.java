package day7.Stack.Bai4;

import java.util.Stack;

public class UseStack4 {
    private Stack<String> undoStack;
    private Stack<String> redoStack;
    private String text;

    public UseStack4(){
        this.undoStack = new Stack<String>();
        this.redoStack = new Stack<String>();
        this.text = "";
    }

    public void show(){
        System.out.println("Content current: " + this.text);
    }

    public void insert(String str){
        undoStack.push(str);
        text = text + str;
        redoStack.clear();
    }

    public void deleteLast(){
        if(text.isEmpty()){
            System.out.println("Null!");
        }
        undoStack.push(text);
        redoStack.clear();
        text = text.substring(0,text.length()-1);
    }

    public void replace(String str){
        undoStack.push(str);
        redoStack.clear();
        text = str;
    }

    public void undo(){
        if(undoStack.isEmpty()){
            System.out.println("No undo!");
        }
        redoStack.push(text);
        text = undoStack.pop();
    }

    public void redo(){
        if(redoStack.isEmpty()){
            System.out.println("No redo!");
        }
        undoStack.push(text);
        text = redoStack.pop();

    }
}
