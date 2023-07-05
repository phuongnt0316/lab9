package bai1;

public class ImplOperatonSubtract implements IAccuracy,ITinhToan{
    private int accuracy;
    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy=accuracy;
    }

    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\n");
        System.out.printf("Result Sub = %."+this.accuracy+"f",(num1-num2));
    }
}
