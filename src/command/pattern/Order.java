package command.pattern;

import command.obj.AirMissile;
import command.obj.Artillery;
import command.obj.Commander;
import command.obj.GroundForce;

/**
 * @author zhicheng.zhang
 * @date 2020/6/30
 * @description
 */
public enum Order {
    ARTILLERY_COVER {
        @Override
        public void execute() {
            getCommander().getArtillery().cover();
        }
    },
    ARTILLERY_ATTACK {
        @Override
        public void execute() {
            getCommander().getArtillery().attack();
        }
    },

    FORCE_ATTACK {
        @Override
        public void execute() {
            getCommander().getGroundForce().attack();
        }
    },

    AIR_MISSILE_ATTACK {
        @Override
        public void execute() {
            getCommander().getMissile().attack();
        }
    };

    private Commander commander;

    Order() {
        this.commander = new Commander(new Artillery(), new AirMissile(), new GroundForce());
    }

    public Commander getCommander() {
        return commander;
    }

    public abstract void execute();
}
