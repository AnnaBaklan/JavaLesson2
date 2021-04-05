import java.util.ArrayList;
import java.util.List;

public class Course {

    private List<CourseElement> courseElements = new ArrayList<CourseElement>();
    private int currentCourseElement;

    public Course () {
        currentCourseElement = 0;

        Track track1 = new Track(30);
        Wall wall1 = new Wall(5);
        Track track2 = new Track(50);
        Wall wall2 = new Wall(10);
        Track track3 = new Track(100);
        Wall wall3 = new Wall(40);

        courseElements.add(track1);
        courseElements.add(wall1);
        courseElements.add(track2);
        courseElements.add(wall2);
        courseElements.add(track3);
        courseElements.add(wall3);
    }

    public CourseElement nextStep (Team team) {
        currentCourseElement++;
        return  courseElements.get(currentCourseElement-1);
    }

    public int getCourseNumberOfElements () {
        return courseElements.size();
    }

    public void welcomeToShow () {
        System.out.println("Lets do sport!");
    }

    public List<CourseElement> getElements () {
        return courseElements;
    }

}
