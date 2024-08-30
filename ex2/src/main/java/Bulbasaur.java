public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        this.level = lv;
        if(level >= 16 && level =< 31
            this.id = 2;
        if(level >= 32
            this.od = 3;

    }

    // getLevel method
    public int getLevel() {
        return level;
    }

    // getName method
    public String getName() {
        if(id == 1)
            return "Bulbasaur";
        if(id == 2)
            return "Ivysaur";
        if(id == 3)
            return "Venusaur";

    }

    // getID method
    public int getID() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        return "Level: " + getLevel() + ", ID " + id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if(this.getLevel() == other.getLevel && this.getID() == other.getID)
         return true;
      return false;
    }

    // copy method
    public Bulbasaur copy() {
        return new Bulbasaur(this.id, this.level);
    }
}
