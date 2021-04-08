
public class Track implements CourseElement {

    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public int getSize() {
        return distance;
    }

    @Override
    public CourseElementTypes getElementType() {
        return CourseElementTypes.TRACK;
    }
}
