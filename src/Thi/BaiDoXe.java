package Thi;

public class BaiDoXe {
    private LinkedStack xeVao;
    private LinkedStack xeRa;

    public BaiDoXe() {
        this.xeRa = new LinkedStack();
        this.xeVao = new LinkedStack();
    }

    public void xeVaoBai(Oto oto){
        xeVao.push(oto);
        System.out.println(oto.getTenXe() + " đã vào bãi.");
    }

    public void xeRaBai(){
        if(xeVao.isEmpty()){
            System.out.println("Bãi xe trống.");
            return;
        }
        xeRa.push(xeVao.peek());
        System.out.println(xeVao.peek()+" đã ra khỏi bãi.");
        xeVao.pop();
    }

    public void xeDangTrongBai(){
        if(xeVao.isEmpty()){
            System.out.println("Trong bãi không có xe.");
            return;
        }
        xeVao.printStack();
    }

    public void xeDaRaBai(){
        if(xeRa.isEmpty()){
            System.out.println("Chưa có xe nào ra.");
        }
        xeRa.printStack();
    }
}
