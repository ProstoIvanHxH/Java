package sem2.n2.z1;


// Демонстрация работы цепочки
// Демонстрация работы цепочки
public class Main {
    public static void main(String[] args) {
        // Создаем обработчиков
        Manager call = new Callcenter();
        Manager manager = new SimplManager();
        Manager juri = new Jurisdiction();

        // Устанавливаем цепочку: junior -> senior -> director
        call.setNextManager(manager);
        manager.setNextManager(juri);

        // Запросы на одобрение разных сумм
        call.processRequest(new Problem(5, "skill issue"));   // Младший менеджер одобряет
        call.processRequest(new Problem(11, "my cridit doubled"));  // Старший менеджер одобряет
        call.processRequest(new Problem(55, "I just died")); // Директор одобряет
        call.processRequest(new Problem(999999, "putin")); // Превышает лимит – запрос отклонен
    }
}