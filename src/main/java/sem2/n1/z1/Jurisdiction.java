package sem2.n1.z1;

class Jurisdiction extends Manager {


    @Override
    protected boolean canSolve(Problem problem) {
        return problem.getDifficult()<=100;
    }

    @Override
    protected void solve(Problem problem) {
        System.out.println(problem.getDescription()+" is solved by juridiction");
    }
}
