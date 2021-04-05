import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Human> teamMates = new ArrayList<Human>();
    private String teamName;

    public Team(String teamName, List <Human> teamMates) {
        this.teamName = teamName;
        for (Human human: teamMates) {
            this.teamMates.add(human);
        }
    }

    public void getSuccessfulPlayers () {
        System.out.println("List of successful players in team:" + teamName);
        for (Human human: teamMates) {
            if (human.isSuccessOnDistance()) {
                System.out.println(human.toString());
            }
        }
    }
    public void getAllPlayers () {
        System.out.println("List of players in team:" + teamName);
        for (Human human: teamMates) {
            System.out.println(human.toString());
        }
    }


    public int getNumberOfPlayers() {
        return teamMates.size();
    }
}
