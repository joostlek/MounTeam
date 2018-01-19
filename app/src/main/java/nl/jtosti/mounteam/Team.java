package nl.jtosti.mounteam;

/**
 * Created by joost on 18-1-18.
 */

public class Team {
    private int teamId;
    private String name;
    private User[] users;

    public Team(int teamId, String name, User[] users) {
        this.teamId = teamId;
        this.name = name;
        this.users = users;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
