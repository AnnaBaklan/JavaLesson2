import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Course course = new Course();
    private static List<Jumpable> jumpers = new ArrayList<Jumpable>();;
    private static List<Runable> runners = new ArrayList<Runable>();
    private static List<Human> players = new ArrayList<Human>();

    public static void main(String[] args) {



        Human player1 = new Human("Alex", 100, 20);
        players.add(player1);
        Human player2 = new Human("Reid", 50, 5);
        players.add(player2);
        Human player3 = new Human("Morgan", 500, 60);
        players.add(player3);
        Human player4 = new Human("JJ", 300, 40);
        players.add(player4);

        for (Human human: players) {
            jumpers.add(human);
            runners.add(human);
        }

        Team carrots = new Team("Carrots", players);
        
        Course course = new Course();
        course.welcomeToShow();

        for (int i = 0; i < carrots.getNumberOfPlayers(); i++) {
            if (playCourse(i)) {
                players.get(i).setSuccessOnDistance(true);
            } else {
                players.get(i).setSuccessOnDistance(false);
            }

        }
        
        carrots.getSuccessfulPlayers();
        carrots.getAllPlayers();

    }


    public static boolean playCourse(int i) {
        for (CourseElement courseElement: course.getElements()) {
            if (courseElement.getElementType() == CourseElementTypes.TRACK) {
                if(!runners.get(i).run(courseElement.getSize())) {
                    return false;
                }
            } else if (!jumpers.get(i).jump(courseElement.getSize())) {
                return false;
            }
        }
        return true;
    }
}
