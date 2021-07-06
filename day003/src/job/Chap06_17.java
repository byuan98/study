package job;

public class Chap06_17 {

    public static void main(String[] args) {

    }

}

abstract class Role {
    private String name;

    abstract public int attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Magicer extends Role {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0 && level <= 10) {
            this.level = level;
        } else {
            System.out.println("等级无效");
        }

    }

    public int attack() {
        return this.level * 5;
    }
}

class Soldier extends Role {
    private int hurt;

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public int attack() {
        return hurt;
    }
}

class Team {
    private Role[] role = new Role[6];

    public Role[] getRole() {
        return role;
    }

    public void setRole(Role[] role) {
        this.role = role;
    }

    void addMember(Role role) {
        for (int index = 0; index < this.role.length; index++) {
            if (this.role[5] != null) {
                System.out.println("队伍已满员");
                return;
            }
            if (this.role[index] == null) {
                this.role[index] = role;
            }
        }
    }

    int attackSum() {
        int sum = 0;
        for (Role r : this.role) {
            sum += r.attack();
        }
        return sum;
    }

}
