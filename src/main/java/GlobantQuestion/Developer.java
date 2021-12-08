package GlobantQuestion;

public class Developer {

    private String name;
    private Long turnover;

    Developer(String name, Long turnover) {
        this.name = name;
        this.turnover = turnover;
    }

    public String getName() {
        return this.name;
    }

    public Long getTurnover() {
        return this.turnover;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTurnover(Long turnover) {
        this.turnover = turnover;
    }
}
