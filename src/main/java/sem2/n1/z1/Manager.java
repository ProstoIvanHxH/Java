package sem2.n1.z1;


abstract class Manager {
    protected Manager nextManager; // Следующий обработчик в цепочке

    public void setNextManager(Manager nextManager) {
        this.nextManager = nextManager;
    }

    public void processRequest(Problem problem) {
        if (canSolve(problem)) {
            solve(problem);
        } else if (nextManager != null) {
            nextManager.processRequest(problem); // Передача запроса дальше
        } else {
            System.out.println(problem.getDescription()+" is too complex");
        }
    }

    protected abstract boolean canSolve(Problem problem); // Проверка лимита
    protected abstract void solve(Problem problem); // Логика одобрения
}