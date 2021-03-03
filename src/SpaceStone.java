public class SpaceStone implements IStone{

    /**
     * Used to change the location of person.
     * @param person
     */

    private String stoneLocation = "Earth";
    private static SpaceStone spaceStone = null;

    private SpaceStone(){

    }

    public static SpaceStone getSpaceStone(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
            spaceStone.setStoneLocation("Earth");
        }

        return spaceStone;
    }

    @Override
    public void special(Person person) {
        System.out.println("person is moving from " + person.getLocation() + " to " + this.stoneLocation);
        person.setLocation(this.stoneLocation);
    }

    public String getStoneLocation() {
        return stoneLocation;
    }

    public void setStoneLocation(String stoneLocation) {
        this.stoneLocation = stoneLocation;
    }
}
