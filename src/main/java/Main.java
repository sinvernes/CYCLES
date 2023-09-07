import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int vacation = service.calculate(10000, 3000, 20000);

        System.out.println("Отпуск " + vacation + " месяц(а/ев)");
    }
}
