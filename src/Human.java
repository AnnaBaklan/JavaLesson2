public class Human implements Runable, Swimable, Jumpable {
    private int maxDistanceToRun;
    private int maxHeightToJump;
    private boolean isSuccessOnDistance;
    private String name;

    public Human(String name, int maxDistanceToRun, int maxHeightToJump) {
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxHeightToJump = maxHeightToJump;
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        if (distance < 0) {
            System.out.println("Wrong distance!");
            return false;
        } else if (distance > maxDistanceToRun) {
            return false;
        }
        return true;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < 0) {
            System.out.println("Wrong distance!");
            return false;
        }
        System.out.println("Human swam " + distance);
        return true;
    }

    public int getMaxDistanceToRun() {
        return maxDistanceToRun;
    }

    public int getMaxHeightToJump() {
        return maxHeightToJump;
    }

    @Override
    public boolean jump(int height) {
        if (height < 0) {
            System.out.println("Wrong height!");
            return false;
        } else if (height > maxHeightToJump) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return name;
    }

    public void setSuccessOnDistance (boolean isSuccess) {
        isSuccessOnDistance = isSuccess;
    }

    public boolean isSuccessOnDistance() {
        return isSuccessOnDistance;
    }
}
