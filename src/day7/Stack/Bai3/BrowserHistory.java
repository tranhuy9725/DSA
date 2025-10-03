package day7.Stack.Bai3;



public class BrowserHistory {
    private LinkedStack backStack;
    private LinkedStack forwardStack;
    private String currentPage;

    public BrowserHistory(String homepage){
        this.backStack = new LinkedStack();
        this.forwardStack = new LinkedStack();
        this.currentPage = homepage;
    }

    public void visit(String url){
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
    }

    public void back(){
        if(backStack.isEmpty()){
            System.out.println("Không thể back, không có trang trước!");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Không thể forward, không có trang sau!");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
    }

    public String getCurrentPage() {
        return currentPage;
    }
}
