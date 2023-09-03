package oopExercise;

public class Ship {

    private int draft;
    private int crew;

    public Ship(int draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt(int draft, int crew) {
        return draft % crew > 20;
    }
}
