package objectOrientedProgramming;

public class Problem {
    private String name;
    private Type type;
    private Boolean isSolved;
public Problem(String name, Type type, Boolean status){
    this.name = name;
    this.type = type;
    this.isSolved = status;
}

    public void isProblemSolved(Boolean solved) {
    isSolved = true;
    }

    public Boolean solvedProblem() {
        return isSolved;
    }
}
