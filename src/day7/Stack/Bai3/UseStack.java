package day7.Stack.Bai3;

import java.util.Stack;

public class UseStack {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;
    public UseStack(String homePage){
        this.backStack = new Stack<>();
        this.forwardStack = new Stack<>();
        this.currentPage = homePage;
    }

    public void visit(String url){
        backStack.push(currentPage);
        forwardStack.clear();
        currentPage = url;
    }

    public void back(){
        if(backStack.isEmpty()){
            System.out.println("No page!");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
    }

    public void forward(){
        if(forwardStack.isEmpty()){
            System.out.println("No page!");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
    }

    public String getCurrentPage(){
        return currentPage;
    }
}
