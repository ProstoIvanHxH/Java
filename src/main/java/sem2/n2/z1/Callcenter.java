package sem2.n2.z1;

// Конкретные обработчики
class Callcenter extends Manager {

    @Override
    protected boolean canSolve(Problem problem) {
        return problem.getDifficult()<=100;
    }

    @Override
    protected void solve(Problem problem) {
        System.out.println(problem.getDescription()+" is solved by call-center");
    }
}
