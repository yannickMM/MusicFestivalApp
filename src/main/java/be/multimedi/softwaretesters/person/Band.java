package be.multimedi.softwaretesters.person;

import java.util.List;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Band {
    private String name;
    private List<Musician> members;

    public Band(String name, List<Musician> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Musician> getMembers() {
        return members;
    }

    public void setMembers(List<Musician> members) {
        this.members = members;
    }

    public void perform(){
        for (Musician member : members) {
            member.perform();
        }
    }
}
