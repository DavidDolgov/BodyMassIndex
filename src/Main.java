public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float weight=102.3F;                            // вес в киллограммах
        float growth=186.45F;                           // рост в сантиметрах
        float bMi= service.calculate(weight,growth);

        System.out.println();
        System.out.println("Ваш индекс массы тела равен "+bMi);
        System.out.println();
        System.out.println("Интерпритация индекса массы тела");

        if(bMi<18.5) {
            System.out.println("ИМТ < 18.5: Ниже нормального веса");
        }else {
            if (18.5<=bMi & bMi<25) {
                System.out.println("ИМТ >= 18.5 И < 25: Нормальный вес");
            }else {
                if (25<=bMi & bMi<30) {
                    System.out.println("ИМТ >= 25 И < 30: Избыточный вес");
                }else {
                    if (30<=bMi & bMi<35){
                        System.out.println("ИМТ >= 30 И < 35: Ожирение 1 степени");
                    }else {
                        if(35<=bMi & bMi<40){
                            System.out.println("ИМТ >= 35 И < 40: Ожирение 2 степени");
                        }else {
                            if (35<=bMi){
                                System.out.println("ИМТ >= 40: Ожирение 3 степени");
                            }
                        }
                    }
                }
            }
        }
    }
}