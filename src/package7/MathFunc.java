package package7;

import static java.lang.Math.pow;

public class MathFunc implements MathCalculable{

    @Override
    public double PI() {
        return 3.1415926535897932F;
    }

    @Override
    public double mod_i(double n, double i) {
        return pow(pow(n, 2) + pow(i, 2), 0.5);
    }

    @Override
    public double times(double n, double i, int t) {
        double t1 = n;
        double t2 = i;
        double o = 0;
        while (t > 1){
            o = t1;
            t1 = t1*n - t2*i;
            t2 = o*i + t2*n;
            t -= 1;
        }
        return pow(pow(t1, 2) + pow(t2, 2), 0.5);
    }
}
