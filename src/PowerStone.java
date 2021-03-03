/**
 * @author DAC
 *
 * Concrete implementation of the IStone class.
 * This class will raise the Power of a Person.
 *
 */

public class PowerStone implements IStone {
    private final Integer RAISE_POWER = 2;
    private static PowerStone powerStone = null;

    private PowerStone(){

    };

    public static PowerStone getPowerStone(){

        if(powerStone == null){
            powerStone = new PowerStone();
            //do any setup necessary to use the object
        }

        return powerStone;
    }

    @Override
    public void special(Person person) {
        System.out.println("Powering UP!");
        System.out.println("Current power " + person.getPower());
        Integer power = person.getPower();
        power = power * RAISE_POWER;
        person.setPower(power);
        System.out.println("New power " + person.getPower());
    }
}
