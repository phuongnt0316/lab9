package bai1;

public class Main {
    public void phepTinh(ITinhToan phepTinh,float num1,float num2){
        phepTinh.doOperation(num1,num2);
    }
    public static void main(String[] args) {
        Main main=new Main();
        ImplOperationAdd add=new ImplOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        main.phepTinh(add,6,9);
        ImplOperatonSubtract sub=new ImplOperatonSubtract();
        sub.setAccuracy(IAccuracy.THREE_NUMBER);
        main.phepTinh(sub,9,6);
        ImplOperationMultiply mul=new ImplOperationMultiply();
        mul.setAccuracy(IAccuracy.FOUR_NUMBER);
        main.phepTinh(mul,3,3);

    }
}