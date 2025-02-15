package sem2.n2.z1;

class SimplManager extends Manager {


    @Override
    protected boolean canSolve(Problem problem) {
        return problem.getDifficult()<=50;
    }

    @Override
    protected void solve(Problem problem) {
        System.out.println(problem.getDescription()+" is solved by manager);
    }
}
