package command.obj;

/**
 * @author Ccccz
 * @date 2020/6/30
 * @description
 */
public class Commander {
    private Artillery artillery;
    private AirMissile missile;
    private GroundForce groundForce;

    public Commander(Artillery artillery, AirMissile missile, GroundForce groundForce) {
        this.artillery = artillery;
        this.missile = missile;
        this.groundForce = groundForce;
    }

    public Artillery getArtillery() {
        return artillery;
    }

    public AirMissile getMissile() {
        return missile;
    }

    public GroundForce getGroundForce() {
        return groundForce;
    }
}
