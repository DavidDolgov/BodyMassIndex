public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float weight = 100F;                            // вес в киллограммах
        float growth = 186F;                           // рост в сантиметрах
        float bMassIndex = service.calculate(weight, growth);

        System.out.println();
        System.out.println("Ваш индекс массы тела равен " + bMassIndex);
        System.out.println();
        System.out.println("Интерпритация индекса массы тела");

        if (bMassIndex < 18.5) {
            System.out.println("ИМТ < 18.5: Ниже нормального веса");
        } else {
            if (18.5 <= bMassIndex & bMassIndex < 25) {
                System.out.println("ИМТ >= 18.5 И < 25: Нормальный вес");
            } else {
                if (25 <= bMassIndex & bMassIndex < 30) {
                    System.out.println("ИМТ >= 25 И < 30: Избыточный вес");
                } else {
                    if (30 <= bMassIndex & bMassIndex < 35) {
                        System.out.println("ИМТ >= 30 И < 35: Ожирение 1 степени");
                    } else {
                        if (35 <= bMassIndex & bMassIndex < 40) {
                            System.out.println("ИМТ >= 35 И < 40: Ожирение 2 степени");
                        } else {
                            if (35 <= bMassIndex) {
                                System.out.println("ИМТ >= 40: Ожирение 3 степени");
                            }
                        }
                    }
                }
            }
        }
    }
}