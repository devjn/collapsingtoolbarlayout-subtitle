package android.support.design.widget;

/**
 * Created by @author Jahongir on 29-Aug-17
 * devjn@jn-arts.com
 * MathUtils
 */
class MathUtils {

    static int constrain(int amount, int low, int high) {
        return (amount < low) ? low : ((amount > high) ? high : amount);
    }

    static float constrain(float amount, float low, float high) {
        return (amount < low) ? low : ((amount > high) ? high : amount);
    }
}
