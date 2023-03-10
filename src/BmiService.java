public class BmiService {

    public float calculate(float kilograms, float centimeters) {
        float meters = (centimeters / 100) * (centimeters / 100);        // для формулы переводим в метры и возводим в квадрат
        float result = kilograms / meters;                              // формула ИМТ киллограммы делённые на метры в квадрате.
        return result;
    }
}
