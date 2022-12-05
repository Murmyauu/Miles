public class BonusMilesService {

    public int calculate(int cost) {
        int result;
        int oneMile = 20;
        if (cost > oneMile) {
            result = cost / oneMile;
        } else {
            result = 0;
        }
        return result;
    }
}
