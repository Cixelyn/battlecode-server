package battlecode.world;

import battlecode.common.ComponentType;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotLevel;
import battlecode.common.WeaponController;
import battlecode.world.signal.AttackSignal;

public class Weapon extends BaseComponent implements WeaponController {

	public Weapon(ComponentType type, InternalRobot robot) {
		super(type,robot);
	}

	public void attackSquare(MapLocation loc, RobotLevel height) throws GameActionException {
		assertEquipped();
		assertInactive();
		assertNotNull(loc);
		assertNotNull(height);
		robot.addAction(new AttackSignal(robot,type,loc,height));
	}

}