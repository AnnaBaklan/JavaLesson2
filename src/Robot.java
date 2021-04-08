public class Robot implements Runable, Swimable {
    @Override
    public boolean run(int distance) {
        if (distance < 0) {
            System.out.println("Wrong distance!");
            return false;
        }
        System.out.println("Robot ran " + distance);
        return true;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < 0) {
            System.out.println("Wrong distance!");
            return false;
        }
        System.out.println("Robot swam " + distance);
        return true;
    }
}
