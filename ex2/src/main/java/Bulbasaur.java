public class Bulbasaur {

   private int id;
   private int level;
   
   public Bulbasaur() {
      id = 1;
      level = 1;
   }
   public Bulbasaur(int id, int level) {
      this.id = id;
      this.level = level;
   }
   
   public void setLevel(int lv) {
      this.level = lv;
      if(level >= 16 && level <= 31)
         this.id = 2;
      if(level >= 32)
         this.id = 3;
   }
   
   public int getLevel() {
      return level;
   }
   
   public String getName() {
      if(id == 1)
         return "Bulbasaur";
      if(id == 2)
         return "Ivysaur";
      if(id == 3)
         return "Venusaur";
      return "";
   }
   
   public String toString() {
      return "Level: " + getLevel() + ", ID: " + getID();
   }
   
   public boolean equals(Bulbasaur other) {
      if(this.getLevel() == other.getLevel() && this.getID() == other.getID())
         return true;
      return false;
   }
   
   public Bulbasaur copy() {
      return new Bulbasaur(this.id, this.level);
   }
 
   public int getID() {
      return id;
   }
}
