public class Wall implements CourseElement {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getSize() {
        return height;
    }

    @Override
    public CourseElementTypes getElementType() {
        return CourseElementTypes.WALL;
    }
}
