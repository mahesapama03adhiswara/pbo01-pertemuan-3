package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDidompet = 50000;

        if (uangDidompet<totalBelanja){
            System.out.println("uang kurang , kurangi belanjaan anda");
        }else if (uangDidompet>totalBelanja){
            double angsulan = uangDidompet - totalBelanja;
            System.out.println("uang cukup , siipp + ini angsulan pian "+angsulan);
       }else{
            System.out.println("uang pass uy ...");
        }


    }
}
