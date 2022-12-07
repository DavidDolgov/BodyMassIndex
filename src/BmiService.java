public class BmiService {

    public float calculate(float kg, float cm) {
        float x=(cm/100)*(cm/100);                       // для формулы переводим в метры и возводим в квадрат
        float result=kg/x;                              // формула ИМТ киллограммы делённые на метры в квадрате.
        return result;
    }
}
